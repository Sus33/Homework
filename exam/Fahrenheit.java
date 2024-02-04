package exam;

public class Fahrenheit extends Converter{
    void getConvertedValue() {
        value = 23.5;
        fahrenheit = ((value) + 275.15);
        kelvin = ((1.8 * value) + 32);
        System.out.println("Convertor is Fahrenheit is " + value);
    }
}
