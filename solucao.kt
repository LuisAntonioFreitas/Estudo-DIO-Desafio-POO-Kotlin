enum class Nivel { BASICO, INTERMEDIARIO, AVANCADO }

data class Aluno(val nome: String)

data class ConteudoEducacional(val nome: String, val duracao: Int = 60)

data class Formacao(val nome: String, val nivel: String, val conteudos: List<ConteudoEducacional>) {

    val inscritos = mutableListOf<Aluno>()
    
    fun matricular(args: List<Aluno>) { 
        //TODO("Utilize o parâmetro $aluno para simular uma matrícula (usar a lista de $inscritos).")
        for (aluno in args) {
        	inscritos.add(aluno)
            val alunoNome = aluno.nome
            print("\nAluno ($alunoNome): Matriculado na Formação ($nome)")
        }
    }   
    
}

fun main() {
    //TODO("Analise as classes modeladas para este domínio de aplicação e pense em formas de evoluí-las.")
    //TODO("Simule alguns cenários de teste. Para isso, crie alguns objetos usando as classes em questão.")
    
    val aluno1 = Aluno("Luis")
    val aluno2 = Aluno("Carlos")
    val aluno3 = Aluno("Paulo")
    println("Alunos:")
    println("1: $aluno1 \n2: $aluno2 \n3: $aluno3")
    
    val conteudoEducacionalJava = ConteudoEducacional("Curso de Java", 240)
    val conteudoEducacionalKotlin = ConteudoEducacional("Curso de Kotlin", 120)
    val conteudoEducacionalAWS = ConteudoEducacional("Curso de AWS")
    println("\nConteúdos:")
    println("1: $conteudoEducacionalJava \n2: $conteudoEducacionalKotlin \n3: $conteudoEducacionalAWS")
    
    val formacaoJava = Formacao("Java", Nivel.BASICO.name, listOf(conteudoEducacionalJava))
    val formacaoKotlin = Formacao("Kotlin", Nivel.INTERMEDIARIO.name, listOf(conteudoEducacionalJava, conteudoEducacionalKotlin, conteudoEducacionalAWS))
    println("\nFormações:")
    println("1: $formacaoJava \n2: $formacaoKotlin")
    
	formacaoJava.matricular(listOf(aluno1))
    formacaoKotlin.matricular(listOf(aluno1, aluno2, aluno3))
    println("\n\nInscritos:")
    val formacaoJavaNome = formacaoJava.nome
    val formacaoJavaNivel = formacaoJava.nivel
    val formacaoJavaInscritos = formacaoJava.inscritos
    println("Formação ($formacaoJavaNome | $formacaoJavaNivel): $formacaoJavaInscritos")
    val formacaoKotlinNome = formacaoKotlin.nome
    val formacaoKotlinNivel = formacaoKotlin.nivel
    val formacaoKotlinInscritos = formacaoKotlin.inscritos
    println("Formação ($formacaoKotlinNome | $formacaoKotlinNivel): $formacaoKotlinInscritos")
}
