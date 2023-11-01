package Riccardoronca.Java.Spring.D2.entities;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class Bevande {
    private String nome;
    private int calorie;
    private double prezzo;

    public Bevande(String nome, int calorie, double prezzo) {
        this.nome = nome;
        this.calorie = calorie;
        this.prezzo = prezzo;
    }

    @Override
    public String toString() {
        return "Bevande{" +
                "name ='"+" " + nome +
                ", calories =" +" "+ calorie + " " +"Kcal"+
                ", price =" +" "+ prezzo + " " +"$" +
                '}';

    }

}

