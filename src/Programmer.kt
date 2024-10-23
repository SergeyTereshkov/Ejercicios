class Programmer(
    val name: String,
    var age: Int,
    val languages: Array<language>,
    val friends: Array<Programmer>? = null
) {

    enum class language {
        KOTLIN,
        JAVA,
        JAVASCRIPT,
        C
    }

    fun code() {
        for (language in languages) {
            println("Estoy programando en $language")
        }
    }
}