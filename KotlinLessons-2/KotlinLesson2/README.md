# Kotlin lesson 2

## Задание №1 “Дописать классы”

Написать реализацию класса Holder и интерфейса
ValueChangeListener, таких, чтобы программа компилировалась, и при
выполнении функции main на экран было выведено "New value is 1".

```
fun main() {
    val holder = Holder.createHolder(Holder.DEFAULT_NUMBER)
    holder.number = 9
    holder.listener = object : ValueChangeListener {
        override fun onNewValue(number: Int) {
            println("New value is $number")
        }
    }
    holder.number = 1
}
```
## Семинар 2. Классы, объекты и интерфейсы в Kotlin.
## Задание №2 “Иерархия классов”

Семинар 2. Классы, объекты и интерфейсы в Kotlin.
Построить иерархию классов таким образом, чтобы после
выполнения функции main был выведен корректный результат
вычисления 3 формул. 15 минут

```
fun printOperationResult(operation: Operation) {
        val result = operation.calculate()
        println(result)
    }

fun main() {
    // ФорȀуǿы 1-3
}
```
## Задание №2 “Иерархия классов”

## Семинар 2. Классы, объекты и интерфейсы в Kotlin.

// Соответствует форȀуǿе 4 + 2.5 * 2
```
printOperationResult(
    Plus(
        Value(4.0),
        Multiply(
            Value(2.5),
            Value(2.0)
        )
    )
)
```

Формула 1
## Задание №2 “Иерархия классов”
## Семинар 2. Классы, объекты и интерфейсы в Kotlin.
// Соответствует форȀуǿе (1 + 3.5) * (2.5 + 2)
```
printOperationResult(
    Multiply(
            Plus(
            Value(1.0),
            Value(3.5)
        ),
            Plus(
            Value(2.5),
            Value(2.0)
        )
    )
)
```

Формула 2
## Задание №2 “Иерархия классов”
## Семинар 2. Классы, объекты и интерфейсы в Kotlin.
// Соответствует форȀуǿе 10
```
printOperationResult(
    Value(10.0)
)
```