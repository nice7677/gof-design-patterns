package kr.springboot.gofdesignpatterns._03_abstract_factory;

public class Car {

    private Window window;

    private Wheel wheel;

    private Sheet sheet;

    public void setWindow(Window window) {
        this.window = window;
    }

    public void setWheel(Wheel wheel) {
        this.wheel = wheel;
    }

    public void setSheet(Sheet sheet) {
        this.sheet = sheet;
    }

    @Override
    public String toString() {
        return "Car{" +
                "window=" + window +
                ", wheel=" + wheel +
                ", sheet=" + sheet +
                '}';
    }

}
