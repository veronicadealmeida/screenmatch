package br.com.alura.screenmatch.main;

import br.com.alura.screenmatch.calculation.RecommendationFilter;
import br.com.alura.screenmatch.calculation.TimeCalculator;
import br.com.alura.screenmatch.models.Episode;
import br.com.alura.screenmatch.models.Movie;
import br.com.alura.screenmatch.models.Series;
import br.com.alura.screenmatch.models.Title;

import java.io.File;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Movie eOVentoLevou = new Movie("E o Vento Levou",1939);
        eOVentoLevou.setRating(4.8);
        eOVentoLevou.setTotalRatings(146);
        eOVentoLevou.setTimeInMinutes(238);
        eOVentoLevou.setIsIncludedInPlan(true);

        eOVentoLevou.ShowTechnicalSheet();


        Movie run = new Movie("Run", 2020);
        run.setRating(4.9);
        run.setTotalRatings(2000);
        run.setTimeInMinutes(90);
        run.setIsIncludedInPlan(true);

//        System.out.println("Duração do Filme: " + eOVentoLevou.getTimeInMinutes());

        Series lost = new Series("Lost", 2004);
        lost.ShowTechnicalSheet();
        lost.setSeasons(6);
        lost.setEpisodesPerSeason(20);
        lost.setMinutesPerEpisode(40);
//        System.out.println("Temporadas: " + lost.getSeasons());
//        System.out.println("Minutos por temporada: " + lost.getMinutesPerEpisode());
//        System.out.println("Episódios por temporada: " + lost.getEpisodesPerSeason());
//        System.out.println("Duração paara maratornar Lost: " + lost.getTimeInMinutes());


//        System.out.println("-----------------------");
        Movie avatar = new Movie("Avatar",2023);
        avatar.setTimeInMinutes(200);

        TimeCalculator calculator = new TimeCalculator();
        calculator.add(avatar);
        calculator.add(lost);
        calculator.add(eOVentoLevou);

//        System.out.println( "Tempo total para assistir: " + calculator.getTotalTime());

//        System.out.println("-----------------------");
        RecommendationFilter filter = new RecommendationFilter();
        filter.filter(eOVentoLevou);

//        System.out.println(eOVentoLevou.getName() + " " + eOVentoLevou.getRating());


        Episode lostEpisodeOne = new Episode();
        lostEpisodeOne.setNumber(1);
        lostEpisodeOne.setSeries(lost);
        lostEpisodeOne.setTotalViews(300);
        filter.filter(lostEpisodeOne);
//        System.out.println(lost.getName() + " " + lostEpisodeOne.getTotalViews());

        System.out.println("-----------------------");

        var interestelar = new Movie("Interestelar",2014);

        ArrayList<Movie> movieList = new ArrayList<>();
        movieList.add(avatar);
        movieList.add(eOVentoLevou);
        movieList.add(run);
        movieList.add(interestelar);
        System.out.println("Tamanho da lista " + movieList.size());
        System.out.println("Primeiro filme " + movieList.get(0).getName());
        System.out.println(movieList);
        System.out.println("toString do Filme " + movieList.get(0).toString());

        System.out.println("-----------------------");

    }
}