package entities;
import java.util.List;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class Pizza {
    private String nome;
    private List<String> topping;
    private int calorie;
    private double prezzo;

    public Pizza(String nome, List<String> topping, int calorie, double prezzo) {
        this.nome = nome;
        this.topping = topping;
        this.calorie = calorie;
        this.prezzo = prezzo;
    }
    @Override
    public String toString(){
        return "nome ='" +" " + nome + '\'' +
                ", calorie ="+" " + calorie + " " + "Kcal"+
                ", prezzo =" +" "+ prezzo + " " +"$"+
                '}';

    }
}