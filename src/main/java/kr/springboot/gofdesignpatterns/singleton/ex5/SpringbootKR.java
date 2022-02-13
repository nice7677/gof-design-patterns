package kr.springboot.gofdesignpatterns.singleton.ex5;

public class SpringbootKR {

    private SpringbootKR() {}

    /**
     * 권장 방법임
     * static inner 클래스
     * Thread Safe
     */
    private static class SpringbootKRHolder {
        private static final SpringbootKR INSTANCE = new SpringbootKR(); // <-- 2
    }

    public static SpringbootKR getInstance() { // <-- 1
        return SpringbootKRHolder.INSTANCE; // <-- 3
    }

}
