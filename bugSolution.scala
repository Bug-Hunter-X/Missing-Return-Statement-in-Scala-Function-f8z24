```scala
class MyClass(val name: String) {
  def greet(): String = {
    if (name.isEmpty) {
      "Name is empty"
    } else {
      return "Hello, " + name // Added explicit return statement
    }
  }
}

val obj = new MyClass("")
println(obj.greet())

val obj2 = new MyClass("John")
println(obj2.greet())
```