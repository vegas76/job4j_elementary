package ru.job4j.converter;

public class Converter {
    public static float rubleToEuro(float value) {
        return value / 70;
    }

    public static float rubleToDollar(float value) {
        return value / 60;
    }

    public static void main(String[] args) {
       // float euro = Converter.rubleToEuro(140);
       // float usd = Converter.rubleToDollar(140);
        float ineuro = 140;
        float expectedineuro  = 2;
        float outineuro = Converter.rubleToEuro(ineuro);
        boolean passedineuro = expectedineuro == outineuro;
        float ineusd = 120;
        float expectedineusd  = 2;
        float outinusd = Converter.rubleToDollar(ineusd);
        boolean passedinusd = expectedineusd == outinusd;
        System.out.println("140 rubles are 2. Test result : " + passedineuro);
        System.out.println("120 rubles are 2. Test result : " + passedinusd);
        //System.out.println("140 rubles are " + euro + " euro.");
        //System.out.println("140 rubles are " + usd + " usd.");
    }
}