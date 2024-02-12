package pka

import java.io.File

interface ErrorLogger {

    fun printErrors(){

    }
    fun logErrors(error : String){
        val file = File("some_file.txt")
        file.appendText(error)
    }

}

class CustomErrorLogger() : ErrorLogger{

    override fun logErrors(error: String) {
        val file = File("auth_error_file.txt")
        file.appendText(error)
    }

}


