package Interface;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;



public class FuncJava8 {

	public static void main(String[] args) {
		//function8();
		List<String> list = Arrays.asList("node", "c++", "java", "javascript");
		Map<String,Integer> result = convertTomap(list, x-> x.length());
		 //result.forEach(System.out::println);
		System.out.println(result);
	}
	

	public static <T, R> Map<T,R> convertTomap(List<T> list, Function<T, R> func) {

        Map<T,R> result = new HashMap<>();
        for (T t : list) {
            result.put(t, func.apply(t));
        }
        return result;
    
    }
	
	
//	public static void function8(){
//		Function<String, Integer> func = x -> x.length();
//        Function<Integer, Integer> func2 = x -> x * 2;
//
//        Integer result = func.andThen(func2).apply("satinder");   // 12
//
//        System.out.println(result);
//	}

}
