// OOP
//1.Create a class called Human with these attributes: name, age, weight. It has
//the following functions:
//-eat(foodWeight: Int) :Prints “I am eating {foodWeight}kgs of food”
//and increments the human’s weight by the weight of the food eaten
//
//-speak(speech: String) :Prints the string passed toit                (2
//points)
//-birthday( ) :Increments the human’s age by 1(2
//points)
//Create an instance of this human class and invoke all its functions
//2.Create a data class User with these fields: firstName, lastName, email,
//phoneNumber, password. Create an instance of User  and print out any 2
fun main(){
var person = Human("Lucy",22,60)
    person.eat(2)
    person.speak("Hi,welcome to my world.")
    person.birthday()

    var instance=User("Preston","Too","toopreston@gmail.com","0797916750","jkd893!")
    instance.firstName
    println(instance.firstName)
    instance.email
    println(instance.email)
}
class Human(var name:String,var age:Int,var weight:Int){
fun eat(foodweight: Int) {
    weight += foodweight
    println("I am eating $weight kgs of food.")

}
    fun speak(speech:String) {
        println(speech)
    }
    fun birthday(){
        println(age+1)
    }
}
data class User(var firstName:String,var lastName:String, var email:String,var phoneNumber:String,var password:String){

}