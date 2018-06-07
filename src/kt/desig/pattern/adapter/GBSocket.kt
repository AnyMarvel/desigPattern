package kt.desig.pattern.adapter

/**
 * 中国插座
 */
class GBSocket : GBSocketInterface {

    override fun powerWithThreeFlat() {
        println("使用三项扁头插孔供电")
    }
}