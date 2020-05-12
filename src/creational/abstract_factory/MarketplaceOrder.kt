package abstract_factory

class MarketplaceOrder : Marketplace {

    override fun deliveryOrderBy() {
        println("This order is delivered by Restaurant")
    }

}