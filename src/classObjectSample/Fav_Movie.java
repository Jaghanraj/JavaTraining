package classObjectSample;
class Movie {
	String MovieName;
	String Actor;
	String Actress;
	String Director;
	int ViewersRating;
	public Movie(String MovieName,String Actor,String Actress,String Director,int ViewersRating)
	{
		this.MovieName = MovieName;
		this.Actor = Actor;
		this.Actress = Actress;
		this.Director = Director;
		this.ViewersRating = ViewersRating;
	}
	public void display() {
		System.out.println("Name of the movie :" +MovieName +"\n"+"Hero of the movie :" +Actor+"\n"+
	"Actress of the movie :" +Actress+"\n"+"Director of the movie :" +Director+"\n"+"Rating of the movie :" +ViewersRating+"\n\n");
	}
	
}


public class Fav_Movie {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Movie movie1 = new Movie("Sivaji","Rajini","Shreya","Shankar",4);
		movie1.display();
		Movie movie2 = new Movie("Gilli","Vijay","Trisha","Hari",4);
		movie2.display();
		Movie movie3 = new Movie("valimai","Ajith","Huma","Vinoth",5);
		movie3.display();

	}

}
