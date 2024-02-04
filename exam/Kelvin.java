package exam;

public class Kelvin extends Converter{
    void getConvertedValue() {
        value = 12.9;
        fahrenheit = ((value) + 275.15);
        kelvin = ((1.8 * value) + 32);
        System.out.println("Convertor is Fahrenheit is " + value);
    }
}
