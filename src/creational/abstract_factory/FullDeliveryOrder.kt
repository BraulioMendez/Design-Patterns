package abstract_factory

class FullDeliveryOrder : FullDelivery {

    override fun deliveryOrderBy() {
        println("This order is delivered by Rappi")
    }

}