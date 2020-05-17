class Client {

    fun createOrder(type: OrderType): Order {
        return when(type) {
            OrderType.NEW_ORDER -> NewOrder(true)

            OrderType.FINISHED_ORDER -> FinishedOrder(100.0)
        }
    }

}