```scala
class MyClass(val name: String) {
  def greet(): String = {
    // Forgot to return a value in one of the branches
    if (name.isEmpty) {
      "Name is empty"
    } else {
      "Hello, " + name
    }
  }
}

val obj = new MyClass("")
obj.greet() // This will not compile because there is a potential missing return statement.
```