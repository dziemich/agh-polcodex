package pl.kis.agh.compilers.parsing

import pl.kis.agh.compilers.polcodex.PolcodexLexer
import pl.kis.agh.compilers.polcodex.PolcodexParser
import pl.kis.agh.compilers.polcodex.PolcodexParser.*
import org.antlr.v4.runtime.*
import org.antlr.v4.runtime.atn.ATNConfigSet
import org.antlr.v4.runtime.dfa.DFA
import pl.kis.agh.compilers.ast.*
import java.io.ByteArrayInputStream
import java.io.File
import java.io.FileInputStream
import java.io.InputStream
import java.nio.charset.Charset
import java.util.*

data class AntlrParsingResult(val root : PolcodexFileContext?, val errors: List<Error>) {
    fun isCorrect() = errors.isEmpty() && root != null
}

data class ParsingResult(val root : SandyFile?, val errors: List<Error>) {
    fun isCorrect() = errors.isEmpty() && root != null
}

fun String.toStream(charset: Charset = Charsets.UTF_8) = ByteArrayInputStream(toByteArray(charset))

object AntrlParsingFacade {

    fun parse(code: String) : AntlrParsingResult =
        parse(code.toStream())

    fun parse(file: File) : AntlrParsingResult =
        parse(FileInputStream(file))

    fun parse(inputStream: InputStream) : AntlrParsingResult {
        val lexicalAndSyntaticErrors = LinkedList<Error>()
        val errorListener = object : ANTLRErrorListener {
            override fun reportAmbiguity(p0: Parser?, p1: DFA?, p2: Int, p3: Int, p4: Boolean, p5: BitSet?, p6: ATNConfigSet?) {
                // Ignored for now
            }

            override fun reportAttemptingFullContext(p0: Parser?, p1: DFA?, p2: Int, p3: Int, p4: BitSet?, p5: ATNConfigSet?) {
                // Ignored for now
            }

            override fun syntaxError(recognizer: Recognizer<*, *>?, offendingSymbol: Any?, line: Int, charPositionInline: Int, msg: String, ex: RecognitionException?) {
                lexicalAndSyntaticErrors.add(
                    Error(
                        msg,
                        Point(line, charPositionInline)
                    )
                )
            }

            override fun reportContextSensitivity(p0: Parser?, p1: DFA?, p2: Int, p3: Int, p4: Int, p5: ATNConfigSet?) {
                // Ignored for now
            }
        }

        val lexer = PolcodexLexer(ANTLRInputStream(inputStream))
        lexer.removeErrorListeners()
        lexer.addErrorListener(errorListener)
        val parser = PolcodexParser(CommonTokenStream(lexer))
        parser.removeErrorListeners()
        parser.addErrorListener(errorListener)
        val antlrRoot = parser.polcodexFile()
        return AntlrParsingResult(antlrRoot, lexicalAndSyntaticErrors)
    }

}

object ParsingFacade {

    fun parse(code: String) : ParsingResult =
        parse(code.toStream())

    fun parse(file: File) : ParsingResult =
        parse(FileInputStream(file))

    fun parse(inputStream: InputStream) : ParsingResult {
        val antlrParsingResult =
            AntrlParsingFacade.parse(inputStream)
        val lexicalAnsSyntaticErrors = antlrParsingResult.errors
        val antlrRoot = antlrParsingResult.root
        val astRoot = if (lexicalAnsSyntaticErrors.isEmpty()) {antlrRoot?.toAst(considerPosition = true) } else { null }
        val semanticErrors = astRoot?.validate() ?: emptyList()
        return ParsingResult(
            astRoot,
            lexicalAnsSyntaticErrors + semanticErrors
        )
    }

}
