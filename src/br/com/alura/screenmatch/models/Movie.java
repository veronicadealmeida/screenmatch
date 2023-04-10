package br.com.alura.screenmatch.models;

import br.com.alura.screenmatch.calculation.Ratable;

public class Movie extends Title implements Ratable {
    private String director;

    @Override
    public int getRate() {
        return (int) takeAverage() / 2;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }


}

