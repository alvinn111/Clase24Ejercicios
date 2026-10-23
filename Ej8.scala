class Persona(val nombre: String)

class Resultado[A](val valor: A, val exitoso: Boolean, val mensaje: String
)

object Ej8 {

  def main(args: Array[String]): Unit = {

    val resultadoInt = new Resultado[Int](42, true, "Cálculo exitoso")

    val resultadoString = new Resultado[String]("Hola", true, "Texto obtenido")

    val resultadoPersona = new Resultado[Persona](new Persona("Ana"), false, "Persona no verificada")

    println(s"${resultadoInt.valor} - ${resultadoInt.exitoso} - ${resultadoInt.mensaje}")
    println(s"${resultadoString.valor} - ${resultadoString.exitoso} - ${resultadoString.mensaje}")
    println(s"${resultadoPersona.valor.nombre} - ${resultadoPersona.exitoso} - ${resultadoPersona.mensaje}")
  }
}