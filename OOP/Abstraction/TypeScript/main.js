"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
var CardPayment_1 = require("./CardPayment");
var payment = new CardPayment_1.CardPayment(); // abstraction
payment.startPayment();
payment.pay(500);
