import br.com.alura.screenmatch.calculation.TimeCalculator;
import br.com.alura.screenmatch.models.Movie;
import br.com.alura.screenmatch.models.Series;

public class Main {
    public static void main(String[] args) {
        Movie eOVentoLevou = new Movie();
        eOVentoLevou.setName("E o Vento Levou");
        eOVentoLevou.setReleaseYear(1939);
        eOVentoLevou.setRating(4.8);
        eOVentoLevou.setTotalRatings(146);
        eOVentoLevou.setTimeInMinutes(238);
        eOVentoLevou.setIsIncludedInPlan(true);

        eOVentoLevou.ShowTechnicalSheet();

        System.out.println("Duração do Filme: " + eOVentoLevou.getTimeInMinutes());

        Series lost = new Series();
        lost.setName("Lost");
        lost.setReleaseYear(2004);
        lost.ShowTechnicalSheet();
        lost.setSeasons(6);
        lost.setEpisodesPerSeason(20);
        lost.setMinutesPerEpisode(40);
        System.out.println("Temporadas: " + lost.getSeasons());
        System.out.println("Minutos por temporada: " + lost.getMinutesPerEpisode());
        System.out.println("Episódios por temporada: " + lost.getEpisodesPerSeason());

        System.out.println("Duração paara maratornar Lost: " + lost.getTimeInMinutes());


        System.out.println("-----------------------");
        Movie avatar = new Movie();
        avatar.setReleaseYear(2023);
        avatar.setTimeInMinutes(200);

        TimeCalculator calculator = new TimeCalculator();
        calculator.add(avatar);
        calculator.add(lost);
        calculator.add(eOVentoLevou);

        System.out.println( "Tempo total para assistir: " + calculator.getTotalTime());

        System.out.println("-----------------------");
    }
}