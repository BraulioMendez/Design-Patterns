class FinishedOrder(private val showTotalPrice: Double) : Order() {

    override fun clone(): Order = FinishedOrder(showTotalPrice)

}