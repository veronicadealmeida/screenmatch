public class Movie {
    private String name; /* atributos */
    private int releaseYear;
    private int timeInMinutes;
    private boolean isIncludedInPlan;
    private double rating;
    private int totalRatings;

    void showMovieData() {
        System.out.println("******************************************");

        System.out.println("Nome do filme: " + name );
        System.out.println("Ano de Lançamento: " + releaseYear );
        System.out.println("Duração: " + timeInMinutes );
        System.out.println("Incluído no Plano: " + isIncludedInPlan );
        System.out.println("Avaliação: " + rating );
        System.out.println("Total de Avaliações: " + totalRatings );

        System.out.println("******************************************");

    }

    /* método */
    void Rate(double score) {
        this.rating += score;
        this.totalRatings++;
    }

    double AveragedRatings(){
        return ( this.rating / this.totalRatings * 100 );
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }

    public int getTimeInMinutes() {
        return timeInMinutes;
    }

    public void setTimeInMinutes(int timeInMinutes) {
        this.timeInMinutes = timeInMinutes;
    }

    public boolean isIncludedInPlan() {
        return isIncludedInPlan;
    }

    public void setIsIncludedInPlan(boolean isIncludedInPlan) {
        this.isIncludedInPlan = isIncludedInPlan;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.totalRatings++;
        this.rating += rating / this.totalRatings;

    }

    public int getTotalRatings() {
        return totalRatings;
    }

    public void setTotalRatings(int totalRatings) {
        this.totalRatings = totalRatings;
    }
}
