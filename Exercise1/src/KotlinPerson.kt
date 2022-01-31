import java.util.*

data class KotlinPerson(
    val id: Long,
    val title: String,
    val firstName: String,
    val surname: String,
    val dateOfBirth: Calendar?
) {

    var favouriteColour: String? = null

    fun getUppercaseColour(): String = favouriteColour?.uppercase() ?: ""

    fun getLastLetter(a: String) = a.takeLast(1)

    fun getLastLetterOfString(): String {
        return favouriteColour?.let { getLastLetter(it) } ?: ""
    }

    fun getColourType(): String {
        val colour = getUppercaseColour()
        
        return when(colour) {
            "" -> "empty"
            "RED","GREEN","BLUE" -> "RGB"
            else -> "other"
        }
    }


    override fun toString(): String = "$title $firstName $surname"

    companion object {
        fun getAge(dateOfBirth: Calendar?): Int? {
            if (dateOfBirth == null)
                return null
            val today: Calendar = GregorianCalendar()
            val years: Int = today.get(Calendar.YEAR) - dateOfBirth.get(Calendar.YEAR)
            return if (dateOfBirth.get(Calendar.DAY_OF_YEAR) >= today.get(Calendar.YEAR)) {
                years - 1;
            } else {
                years;
            }
        }
    }

    val safeAge: Int
        get() = age ?: -1

    val age: Int?
        get() = getAge(this.dateOfBirth)
}

fun main() {
    val john: KotlinPerson = KotlinPerson(1L, "Mr", "John", "Blue", GregorianCalendar(1977, 9, 3));
    val jane: KotlinPerson = KotlinPerson(2L, "Mrs", "Jane", "Green", null);
    println("$john's age is ${john.age}");
    println("$jane's age is ${jane.age}");
    println("The age of someone born on 3rd May 1988 is ${KotlinPerson.getAge(GregorianCalendar(1988, 5, 3))}");

}