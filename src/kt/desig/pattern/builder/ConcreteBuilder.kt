package kt.desig.pattern.builder

class ConcreteBuilder : Builder() {
    //创建产品实例
    private var computer = Computer()

    //组装产品
    override fun buildCPU() {
        computer.add("组装CPU")
    }

    override fun buildMainboard() {
        computer.add("组装主板")
    }

    override fun buildHD() {
        computer.add("组装硬盘")
    }

    //返回组装成功的电脑
    override fun getComputer(): Computer {
        return computer
    }
}
