class Client {

    fun createOrder(type: String): Order? {
        return when(type) {
            "new_order" -> NewOrder(true)

            "finished" -> FinishedOrder(100.0)

            else -> null
        }
    }

}