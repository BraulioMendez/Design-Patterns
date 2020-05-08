package abstract_factory

class PickupOrder: Pickup {

    override fun deliveryOrderBy() {
        println("This order has not delivery")
    }

}