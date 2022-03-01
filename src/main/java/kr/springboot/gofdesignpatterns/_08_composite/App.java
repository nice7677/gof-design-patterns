package kr.springboot.gofdesignpatterns._08_composite;

public class App {

    public static void main(String[] args) {

        Item item1 = new Item(1, "이가닌자의검");
        Item item2 = new Item(2, "정화의방패");

        Inventory inventory = new Inventory();
        inventory.add(item1);
        inventory.add(item2);

        App app = new App();
        app.printName(item1);
        app.printName(item2);
        app.printName(inventory);

    }

    private void printName(Component component) {
        System.out.println(component.getInfo());
    }

}
