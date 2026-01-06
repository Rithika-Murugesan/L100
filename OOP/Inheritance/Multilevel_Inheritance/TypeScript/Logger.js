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
var Logger = /** @class */ (function () {
    function Logger() {
    }
    Logger.prototype.log = function (message) {
        console.log("Log:", message);
    };
    return Logger;
}());
var FileLogger = /** @class */ (function (_super) {
    __extends(FileLogger, _super);
    function FileLogger() {
        return _super !== null && _super.apply(this, arguments) || this;
    }
    FileLogger.prototype.logToFile = function (message) {
        this.log(message);
        console.log("Writing log to file");
    };
    return FileLogger;
}(Logger));
var SecureFileLogger = /** @class */ (function (_super) {
    __extends(SecureFileLogger, _super);
    function SecureFileLogger() {
        return _super !== null && _super.apply(this, arguments) || this;
    }
    SecureFileLogger.prototype.secureLog = function (message) {
        console.log("Encrypting log...");
        this.logToFile(message);
    };
    return SecureFileLogger;
}(FileLogger));
var logger = new SecureFileLogger();
logger.secureLog("API access granted");
