
public class NetflixRunner {
	public static void main(String[] args) {
		Movie m1 = new Movie("Guardians of the Galaxy", 8);
			m1.getTitle();
			m1.getRating();
			m1.getTicketPrice();
		Movie m2 = new Movie("Transformers: The Last Knight", 7);
			m2.getTitle();
			m2.getRating();
			m2.getTicketPrice();
		Movie m3 = new Movie("Gravity", 7);
			m3.getTitle();
			m3.getRating();
			m3.getTicketPrice();
		Movie m4 = new Movie("Interstellar", 7);
			m4.getTitle();
			m4.getRating();
			m4.getTicketPrice();
		Movie m5 = new Movie("The Martian", 9);
			m5.getTitle();
			m5.getRating();
			m5.getTicketPrice();
		
		NetflixQueue queue = new NetflixQueue();
			queue.addMovie(m1);
			queue.addMovie(m2);
			queue.addMovie(m3);
			queue.addMovie(m4);
			queue.addMovie(m5);
			queue.sortMoviesByRating();
			queue.printMovies();
			queue.getBestMovie();
			queue.bestMovie();
			queue.secondBest();
	}
}
