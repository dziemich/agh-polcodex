package pl.kis.agh.compilers.ast

import pl.kis.agh.compilers.parsing.ParsingFacade
import kotlin.test.assertEquals
import org.junit.Test as test

class ValidationTest {

    @test fun duplicateVar() {
        val errors = ParsingFacade.parse("""var a = 1
                                               |var a =2""".trimMargin("|")).errors
        assertEquals(listOf(
          Error(
            "A variable named 'a' has been already declared at Line 1, Column 0",
            Point(2, 0)
          )
        ), errors)
    }

    @test fun unexistingVarReference() {
        val errors = ParsingFacade.parse("var a = b + 2").errors
        assertEquals(listOf(
          Error(
            "There is no variable named 'b'",
            Point(1, 8)
          )
        ), errors)
    }

    @test fun varReferenceBeforeDeclaration() {
        val errors = ParsingFacade.parse("""var a = b + 2
                                               |var b = 2""".trimMargin("|")).errors
        assertEquals(listOf(
          Error(
            "You cannot refer to variable 'b' before its declaration",
            Point(1, 8)
          )
        ), errors)
    }

    @test fun unexistingVarAssignment() {
        val errors = ParsingFacade.parse("a = 3").errors
        assertEquals(listOf(
          Error(
            "There is no variable named 'a'",
            Point(1, 0)
          )
        ), errors)
    }

    @test fun varAssignmentBeforeDeclaration() {
        val errors = ParsingFacade.parse("""a = 1
                                               |var a =2""".trimMargin("|")).errors
        assertEquals(listOf(
          Error(
            "You cannot refer to variable 'a' before its declaration",
            Point(1, 0)
          )
        ), errors)

    }

}
