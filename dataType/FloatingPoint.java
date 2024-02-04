package dataType;

public abstract class FloatingPoint extends Numeric implements IFloatingPoint{

//    public abstract float floatValue();

//    public abstract double doubleValue();

    @Override
    public float floatValue(float value) {
        return value;
    }

    @Override
    public double doubleValue(double value) {
        return value;
    }
}
