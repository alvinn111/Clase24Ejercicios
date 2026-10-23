object Ej6 {

  abstract class Animal(
    val nombre: String
  )

  class Perro(
    nombre: String
  ) extends Animal(nombre)

  trait Procesador[-A] {

    def procesar(
      valor: A
    ): String
  }

  class ProcesadorAnimal extends Procesador[Animal] {

    def procesar(valor: Animal): String =
      s"Procesando animal: ${valor.nombre}"
  }

  def main(args: Array[String]): Unit = {

    val procesadorPerro: Procesador[Perro] =
      new ProcesadorAnimal()

    println(procesadorPerro.procesar(new Perro("Rex")))
  }
}