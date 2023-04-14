package br.com.alura.screenmatch.main;

import br.com.alura.screenmatch.models.Movie;
import br.com.alura.screenmatch.models.Series;
import br.com.alura.screenmatch.models.Title;

import java.util.*;

public class MainwithLists {
    public static void main (String[] args) {
        Movie eOVentoLevou = new Movie("E o Vento Levou",1939);
        eOVentoLevou.setRating(9);

        Movie run = new Movie("Run", 2020);
        run.setRating(5);

        Movie avatar = new Movie("Avatar",2023);
        avatar.setRating(6);

        Movie interestelar = new Movie("Interestelar",2014);
        interestelar.setRating(10);

        Series lost = new Series("Lost", 2004);
        lost.setRating(4);

//        ArrayList<Title> list = new ArrayList<>();
        List<Title> list = new LinkedList<>();
        list.add(avatar);
        list.add(eOVentoLevou);
        list.add(run);
        list.add(interestelar);
        list.add(lost);

        for (int i = 0; i < list.size() -1; i++) {


            System.out.println(list.get(i));
//            System.out.println(list.get(i).getClass());

        }

        System.out.println("------------------------------------------------------");
        for (Title item:list) {
            System.out.println(item.getName());

            if (item instanceof Movie movie && movie.getRate() > 2) {
                System.out.println("Classificação " + movie.getRate());
            }

            if (item instanceof Series series) {
                System.out.println("Classificação " + series.getRating());
            }


            System.out.println();
        }

        System.out.println("------------------------------------------------------");
        ArrayList<String> buscaporArtista = new ArrayList<>();
        buscaporArtista.add("Adam Sandler");
        buscaporArtista.add("Paulo");
        buscaporArtista.add("Jaqueline");

        System.out.println(buscaporArtista);

        System.out.println(" Ordernação de ArrayList                                                                                                 ------------------------------------------------------");
        Collections.sort(buscaporArtista);
        System.out.println(buscaporArtista);


        System.out.println("------------------------------------------------------");
        Collections.sort(buscaporArtista);
        System.out.println("Depois da Ordenação");
        System.out.println(buscaporArtista);

        // Ordenando por nome
        System.out.println(list);
        Collections.sort(list);

        System.out.println(list);

        // odernando pelo atributo ano
        list.sort(Comparator.comparing(Title::getReleaseYear));
        System.out.println(list);
    }
}
