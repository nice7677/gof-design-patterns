package kr.springboot.gofdesignpatterns._03_abstract_factory;

public class WhiteSheet implements Sheet {

    private String sheetType = "paper";

    @Override
    public String toString() {
        return "WhiteSheet{" +
                "sheetType='" + sheetType + '\'' +
                '}';
    }

}
