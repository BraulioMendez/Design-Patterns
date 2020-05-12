package abstract_factory

class Order(val createdAt: String,
            val state: String,
            val paymentMethod: String,
            val discount: Double)