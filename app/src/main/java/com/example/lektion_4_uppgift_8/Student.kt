package com.example.lektion_4_uppgift_8

class Student(
    var name: String,
    var age: Int,
    var rememberMe :Boolean
) : java.io.Serializable {

    override fun toString(): String {
        return """
            name: $name 
            age: $age
            rememberMe: $rememberMe
            """.trimMargin()
    }
}