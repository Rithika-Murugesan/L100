var __extends = (this && this.__extends) || (function () {
    var extendStatics = function (d, b) {
        extendStatics = Object.setPrototypeOf ||
            ({ __proto__: [] } instanceof Array && function (d, b) { d.__proto__ = b; }) ||
            function (d, b) { for (var p in b) if (Object.prototype.hasOwnProperty.call(b, p)) d[p] = b[p]; };
        return extendStatics(d, b);
    };
    return function (d, b) {
        if (typeof b !== "function" && b !== null)
            throw new TypeError("Class extends value " + String(b) + " is not a constructor or null");
        extendStatics(d, b);
        function __() { this.constructor = d; }
        d.prototype = b === null ? Object.create(b) : (__.prototype = b.prototype, new __());
    };
})();
// Contract: any payment can be refunded
var Payment = /** @class */ (function () {
    function Payment() {
    }
    return Payment;
}());
var CashOnDeliveryPayment = /** @class */ (function (_super) {
    __extends(CashOnDeliveryPayment, _super);
    function CashOnDeliveryPayment() {
        return _super !== null && _super.apply(this, arguments) || this;
    }
    // COD payments cannot be refunded electronically
    CashOnDeliveryPayment.prototype.refund = function (amount) {
        throw new Error("Cash on Delivery refunds are not supported");
    };
    return CashOnDeliveryPayment;
}(Payment));
var PaymentService = /** @class */ (function () {
    function PaymentService() {
    }
    PaymentService.processRefund = function (payment) {
        // Client trusts the parent contract
        payment.refund(500);
    };
    return PaymentService;
}());
// Client code
var payment = new CashOnDeliveryPayment();
PaymentService.processRefund(payment); // Runtime failure ❌
