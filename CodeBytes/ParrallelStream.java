package CodeBytes;

import java.util.Arrays;
import java.util.stream.Stream;

import jdk.javadoc.internal.doclets.toolkit.util.DocFinder.Output;

import java.util.List;
import java.util.concurrent.ForkJoinPool;

public class ParrallelStream {

    public static void use (final Stream<Integer> stream) {
        stream
        .parallel()
        .map(e -> transform(e))
        // .sequential()
        .forEach(System.out::println);
    }

    public static void main(final String[] args) {
         List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
         use(numbers.stream());
// reduce does not take a initial value but it takes an identity value ( eg: for int  + it is 0 , for int *  it is 1)
//what we work with is a monoid , a) there is an identity value b) the operation you persofmr will belong to original set
//io intensive prob , computation int problem. comput inv #T <= no of cores. For IO int #T > # cores
// #T <= #Cores
//      --------
//      1 -blocking factor

        System.out.println(ForkJoinPool.commonPool());

    }

    public static int transform(final int number) {
        System.out.println( "t " + number + Thread.currentThread());
        sleep(1000);
        return number* 1;

    }

    private static boolean sleep(int ms) {
        try {
            Thread.sleep(ms);
        } catch (Exception e) {
            e.printStackTrace();
            //TODO: handle exception
        }
        return true;
    }
}
