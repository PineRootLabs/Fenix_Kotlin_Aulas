# 📘 Glossário Kotlin - Base da Programação

---

## 🧠 1. Tipos de Dados Primitivos

| Tipo     | Exemplo                       | Descrição                          |
|----------|-------------------------------|------------------------------------|
| `Int`    | `val idade: Int = 30`         | Número inteiro                     |
| `Double` | `val pi: Double = 3.14`       | Número decimal                     |
| `Float`  | `val preco: Float = 10.5f`    | Decimal com menos precisão         |
| `Boolean`| `val ativo: Boolean = true`   | Verdadeiro ou falso                |
| `Char`   | `val letra: Char = 'A'`       | Um único caractere                 |
| `String` | `val nome: String = "Caio"`   | Texto                              |

---

## 🔧 2. Variáveis

| Tipo | Exemplo                   | Descrição                |
|------|---------------------------|--------------------------|
| `val`| `val nome = "Caio"`       | Imutável (constante)     |
| `var`| `var idade = 25`          | Mutável (pode mudar)     |

---

## ➕ 3. Operadores Aritméticos

| Operador | Exemplo | Significado       |
|----------|---------|-------------------|
| `+`      | `2 + 3` | Soma              |
| `-`      | `5 - 1` | Subtração         |
| `*`      | `4 * 2` | Multiplicação     |
| `/`      | `10 / 2`| Divisão           |
| `%`      | `7 % 2` | Módulo (resto)    |

---

## ⚖️ 4. Operadores de Comparação

| Operador | Exemplo   | Resultado |
|----------|-----------|-----------|
| `==`     | `5 == 5`  | `true`    |
| `!=`     | `5 != 3`  | `true`    |
| `>`      | `5 > 3`   | `true`    |
| `<`      | `2 < 3`   | `true`    |
| `>=`     | `5 >= 5`  | `true`    |
| `<=`     | `3 <= 4`  | `true`    |

---

## 🔀 5. Operadores Lógicos

| Operador | Exemplo          | Significado |
|----------|------------------|-------------|
| `&&`     | `true && false`  | E (AND)     |
| `||`     | `true || false`  | OU (OR)     |
| `!`      | `!true`          | NÃO (NOT)   |

---

## 🧮 6. Operadores Compostos

| Operador | Exemplo   | Equivalente        |
|----------|-----------|--------------------|
| `+=`     | `x += 2`  | `x = x + 2`        |
| `-=`     | `x -= 1`  | `x = x - 1`        |
| `*=`     | `x *= 3`  | `x = x * 3`        |
| `/=`     | `x /= 2`  | `x = x / 2`        |

---

## 🔁 7. Controle de Fluxo

### `if/else`
```kotlin
val idade = 18
if (idade >= 18) {
    println("Maior de idade")
} else {
    println("Menor de idade")
}
```

### `when` (tipo switch)
```kotlin
val dia = 3
val nomeDoDia = when (dia) {
    1 -> "Segunda"
    2 -> "Terça"
    3 -> "Quarta"
    else -> "Dia inválido"
}
```

### `for`
```kotlin
for (i in 1..5) {
    println(i)
}
```

### `while`
```kotlin
var i = 0
while (i < 5) {
    println(i)
    i++
}
```

### `do/while`
```kotlin
var i = 0
do {
    println(i)
    i++
} while (i < 5)
```

---

## 📦 8. Coleções

### Array
```kotlin
val numeros = arrayOf(1, 2, 3)
println(numeros[0]) // 1
```

### List
```kotlin
val nomes = listOf("Ana", "Caio", "João")
println(nomes[1]) // Caio
```

### MutableList
```kotlin
val lista = mutableListOf(1, 2, 3)
lista.add(4)
```

---

## 🔧 9. Funções

```kotlin
fun soma(a: Int, b: Int): Int {
    return a + b
}
```

```kotlin
fun saudacao(nome: String) = "Olá, $nome!"
```

---

## 🧱 10. Classes e Objetos

```kotlin
class Pessoa(val nome: String, var idade: Int) {
    fun falar() {
        println("Olá, meu nome é $nome")
    }
}

val pessoa = Pessoa("Caio", 25)
pessoa.falar()
```

---

## 🧪 11. Null Safety

```kotlin
var nome: String? = null
println(nome?.length)       // safe call
println(nome ?: "Desconhecido") // Elvis operator
```

---

## 🧙‍♂️ 12. Outros Conceitos

### Verificar tipo (`is`)
```kotlin
val x: Any = "texto"
if (x is String) {
    println("É uma string")
}
```

### Cast de tipo (`as`)
```kotlin
val x: Any = "texto"
val s = x as String
```

### Verificar se está numa coleção (`in`)
```kotlin
if (3 in listOf(1, 2, 3)) {
    println("Tá na lista")
}
```

---
