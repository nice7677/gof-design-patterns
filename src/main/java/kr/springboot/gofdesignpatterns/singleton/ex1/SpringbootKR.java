package kr.springboot.gofdesignpatterns.singleton.ex1;

public class SpringbootKR {

    private static SpringbootKR instance;

    private SpringbootKR() {}

    /**
     * 이 방법은 Thread Safe 하지 않음.
     * @return
     */
    public static SpringbootKR getInstance() {
        if (instance == null) {
            instance = new SpringbootKR();
        }
        return instance;
    }

}
