// Diego Fabián Morales Dávila
// Carné: 23267
// Última modificación: 22/07/24

data class Person(val name: String, val age: Int, val gender: String)
data class Student(val name: String, val age: Int, val gender: String, val studentId: String)


fun main() {
    
    // Ejercicio 1.
 	val numbers = listOf(1, 2, 3, 4, 5, 8, 11, 22, 23, 25)
    val result = calculateMedia(numbers).toDouble()
    println(result / numbers.size)
    
    // Ejercicio 2.
    val numbers2 = listOf(1, 2, 3, 4, 5, 8, 11, 22, 23, 25)
    println(numbers2.filter{it % 2 != 0})
    
    // Ejercicio 3.
    println(isPalindrome("alla"))
    
    // Ejercicio 4.
    val nombres = listOf("Ian", "Manuel", "Oswaldo", "Olivier", "Penelope")
    println(nombres.map{ "¡Hola, $it!"})
    
    // Ejercicio 5.
    println(performOperation(2,3))
    
    // Ejercicio 6.
    val Persona1: Person = Person(name = "Jose Pablo", age = 12, gender = "Masculino")
    //println(mapeo(Persona1))
    mapeo(Persona1)
    
	
}

// Utilizar función 'Reducción' para sumar los números de la lista. Luego, dividir entre la cantidad de elementos al hacer la llamada a la función.
fun calculateMedia(numbers: List<Int>): Int {
	return numbers.reduce { acc, num -> acc + num }
}

// Función compacta para retornar el valor booleano comparando si la cadena es igual al derecho y al revés.
fun isPalindrome(palabra: String): Boolean = palabra == palabra.reversed()

// Función que utiliza un parámtro lambda para sumar dos números enteros.
fun performOperation(entero1: Int, entero2: Int, sum: (Int, Int) -> Int = {a, b -> a + b}): Int{
    return sum(entero1, entero2)
}

// Mapeo recibe un objeto de tipo 'Person' y se crea el nuevo objeto 'Student' con la información de la persona.
fun mapeo(Persona: Person){
    val Student1: Student = Student(name = Persona.name, age = Persona.age, gender = Persona.gender, studentId = Persona.name.replace(" ", "")+"-${Persona.age}")
    println(Student1)
    println("El Estudiante ${Persona.name} tiene ${Persona.age} años.")
    
}
	
