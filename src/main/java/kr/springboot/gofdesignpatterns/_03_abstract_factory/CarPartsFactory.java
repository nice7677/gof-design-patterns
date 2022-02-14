package kr.springboot.gofdesignpatterns._03_abstract_factory;

public interface CarPartsFactory {

    Window createWindow();

    Wheel createWheel();

    Sheet createSheet();

}
