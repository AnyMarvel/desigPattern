package kt.desig.pattern.builder

abstract class Builder {
    //第一步：装CPU
    //声明为抽象方法，具体由子类实现
    abstract fun buildCPU()

    //第二步：装主板
    //声明为抽象方法，具体由子类实现
    abstract fun buildMainboard()

    //第三步：装硬盘
    //声明为抽象方法，具体由子类实现
    abstract fun buildHD()

    //返回产品的方法：获得组装好的电脑
    abstract fun getComputer(): Computer
}
