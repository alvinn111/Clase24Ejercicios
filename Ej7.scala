object Ej7 {

  abstract class Animal(val nombre: String)

  class Perro(nombre: String) extends Animal(nombre)

  class Gato(nombre: String) extends Animal(nombre)

  trait Productor[+A] {
    def producir: A
  }

  trait Consumidor[-A] {
    def consumir(valor: A): String
  }

  class ProductorPerro extends Productor[Perro] {

    def producir: Perro = new Perro("Firulais")
  }

  class ProductorGato extends Productor[Gato] {

    def producir: Gato = new Gato("Misi")
  }

  class ConsumidorAnimal extends Consumidor[Animal] {

    def consumir(valor: Animal): String =
      s"Consumiendo animal: ${valor.nombre}"
  }

  def main(args: Array[String]): Unit = {

    val productorAnimal1: Productor[Animal] = new ProductorPerro()

    val productorAnimal2: Productor[Animal] = new ProductorGato()

    val consumidorPerro: Consumidor[Perro] = new ConsumidorAnimal()

    val consumidorGato: Consumidor[Gato] = new ConsumidorAnimal()

    println(productorAnimal1.producir.nombre)
    println(productorAnimal2.producir.nombre)

    println(consumidorPerro.consumir(new Perro("Rex")))
    println(consumidorGato.consumir(new Gato("Luna")))
  }
}