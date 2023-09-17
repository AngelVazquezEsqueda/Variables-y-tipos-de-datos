fun main() {
    //Tipo de variable 
    var angelv = 11 //Se detecta como (Int)
    println(angelv)
    
    // Volver flotante a la variable decimal 
    var daniel: Float = angelv.toFloat()
    println(daniel)
    
    //Declarando la variable constante pi y multiplicarla 2 veces
    val pi = Math.PI
    var perimetro: Double = daniel * pi 
    println("El perimetro del circulo es: $perimetro")
}
