package constructorsexamples;

public class Movie {
		private int movieId;
		private String movieName;
		private double movieRating;

		public void setmovieInfo(int movieId,String movieName,double movieRating) {
			this.movieId=movieId;
			this.movieName=movieName;
			this.movieRating=movieRating;
		}
		public void showmovieinfo() {
			System.out.println(movieId);
			System.out.println(movieName);
			System.out.println(movieRating);
			
		}
}
