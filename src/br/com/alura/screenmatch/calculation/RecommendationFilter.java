package br.com.alura.screenmatch.calculation;

public class RecommendationFilter {
    private String recommendation;

    public void filter(Ratable retable) {
        if (retable.getRate() >= 4) {
            System.out.println("Está entre os preferidos do momento!");
        } else if (retable.getRate() >= 2 ) {
            System.out.println("Muito bem avaliado!");
        } else {
            System.out.println("Coloque na sua lista para assistir depois.");
        }
    }
}
