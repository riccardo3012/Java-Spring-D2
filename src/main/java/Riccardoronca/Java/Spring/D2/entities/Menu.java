package Riccardoronca.Java.Spring.D2.entities;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter

public class Menu {
    public List<Pizza> pizza;
    public List<Bevande> bevande;
    public List<Topping> topping;

    public Menu(List<Pizza> pizza, List<Bevande> bevande, List<Topping> topping) {
        this.pizza = pizza;
        this.bevande = bevande;
        this.topping = topping;
    }

    @Override
    public String toString() {
        return "{" + pizza + bevande + topping + '}';
    }


}