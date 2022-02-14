package kr.springboot.gofdesignpatterns._03_abstract_factory;

public class WhiteCarProFactory implements CarPartsFactory{
    @Override
    public Window createWindow() {
        return new CarWindow();
    }

    @Override
    public Wheel createWheel() {
        return new WhiteWheel();
    }

    @Override
    public Sheet createSheet() {
        return new WhiteSheet();
    }
}
