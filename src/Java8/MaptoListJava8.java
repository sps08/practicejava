package Java8;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class MaptoListJava8 {

	public static void main(String[] args) {
		//withoutJava8();
		withJava8();

	}
	
	private static void withJava8() {
		Map<Integer, String> map = new HashMap<Integer,String>();
		map.put(10, "a");
		map.put(20, "b");
		map.put(30, "c");
		map.put(40, "d");
		map.put(50, "e");
		
		List<Integer> ls = map.keySet().stream().collect(Collectors.toList());
		ls.forEach(System.out::println);
		
		List<?> ls2 = map.values().stream().collect(Collectors.toList());
		ls2.forEach(System.out::println);
		
	}

	public static void withoutJava8(){
		Map<Integer, String> map = new HashMap<Integer,String>();
		map.put(10, "a");
		map.put(20, "b");
		map.put(30, "c");
		map.put(40, "d");
		map.put(50, "e");
		
		List<Integer> res = new ArrayList<>(map.keySet());
		res.forEach(System.out::println);
		
		List<?> res1 = new ArrayList<>(map.values());
		res1.forEach(System.out::println);
	}

}
