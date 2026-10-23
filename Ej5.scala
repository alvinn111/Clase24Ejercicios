object Ej5 {

  abstract class Animal(val nombre: String)

  class Perro(nombre: String) extends Animal(nombre)

  class Contenedor[+A](val valor: A)

  def main(args: Array[String]): Unit = {

    val contenedorPerro: Contenedor[Perro] = new Contenedor[Perro](new Perro("Firulais"))

    val contenedorAnimal: Contenedor[Animal] = contenedorPerro

    println(contenedorAnimal.valor.nombre)
  }
}