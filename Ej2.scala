object Ej2 {

  def seleccionarPrimero[A](primero: A, segundo: A): A = primero

  def main(args: Array[String]): Unit = {

    println(seleccionarPrimero(1, 2))
    println(seleccionarPrimero("a", "b"))
    println(seleccionarPrimero(1.5, 2.5))
  }
}