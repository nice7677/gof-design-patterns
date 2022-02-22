package kr.springboot.gofdesignpatterns._06_adapter.boat;

public class App {

    public static void main(String[] args) {
        Captain captain = new Captain(new FishingBoatAdapter());
        captain.row();
    }

}
