// Cel.Lep | Estação Hack from facebook
// ------------------------------------
// 
// Exercícios de Kotlin Nível II
// 
// Pratique os conceitos aprendidos em aula resolvendo os exercícios de lógica de programação a seguir.

fun main() {
    // ------------------------------------------------------------------------------
    // 1. Crie funções para as 4 operações aritméticas básicas
    println("#1")
    // ... Complete o código ...     
    
    fun somar(v1: Int, v2: Int) {
        println(v1 + v2)
    }
    
    fun subtrair(v1: Int, v2: Int) {
        println(v1 - v2)
    }
    
    // ... Crie as demais funções aqui ...
    
    fun dividir(v1: Int, v2: Int) {
        println(v1 / v2)
    }
    
    fun multiplicar(v1: Int, v2: Int) {
        println(v1 * v2)
    }
    
    // ... Chame as funções aqui ...
    somar(1, 1)
    subtrair(2, 4)
    dividir(30, 3)
    multiplicar(5, 6)
    
    
    // ------------------------------------------------------------------------------
    // 2. Utilizando instrução condicional, crie um programa que determine se uma pessoa é maior ou menor de idade
    println("\n\n#2")
    // ... Crie a variável idade ...
	var idade = 20
    
    // ... Substitua true pela condição correta e complete o código ...
    if (idade > 18) {
        println("Maior de idade!")
    } else {
        println("Menor de idade!")
    }
    
    
    // ------------------------------------------------------------------------------
    // 3. Utilizando instrução condicional e operadores relacionais, crie um programa que identifique se um determinado número inteiro é par ou ímpar
    println("\n\n#3")
	// ... Crie a variável numero ...
    var numero = 7
    
    // ... Substitua true pela condição correta e complete o código ...
    if (numero % 2 == 0) {
    	println("Número Par!")
    } else {
        println("Número Impar!")
    }
    
    
    // ------------------------------------------------------------------------------
	// 4. Utilizando instrução condicional e operadores lógicos, crie um programa que simule um sistema de login
	println("\n\n#4")
	// ... Crie as variáveis login e senha ...
	
    var login = "ines@gmail.com"
    var senha = "123456"
    
    // ... Substitua false e true pelas expressões corretas ...
    if (login == "ines@gmail.com" && senha == "123456") {
        println("Acesso permitido")
    } else {
        println("Acesso negado")
    }
    
    
    // ------------------------------------------------------------------------------
	// 5. Utilizando funções e estrutura condicional, crie um programa que calcule o IMC de uma pessoa, imprimir o valor do IMC e sua classificação
	println("\n\n#5")
    // ... Complete o código ...
	
    val peso = 55
    val altura = 1.55
    val imc = peso / (altura * altura)
    
    println("IMC = $imc")
    
    // ... Substitua true pelas expressões corretas e complete o códgio ...
    if (imc < 18.5) {
        println("Abaixo do peso.")
    } else if (imc > 18.6 && imc < 25.0) {
        println("Peso ideal.")
    } else if (imc > 25.1) {
        println("Acima do peso.")
   	}
       
    // ------------------------------------------------------------------------------
	// 6. Utilizando o loop de repetição for, crie um programa que imprima qualquer tabuada
	println("\n\n#6")
    // ... Complete o código ....
    
    val tabuada = arrayListOf(1,2,3,4,5,6,7,8,9,10)
    
    for(tab in tabuada){
        for(n in 0..10){
            val res = tab * n
            println("$tab x $n = $res")
        }
    }
