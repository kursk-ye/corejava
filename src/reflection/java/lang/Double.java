package reflection.java.lang;

public class Double extends Number {
    public Double(String s){}
    public Double(java.lang.Double d){}


    @Override
    public int intValue() {
        return 0;
    }

    @Override
    public long longValue() {
        return 0;
    }

    @Override
    public float floatValue() {
        return 0;
    }

    @Override
    public double doubleValue() {
        return 0;
    }

    public static String getString(String s){
        return s;
    }
}
