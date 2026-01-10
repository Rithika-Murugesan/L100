var PaymentGateway = /** @class */ (function () {
    function PaymentGateway() {
    }
    PaymentGateway.prototype.processPayment = function (amount) {
        console.log("Payment of \u20B9".concat(amount, " processed successfully"));
    };
    return PaymentGateway;
}());
var Order = /** @class */ (function () {
    function Order(gateway) {
        this.gateway = gateway; // Injected
    }
    Order.prototype.placeOrder = function (amount) {
        console.log("Placing order...");
        this.gateway.processPayment(amount);
    };
    return Order;
}());
// Execution
var gateway = new PaymentGateway(); // Independent
var order = new Order(gateway); // Injected
order.placeOrder(3000);
