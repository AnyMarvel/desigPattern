package kt.desig.pattern.builder

import java.util.ArrayList

class Computer {
    //电脑组件的集合
    private val parts = ArrayList<String>()

    //用于将组件组装到电脑里
    fun add(part: String) {
        parts.add(part)
    }

    fun show() {
        for (i in parts.indices) {
            println("组件" + parts[i] + "装好了")
        }
        println("电脑组装完成，请验收")


    }
}
