package dataType;

public class NonNumeric extends Primitive implements INonNumeric{

    @Override
    public char charValue(char value) {
        return 0;
    }

    @Override
    public boolean booleanValue(boolean value) {
        return false;
    }
}
