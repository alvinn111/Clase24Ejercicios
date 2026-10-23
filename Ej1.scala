class Caja[A](val contenido: A) {

  def obtener: A = contenido

  def combinar[B](otro: B): (A, B) = (contenido, otro)
}

object Ej1 {

  def main(args: Array[String]): Unit = {

    val cajaInt = new Caja[Int](10)
    val cajaString = new Caja[String]("Scala")
    val cajaBoolean = new Caja[Boolean](true)

    println(cajaInt.obtener)
    println(cajaInt.combinar("hola"))

    println(cajaString.obtener)
    println(cajaString.combinar(3.5))

    println(cajaBoolean.obtener)
    println(cajaBoolean.combinar(20))
  }
}