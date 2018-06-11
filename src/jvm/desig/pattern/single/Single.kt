package jvm.desig.pattern.single

/**
 * 内部类实现
 */
class Single private constructor() {
    companion object {
        private var single: Single? = null

        fun getInstance(): Single {
            if (single == null) {
                synchronized(Single::class.java) {
                    if (single == null) {
                        single = Single()
                    }
                }
            }
            return single!!
        }
    }

}
