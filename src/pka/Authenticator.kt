package pka

interface Authenticator {
    fun loginWithEmailAndPassword(email : String, password : String)
}


class FirebaseAuthenticator : Authenticator{
    override fun loginWithEmailAndPassword(email: String, password: String) {
        //firebase auth and return result
    }

}


class CustomAuthenticator : Authenticator{
    override fun loginWithEmailAndPassword(email: String, password: String) {
        //retrofit api call and return same result object
    }

}