enum class Nivel { BASICO, INTERMEDIARIO, DIFICIL }

data class Usuario(val nome: String, val email: String)

data class ConteudoEducacional(val nome: String, val duracao: Int = 60)

data class Formacao(val nome: String, val conteudos: List<ConteudoEducacional>) {
    val inscritos = mutableListOf<Usuario>()

    fun matricular(usuario: Usuario) {
        if (!inscritos.contains(usuario)) {
            inscritos.add(usuario)
            println("O usuário ${usuario.nome} foi matriculado na formação $nome.")
        } else {
            println("O usuário ${usuario.nome} já está matriculado na formação $nome.")
        }
    }
}

fun main() {
    // Criação de alguns objetos para simular cenários de teste
    val usuario1 = Usuario("Alice", "alice@email.com")
    val usuario2 = Usuario("Bob", "bob@email.com")

    val conteudo1 = ConteudoEducacional("Introdução à Kotlin", 120)
    val conteudo2 = ConteudoEducacional("Programação Orientada a Objetos", 90)

    val formacao1 = Formacao("Desenvolvimento Android", listOf(conteudo1, conteudo2))

    formacao1.matricular(usuario1)
    formacao1.matricular(usuario2)
}
