import { CardPayment } from "./CardPayment";

const payment = new CardPayment(); // abstraction
payment.startPayment();
payment.pay(500);
