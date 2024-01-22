package idhrudhar


data class User(var name : String = "")
fun getUserFromServe() : Result {
    //some dummy api call
    return Result.Loading

}

sealed class Result{
    object Loading : Result()
    data class Error(val err : Throwable) : Result()
    data class Success(val user: User) : Result()
}

fun main() {
    when(getUserFromServe()){
        is Result.Loading ->{

        }

        is Result.Success ->{

        }

        is Result.Error ->{

        }
    }
}