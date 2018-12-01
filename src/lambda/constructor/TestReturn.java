package lambda.constructor;

public interface TestReturn<T> {

    int triCompare(T t1, T t2, T t3);

    public static <T> TestReturn<T> againTest(doThing<? super T> d){
        return   (c1 , c2 , c3) -> d.doJob(c1);
    }
}

interface doThing<T> {

    int doJob(T t);
}
