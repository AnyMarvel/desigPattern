package kt.desig.pattern.builder

class Director {
    //指挥装机人员组装电脑
    fun construct(builder: Builder) {

        builder.buildCPU()
        builder.buildMainboard()
        builder.buildHD()
    }
}
