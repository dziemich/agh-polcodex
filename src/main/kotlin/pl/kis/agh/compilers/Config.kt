package pl.kis.agh.compilers

import org.objectweb.asm.Opcodes
import java.util.*


object Config {
  const val ADD: String = "ILE_TO_RAZEM_BENDZIE"
  const val SUB: String = "ODEJMNIJ_MIE_TO"
  const val MUL: String = "TABLICZKA_MNOZENIA_PROSZE"
  const val DIV: String = "PODZIEL_MIE_TO"

  const val EQUAL: String = "SOM_TAKIE_SAME"
  const val NOTEQUAL: String = "SOM_ROZNE"
  const val GREATER: String = "WINCYJ_NIZ"
  const val LOWER: String = "MNIJ_NIZ"
}

enum class CompareSign private constructor(private val sign: String, val opcode: Int) {
  EQUAL("==", Opcodes.IFEQ),
  NOT_EQUAL("!=", Opcodes.IFNE),
  LESS("<", Opcodes.IFLT),
  GREATER(">", Opcodes.IFGT),
  LESS_OR_EQUAL("<=", Opcodes.IFLE),
  GRATER_OR_EQAL(">=", Opcodes.IFGE);


  companion object {
    fun fromString(sign: String): CompareSign {
      return Arrays.stream(values()).filter { cmpSign -> cmpSign.sign == sign }
        .findFirst()
        .orElseThrow { RuntimeException("Sign not implemented") }
    }
  }
}
