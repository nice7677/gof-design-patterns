package kr.springboot.gofdesignpatterns._03_abstract_factory;

public class CarWindow implements Window {

    private String color = "black";

    @Override
    public String toString() {
        return "CarWindow{" +
                "color='" + color + '\'' +
                '}';
    }

}
