package innerclass.staticinnerclass;

import static com.kursk.Util.println;

public class Test1 {
    public static void main(String[] args) {
        double[] d = new double[20];
        for(int i = 0 ; i < d.length ; i++)
            d[i] = 100 * Math.random();
        ArrayAlg.Pair p = ArrayAlg.Pair.minmax(d);
        println("min = " + p.getFirst());
        println("min = " + p.getSecond());
    }
}

class ArrayAlg
{
    public static class Pair
    {
        private  double first;
        private  double second;

        public Pair(double f , double s)
        {
            first = f;
            second = s;
        }

        public double getFirst() {
            return first;
        }

        public double getSecond() {
            return second;
        }

        public static Pair minmax(double[] values)
        {
            double min = Double.POSITIVE_INFINITY;
            double max = Double.POSITIVE_INFINITY;
            for(double v : values)
            {
                if ( min > v ) min = v;
                if ( max < v ) max = v;
            }
            return new Pair(min , max);
        }
    }
}
