fun main() {
    val people = HashMap<Int,KotlinPerson>()
    people.put(1,KotlinPerson(1,"Ms","Lily","O'Sullivan",null))
    people.put(2,KotlinPerson(2,"Mr","Alex","Smithens",null))
    people.put(3,KotlinPerson(3,"Mx","Alexa","burns",null))
    people.put(4,KotlinPerson(4,"Mx","Julia","Butt",null))

    for( (key,value) in people) {
        println("$key is mapped to $value")
    }

    (0 until 9).forEach{ println(it)}
}