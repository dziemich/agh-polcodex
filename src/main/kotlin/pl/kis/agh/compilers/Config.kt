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

enum class CompareSign private constructor(val opcode: Int) {
  EQUAL(Opcodes.IFEQ),
  NOT_EQUAL(Opcodes.IFNE),
  LESS(Opcodes.IFLT),
  GREATER(Opcodes.IFGT),

}

enum class Types private constructor(private val t: String){
  NUMBER("D"),
  VOID("V")
}
