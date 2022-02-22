package kr.springboot.gofdesignpatterns._06_adapter.boat;

public class FishingBoatAdapter implements RowingBoat {

    private FishingBoat fishingBoat;

    public FishingBoatAdapter() {
        fishingBoat = new FishingBoat();
    }

    @Override
    public void row() {
        fishingBoat.sail();
    }

}
