package Riccardoronca.Java.Spring.D2.entities;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public abstract class Ordinazione {
    private String prodotto;
    private int calorie;
    private double prezzo;

    public double getPrezzo() {
        return prezzo;
    }

    public Ordinazione(String nome, int calorie, double prezzo) {
        this.prodotto = nome;
        this.calorie = calorie;
        this.prezzo = prezzo;
    }

    @Override
    public String toString(){
        return "Ordinazione ='" +" " + prodotto +
                ", calorie ="+" " + calorie + " " + "Kcal"+
                ", prezzo =" +" "+ prezzo + " " +"$";

    }


}
