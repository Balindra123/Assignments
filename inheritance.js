"use strict"
var bikeCreationModule = (function () {
    var createBicyclePrototye = function () {
        return {
            speed: 0,
            applyBrake: function (para) {
                this.speed = this.speed - para;
            },
            speedUp: function (para) {
                this.speed = this.speed + para;
            }
        }
    }

    var createMountainBikeProtoype = function (parameter) {
        var toReturn = Object.create(parameter);
        toReturn.gear = 1;
        toReturn.setGear = function (gearValue) {
            this.gear = gearValue;
        }
        return toReturn;
    }

    var start = function () {
        var bicyclePrototype = createBicyclePrototye();
        var mountainBikePrototype = createMountainBikeProtoype(bicyclePrototype);

        bicyclePrototype.speedUp(2);
    }

    return {
        startProcess: start, 
        createMountainBike : createMountainBikeProtoype, 
        createBicycle : createBicyclePrototye
    }
})();

var x = bikeCreationModule;
x.startProcess();

