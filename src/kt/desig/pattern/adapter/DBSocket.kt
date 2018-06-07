package kt.desig.pattern.adapter

/**
 * 德国插座
 */
class DBSocket : DBSocketInterface {

    override fun powerWithTwoRound() {
        println("使用两项圆头的插孔供电")
    }
}