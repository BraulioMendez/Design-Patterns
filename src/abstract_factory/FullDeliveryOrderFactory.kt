package abstract_factory

object FullDeliveryOrderFactory {

    fun getOrder(type: OrderType): Order {
        return when (type) {
            OrderType.FULL_DELIVERY -> FullDeliveryOrder()

            OrderType.MARKETPLACE -> MarketplaceOrder()

            OrderType.PICK_UP -> PickupOrder()
        }
    }

}