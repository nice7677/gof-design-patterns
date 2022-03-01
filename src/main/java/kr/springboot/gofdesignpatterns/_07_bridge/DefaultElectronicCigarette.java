package kr.springboot.gofdesignpatterns._07_bridge;

public class DefaultElectronicCigarette implements ElectronicCigarette {

    private Company company;

    private String name;

    public DefaultElectronicCigarette(Company company, String name) {
        this.company = company;
        this.name = name;
    }

    @Override
    public void chargeBattery() {
        System.out.printf("%s의 %s 충전 중....\n", company.getName(), this.name);
    }

    @Override
    public void noneAtomizer() {
        System.out.printf("%s의 %s 오토마이저 없음....\n", company.getName(), this.name);
    }

    @Override
    public void changeVolt() {
        System.out.printf("%s의 %s 볼트 변경 ....\n", company.getName(), this.name);
    }

    @Override
    public void changeWatt() {
        System.out.printf("%s의 %s 와트 변경 ....\n", company.getName(), this.name);
    }

}
