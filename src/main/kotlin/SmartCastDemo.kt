// Expr - a marker interface to give a common type
interface Expr

class Num(val value: Int) : Expr
class Sum(val left: Expr, val right: Expr) : Expr
class Mul(val left: Expr, val right: Expr) : Expr
class Div(val left: Expr, val right: Expr) : Expr

fun eval(expr: Expr): Int {
    return when (expr) {
        is Num ->
            expr.value
        is Sum ->
            eval(expr.left) + eval(expr.right)
        is Mul ->
            eval(expr.left) * eval(expr.right)
        is Div ->
            eval(expr.left) / eval(expr.right)
        else ->
            throw IllegalArgumentException("Unknown expression")
    }
}

fun main() {
    val result = eval(Sum(Sum(Num(1), Num(2)), Num(4)))
    println(result)
}