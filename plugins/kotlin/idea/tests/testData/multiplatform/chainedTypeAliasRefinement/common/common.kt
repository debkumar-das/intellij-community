expect class <!LINE_MARKER("descr='Has actuals in [jvmJs, native] modules'; targets=[(text=jvmJs); (text=native)]")!>Common<!> : Number {
    override fun <!LINE_MARKER("descr='Press ... to navigate'")!>toDouble<!>(): Double
    override fun <!LINE_MARKER("descr='Press ... to navigate'")!>toFloat<!>(): Float
    override fun <!LINE_MARKER("descr='Press ... to navigate'")!>toLong<!>(): Long
    override fun <!LINE_MARKER("descr='Press ... to navigate'")!>toInt<!>(): Int
    override fun <!LINE_MARKER("descr='Press ... to navigate'")!>toShort<!>(): Short
    override fun <!LINE_MARKER("descr='Press ... to navigate'")!>toByte<!>(): Byte
}

fun takeCommon(<!UNUSED_PARAMETER!>c<!>: Common) {
}
