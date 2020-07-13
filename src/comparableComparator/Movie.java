package comparableComparator;

public class Movie implements Comparable<Movie> {
	
	private double rating;
	private String name;
	private int year;
	
	
	public Movie( String name,double rating, int year) {
		super();
		this.rating = rating;
		this.name = name;
		this.year = year;
	}
	
	public double getRating() {
		return rating;
	}
	public String getName() {
		return name;
	}
	public int getYear() {
		return year;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.name +"----" +  this.rating+ "----"+ this.year;
	}

	@Override
	public int compareTo(Movie o) {
		// TODO Auto-generated method stub
		return this.year - o.year;
	}
}
