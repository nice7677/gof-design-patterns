package kr.springboot.gofdesignpatterns._07_bridge;

public class App {

    public static void main(String[] args) {

        ElectronicCigarette justfogQ16 = new JustfogQ16(new Justfog());
        justfogQ16.chargeBattery();
        justfogQ16.changeVolt();
        justfogQ16.noneAtomizer();
        justfogQ16.changeWatt();

        ElectronicCigarette nevoksVeego80 = new NevoksVeego80(new Nevoks());
        nevoksVeego80.chargeBattery();
        nevoksVeego80.changeVolt();
        nevoksVeego80.noneAtomizer();
        nevoksVeego80.changeWatt();

    }

}
