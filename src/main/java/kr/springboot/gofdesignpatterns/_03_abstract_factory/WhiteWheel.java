package kr.springboot.gofdesignpatterns._03_abstract_factory;

public class WhiteWheel implements Wheel {

    private String color = "white";

    @Override
    public String toString() {
        return "WhiteWheel{" +
                "color='" + color + '\'' +
                '}';
    }
}
