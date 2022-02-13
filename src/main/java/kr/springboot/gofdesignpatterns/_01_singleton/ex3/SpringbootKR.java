package kr.springboot.gofdesignpatterns._01_singleton.ex3;

public class SpringbootKR {

    /**
     * synchronized를 사용하지 않고 Eager initialization 방법을 사용함.
     * 미리 만든다는것 자체가 단점이 될수있음. 쓰지않는데 만들었기 때문
     */
    private static SpringbootKR INSTANCE = new SpringbootKR();

    private SpringbootKR() {}

    public static SpringbootKR getInstance() {
        return INSTANCE;
    }

}
