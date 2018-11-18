package innerclass.proxies;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Arrays;
import java.util.Random;

import static com.kursk.Util.print;
import static com.kursk.Util.println;

public class ProxyTest {
    public static void main(String[] args) {
        Object[] elements = new Object[100];

        for(int i=0; i<elements.length; i++)
        {
            Integer value = i + 1;
            InvocationHandler handler = new TraceHandler(value);
            Object proxy = Proxy.newProxyInstance(null , new Class[]{Comparable.class} , handler);
            elements[i] = proxy;
        }

        Integer key = new Random().nextInt(elements.length) + 1;

        int result = Arrays.binarySearch(elements , key);

        if (result >= 0) println(elements[result]);
    }
}

class TraceHandler implements InvocationHandler
{
    private Object target;

    public TraceHandler(Object t)
    {
        target = t;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        print(target);

        print("." + method.getName() + "(");

        if(args != null)
        {
            for(int i=0; i<args.length; i++)
            {
                print(args[i]);
                if ( i < args.length - 1) print(",");
            }
            println(")");
        }

        return method.invoke(target , args);
    }
}
