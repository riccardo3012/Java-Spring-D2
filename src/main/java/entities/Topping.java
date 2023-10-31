package entities;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class Topping {
    private String nome;
    private int calorie;
    private double prezzo;

    public String getNome() {
        return nome;
    }

    public Topping(String nome, int calorie, double prezzo) {
        this.nome = nome;
        this.calorie = calorie;
        this.prezzo = prezzo;


    }

    @Override

    public String toString() {
        return "Topping{" +
                "name ='"+" " + nome +
                ", calories ="+" " + calorie +" " + "Kcal"+
                ", price =" +" "+ prezzo + " " +"%"+
                '}';
    }



}


