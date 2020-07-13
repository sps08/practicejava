package Java8;

import java.util.Comparator;

public class java8Stream implements Comparable<java8Stream> {

	String name;
	String sex;
	Double salary;
	
	public java8Stream(String name, String sex, Double salary) {
		super();
		this.name = name;
		this.sex = sex;
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}
	
	@Override
	public int compareTo(java8Stream o) {
         return this.getName().compareTo(((java8Stream) o).getName());
    }
	
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		
		if(obj == null) return false;
		if(!(obj instanceof java8Stream))
			return false;
		if(obj==this)
			return true;
		return this.getName() == ((java8Stream)obj).getName();
		//return super.equals(obj);
	}
	
//	@Override
//	public int hashCode() {
//		
//		return getName()!=null?getName().hashCode():0;
//		//return super.hashCode();
//	}
//	
//	@Override
//	 public int compareTo(java8Stream o) {
//	    return  (this.getSalary() < ((java8Stream) o).getSalary() ? -1 : (this.getSalary() == ((java8Stream) o).getSalary() ? 0 : 1));
//	}

//	
//	@Override
//	public String toString() {
//		// TODO Auto-generated method stub
//		return super.toString();
//	}


	



		

}
