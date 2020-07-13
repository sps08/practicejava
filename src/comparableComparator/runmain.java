package comparableComparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class runmain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Movie> mv = new ArrayList<Movie>();
		mv.add(new Movie("Force",8.3,2013));
		mv.add(new Movie("Star Wars",5.8,2017));
		mv.add(new Movie("Little things",8.8,2020));
		mv.add(new Movie("Stranger things",7.8,2016));
		mv.add(new Movie("Money Heist",9.0,2018));
		mv.add(new Movie("El Chapo",5.5,2017));
		
		Collections.sort(mv);
		mv.stream().forEach(System.out::println);
		
		
		Collections.sort(mv , new Comparator<Movie>() {
			@Override
			public int compare(Movie o1, Movie o2) {
				// TODO Auto-generated method stub
				return o1.getName().compareTo(o2.getName());
			}
		});
		
		//Collections.sort(mv);
		System.out.println("############# Comparator ##########");
		mv.stream().forEach(System.out::println);
		
		

	}

}
