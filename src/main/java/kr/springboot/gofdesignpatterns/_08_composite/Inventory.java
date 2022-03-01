package kr.springboot.gofdesignpatterns._08_composite;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Inventory implements Component{

    private List<Component> components = new ArrayList<>();

    public void add(Component component) {
        components.add(component);
    }

    public List<Component> getComponents() {
        return components;
    }

    @Override
    public String getInfo() {
        return toString();
    }

    @Override
    public String toString() {
        return "Inventory{" +
                "components=" + components +
                '}';
    }
}
