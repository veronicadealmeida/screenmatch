public class Main {
    public static void main(String[] args) {
        Movie myMovie = new Movie();
        myMovie.setName("E o Vento Levou");
        myMovie.setReleaseYear(1939);
        myMovie.setRating(4.8);
        myMovie.setTotalRatings(146);
        myMovie.setTimeInMinutes(238);
        myMovie.setIsIncludedInPlan(true);

        myMovie.showMovieData();

        myMovie.setRating(4.8);
        myMovie.setRating(10);
        myMovie.setRating(10);
        myMovie.setRating(10);

        System.out.println(myMovie.getName());
        System.out.println(myMovie.getRating());
        System.out.println(myMovie.getTotalRatings());
        System.out.println(myMovie.AveragedRatings());
    }
}