package kr.springboot.gofdesignpatterns.singleton.ex4;

public class SpringbootKR {

    // volatile을 사용해야함. 자바 1.5 이상
    private static volatile SpringbootKR intstance;

    private SpringbootKR() {}

    /**
     * Double Checked Locking
     * Ex2의 메서드에 synchronized를 사용하는것에 비해 성능이 좋음.
     * @return
     */
    public static SpringbootKR getInstance() {
        if (intstance == null) { // <--- check 1
            synchronized (SpringbootKR.class) { // <-- synchronized
                if (intstance == null) { // <-- check 2
                    intstance = new SpringbootKR();
                }
            }
        }
        return intstance;
    }

}
