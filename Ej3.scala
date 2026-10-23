object Ej3 {

  def transformar[A, B](valor: A, funcion: A => B): B = funcion(valor)

  def main(args: Array[String]): Unit = {

    val texto: String = transformar(42, (n: Int) => s"Número: $n")

    val longitud: Int = transformar("Scala", (s: String) => s.length)

    val esMayor: Boolean = transformar(3.7, (d: Double) => d > 3.0)

    println(texto)
    println(longitud)
    println(esMayor)
  }
}