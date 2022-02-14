package kr.springboot.gofdesignpatterns._03_abstract_factory;

public class WhiteCarFactory implements CarFactory {

    private CarPartsFactory carPartsFactory;

    public WhiteCarFactory(CarPartsFactory carPartsFactory) {
        this.carPartsFactory = carPartsFactory;
    }

    @Override
    public Car createCar() {
        Car car = new WhiteCar();
        car.setSheet(carPartsFactory.createSheet());
        car.setWheel(carPartsFactory.createWheel());
        car.setWindow(carPartsFactory.createWindow());
        return car;
    }

}
