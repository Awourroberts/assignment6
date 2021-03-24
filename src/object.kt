fun main() {
    var food=Human("sophy",30,70)
    food.eat(70)
    food.speak(" i like kotlin")
    food.birthday()
    var people=User("sharon","cate","ti340","07494300","94213563")
    println(people.firstName)
    println(people.email)
}
class Human(var name:String,var age:Int,var weight:Int){
    fun eat(foodWeight:Int){
        println("Iam eating $foodWeight kgs of food")


    }
    fun speak(speech:String){
        println("$speech")
    }
    fun birthday(){
        ++age
        println(age)
    }

}
data class User(var firstName:String,var lastName:String,var email:String, var phonenumber:String,var password:String)