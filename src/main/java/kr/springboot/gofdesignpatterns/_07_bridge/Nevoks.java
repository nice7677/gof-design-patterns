package kr.springboot.gofdesignpatterns._07_bridge;

public class Nevoks implements Company {

    private final String name = "Nevoks";

    @Override
    public String getName() {
        return this.name;
    }

}
