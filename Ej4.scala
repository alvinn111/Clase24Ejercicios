abstract class Vehiculo(val marca: String)

class Automovil(marca: String) extends Vehiculo(marca)

class Motocicleta(marca: String) extends Vehiculo(marca)

class RegistroVehiculo[A <: Vehiculo](val vehiculo: A)

object Ej4 {

  def main(args: Array[String]): Unit = {

    val registroAuto = new RegistroVehiculo[Automovil](new Automovil("Toyota"))

    val registroMoto = new RegistroVehiculo[Motocicleta](new Motocicleta("Honda"))

    println(registroAuto.vehiculo.marca)
    println(registroMoto.vehiculo.marca)
  }
}