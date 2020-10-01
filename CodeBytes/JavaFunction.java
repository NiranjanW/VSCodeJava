package CodeBytes;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;

public class JavaFunction {
    public static void main(String[] args) {
        Function<String, Integer> func1 = x -> x.length();

        JavaFunction obj = new JavaFunction();
        List<String> list = Arrays.asList("node", "c++", "java", "javascript");
        Map<String,Integer> map1 = obj.convertListToMap(list , x -> x.length());

        //method Reference

   

        Integer result = func1.apply("Hello");
        System.out.println(map1);

        List <Integer> listNum = Arrays.asList(1,2,3,4,5,6,7,8);

        System.out.println(
            listNum.stream()
            .filter((e -> e% 2 ==0))
            .mapToInt( e -> e*2)
            .sum()
        );
         
    }

    
    public <T, R> Map<T, R> convertListToMap(List<T> list, Function<T, R> func){

        Map<T,R> result = new HashMap<>();
        for (T t :list){
            result.put(t, func.apply(t));
        }
        return result;
    }

    public Integer getLength(String str) {
        return str.length();
    }
}