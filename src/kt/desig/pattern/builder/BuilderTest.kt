package kt.desig.pattern.builder

object BuilderTest {
    @JvmStatic
    fun main(args: Array<String>) {

        //逛了很久终于发现一家合适的电脑店
        //找到该店的老板和装机人员
        val director = Director()
        val builder = ConcreteBuilder()
        //沟通需求后，老板叫装机人员去装电脑
        director.construct(builder)

        //装完后，组装人员搬来组装好的电脑
        val computer = builder.getComputer()
        //组装人员展示电脑给小成看
        computer.show()

    }
}
