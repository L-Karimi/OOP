fun main(){
var person = Human("Lucy",22,60)
    person.eat(2)
    person.name
    person.speak("French")

    println(person.name)
    person.age
    println(person.age)
    person.weight
    println(person.weight)

    var instance=User("Preston","Too","toopreston@gmail.com","0797916750","jkd893!")
    instance.firstName
    println(instance.firstName)
    instance.email
    println(instance.email)
}
class Human(var name:String,var age:Int,var weight:Int){
fun eat(foodweight: Int): Int {
    weight += foodweight
    println("I am eating $foodweight kgs of food.")

    return foodweight
}
    fun speak(speech:String) {
        println(speech)


    }
}
data class User(var firstName:String,var lastName:String, var email:String,var phoneNumber:String,var password:String){

}