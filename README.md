# Missing Return Statement in Scala Function

This example demonstrates a common error in Scala: forgetting to include a return statement in all branches of a function that is supposed to return a value. This will lead to a compilation error because the compiler can't guarantee that the function always returns a value.

## Bug

The `greet()` function in `bug.scala` has a conditional statement but doesn't handle the case where the name is not empty in a way that results in a returned value. This results in a compilation error because the compiler can't infer what to return in this situation.

## Solution

The `bugSolution.scala` file shows the corrected function, with an explicit return statement added to the `else` branch, to provide a return value for all possible inputs.