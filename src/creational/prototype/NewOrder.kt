class NewOrder(private val showCookingTime: Boolean) : Order() {

    override fun clone(): Order = NewOrder(showCookingTime)

}