package exam;

public class Celsius extends Converter {
    void getConvertedValue() {
        value = 36.6;
        fahrenheit = ((value) + 275.15);
        kelvin = ((1.8 * value) + 32);
        System.out.println("Convertor is " + value);
    }
}
