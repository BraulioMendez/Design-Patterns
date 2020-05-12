package abstract_factory

class OrderBuilder(val createdAt: String = "01/01/2020",
                   val state: String = "new_order",
                   val paymentMethod: String = "cash",
                   val discount: Double = 0.0) {

    fun createdAt(createdAt: String) = apply { this.createdAt = createdAt }

    fun state(state: String) = apply { this.state = state }

    fun paymentMethod(paymentMethod: String) = apply { this.paymentMethod = paymentMethod }

    fun discount(discount: Double) = apply { this.discount = discount }

    fun build(): Order(createdAt, state, paymentMethod, discount)
}