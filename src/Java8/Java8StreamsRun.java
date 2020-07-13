package Java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;



public class Java8StreamsRun {

	public static void main(String[] args) {
		java8Stream personobj1 = new java8Stream("Satinder", "male", 23000.45);
		java8Stream personobj2 = new java8Stream("JazzyB", "male", 34004.01);
		java8Stream personobj3 = new java8Stream("Arvinder", "male", 22200.89);
		java8Stream personobj4 = new java8Stream("Manpreet", "female", 63000.25);
		java8Stream personobj5 = new java8Stream("Gurjeet", "male", 530.45);
		java8Stream personobj6 = new java8Stream("Ninja", "male", 23110.00);
		java8Stream personobj7 = new java8Stream("Pallavi", "female", 53000.11);
		java8Stream personobj8 = new java8Stream("Satinder", "male", 23000.45);
		//Scoreboard sc = new Scoreboard(4);
		
		
		System.out.println("personobj1 hashcode = " + personobj1.hashCode());
        System.out.println("personobj8 hashcode = " + personobj8.hashCode());
        

		System.out.println("Checking equality= " + personobj1.equals(personobj8));
        
        
		List<java8Stream> personList = new ArrayList<java8Stream>();
		personList.add(personobj1);
		personList.add(personobj2);
		personList.add(personobj3);
		personList.add(personobj4);
		personList.add(personobj5);
		personList.add(personobj6);
		personList.add(personobj7);
		personList.add(personobj8);
		
		HashSet<java8Stream> personLisths = new HashSet<java8Stream>();
		personLisths.add(personobj8);
		personLisths.add(personobj1);
		
		System.out.println("Contains Satinder?  " + personLisths.contains(new java8Stream("Satinder", "male", 23000.45)));
		
	      System.out.println("#############################");
		//personList.addAll((Collection<? extends java8Stream>) sc);
		
//		Collections.sort(personList);
//		personList.forEach(i -> System.out.println(i.getName() + "--"+ i.getSalary()));
		
//		Collections.sort(personList, new Comparator<java8Stream>() {
//			@Override
//			public int compare(java8Stream h1, java8Stream h2) {
//				return h1.getName().compareTo(h2.getName());
//			}
//		});
		
		
		
		
//		Comparator<java8Stream> comparator1 = new Comparator<java8Stream>() {
//            @Override
//            public int compare(java8Stream emp1, java8Stream emp2) {
//                return  emp1.getSalary().compareTo(emp2.getSalary());
//            }
//        };
//        
//        Comparator<java8Stream> comparator2 = new Comparator<java8Stream>() {
//            @Override
//            public int compare(java8Stream emp1, java8Stream emp2) {
//                return  emp1.getName().compareTo(emp2.getName());
//            }
//        };
		
		Collections.sort(personList);
	personList.forEach(i -> System.out.println(i.getName() + "--"+ i.getSalary()));
        
        Comparator<java8Stream> comparator3 = (emp1, emp2) -> {
            return emp1.getSalary().compareTo(emp2.getSalary());
        };
        
        Comparator<java8Stream> comparator4 = (emp1, emp2) -> {
            return emp1.getName().compareTo(emp2.getName());
        };
        
        System.out.println("#############################");
        Collections.sort(personList, comparator3);
        personList.forEach(i -> System.out.println(i.getName() + "--"+ i.getSalary()));
		
//		
//		personList.sort(
//			      (java8Stream h1, java8Stream h2) -> h1.getName().compareTo(h2.getName()));
//		
//		assertThat(personList.get(0), equalTo(personobj3));
//		personList.forEach(i -> System.out.println(i.getName() + "--"+ i.getSalary()));
//		
//		
//		List<java8Stream> myList  =  personList.stream().filter(c->c.getSex()=="female").collect(Collectors.toList());
//		myList.forEach(i -> System.out.println(i.getName()));
		

	}

}
