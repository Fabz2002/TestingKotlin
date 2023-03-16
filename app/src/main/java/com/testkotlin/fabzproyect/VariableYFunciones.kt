package com.testkotlin.fabzproyect
//Variable
var num1: Int = 10
fun main() {
    val event:String="DIV"
    val num2: Int = 2
    handleMessage(event)
    println(NumisInt(num1))
    println(suma(num2))
}

fun suma(num2: Int): Int {
    num1= 20
    return num1 + num2
}
fun handleMessage(event:String){
    println("ESTE ES UNA FUNCION DE PARAMETRO ONLY ${event}")
}
fun NumisInt(num:Int):Boolean{
    var isInt:Boolean=false
    if(num is Int){
        isInt=true
    }
    return isInt
}