fun test(f: () -> String) = f()

class Foo {
    val function: () -> String = { "" }

    fun foo() {
        test { <caret>function() }
    }
}

// IGNORE_K2
