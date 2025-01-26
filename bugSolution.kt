```kotlin
fun calculateSafe(a: Int, b: Int): Int? {
    return if (b == 0) null else a / b
}

fun calculateSafeWithCustomException(a: Int, b: Int): Int {
    require(b != 0) { "Cannot divide by zero" }
    return a / b
}
```