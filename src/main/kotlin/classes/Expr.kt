package classes

/**
 * `sealed` class is useful when there is a specific set of possible options.
 *  Like the example below, Arithmetic expression, has 4 possible options
 *  such as: Sum, Mul, Div, Sub
 */
sealed class Expr

class Num(val value: Int): Expr()
class Sum(val left: Expr, val right: Expr): Expr()
class Mul(val left: Expr, val right: Expr): Expr()
class Div(val left: Expr, val right: Expr): Expr()
class Sub(val left: Expr, val right: Expr): Expr()

fun eval(expr: Expr): Int = when (expr) {
    is Num -> expr.value
    is Sum -> eval(expr.left) + eval(expr.right)
    is Sub -> eval(expr.left) - eval(expr.right)
    is Mul -> eval(expr.left) * eval(expr.right)
    is Div -> eval(expr.left) / eval(expr.right)
}

