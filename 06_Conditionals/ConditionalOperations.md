# Conditional Operations

### Conditional-Or 1/3

The OR operator, ||, is used between two boolean values and evaluates to a single boolean value. 
If either of the two values is true, then the resulting value is true, otherwise the resulting value
is false. 

```
true || true
// true
false || true
// true
true || false
// true
false || false
// false
```

### Short Circuit Eval

On some occasions, the compiler can determine the truth value of a logical expression by only 
evaluating the first boolean operand; this is known as short-circuited evaluation. 
Short-circuited evaluation only works with expressions that use && or ||. 

In an expression that uses ||, the resulting value will be true as long as one of the operands has a
true value. If the first operand of an expression is true, we don’t need to see what the value of 
the other operand is to know that the final value will also be true.

An expression that uses && will only result in true if both operands are true. If the first operand 
in the expression is false, the entire value will be false.