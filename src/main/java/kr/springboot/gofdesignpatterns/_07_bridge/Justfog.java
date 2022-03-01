package kr.springboot.gofdesignpatterns._07_bridge;

public class Justfog implements Company{

    private final String name = "Justfog";

    @Override
    public String getName() {
        return this.name;
    }

}
