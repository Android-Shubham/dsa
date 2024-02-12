package pka

class AuthRepository(
    private val authenticator: Authenticator,
    private val errorLogger: ErrorLogger) {

    fun loginUser(email : String,password : String){
        try{
            authenticator.loginWithEmailAndPassword(email,password)
            //login api call
        }catch (e : Exception){
            errorLogger.logErrors(e.localizedMessage)
        }
    }
}