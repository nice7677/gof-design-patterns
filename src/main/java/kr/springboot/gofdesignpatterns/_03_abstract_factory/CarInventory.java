package kr.springboot.gofdesignpatterns._03_abstract_factory;

public class CarInventory {

    public static void main(String[] args) {

        CarFactory carFactory = new WhiteCarFactory(new WhiteCarProFactory());
        Car car = carFactory.createCar();
        System.out.println(car);

    }

}
