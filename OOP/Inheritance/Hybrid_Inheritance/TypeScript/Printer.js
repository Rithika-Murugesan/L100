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
var Machine = /** @class */ (function () {
    function Machine() {
    }
    Machine.prototype.powerOn = function () {
        console.log("Machine powered on");
    };
    return Machine;
}());
var OfficePrinter = /** @class */ (function (_super) {
    __extends(OfficePrinter, _super);
    function OfficePrinter() {
        return _super !== null && _super.apply(this, arguments) || this;
    }
    OfficePrinter.prototype.scan = function () {
        console.log("Scanning document");
    };
    OfficePrinter.prototype.printOverNetwork = function () {
        console.log("Printing over network");
    };
    return OfficePrinter;
}(Machine));
var printer = new OfficePrinter();
printer.powerOn();
printer.scan();
printer.printOverNetwork();
