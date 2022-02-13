package kr.springboot.gofdesignpatterns.singleton.ex2;

public class SpringbootKR {

    private static SpringbootKR instance;

    private SpringbootKR() {}

    /**
     * Sysnchronized 사용해서 Thread Safe 하게
     * 하지만 모든 요청에 synchronized 가 실행 되기 때문에 성능에 문제가 있을수있음.
     * @return
     */
    public static synchronized SpringbootKR getInstance() {
        if (instance == null) {
            instance = new SpringbootKR();
        }
        return instance;
    }

}
