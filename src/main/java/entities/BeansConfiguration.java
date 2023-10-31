package entities;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Configuration
public class BeansConfiguration {

    //******************************************* Topping ****************************************************


    @Bean
    Topping getPomodoro() {
        return new Topping("Pomodoro", 40, 0.30);
    }

    @Bean
    Topping getMozzarella() {
        return new Topping("Mozzarella", 265, 0.30);
    }

    @Bean
    Topping getWustel() { return new Topping("Wustel", 235, 0.50); }

    @Bean
    Topping getPatatine() {
        return new Topping("Patate fritte", 315, 1.30);
    }

    @Bean
    Topping getFunghi() {
        return new Topping("Funghi", 65, 1.60);
    }

    @Bean
    Topping getSalsiccia() {
        return new Topping("Salsiccia", 325, 1.50);
    }

//******************************************* PIZZE ****************************************************


    @Bean (name = "pizza margherita")
    Pizza pizzaMargherita() {
        List<String> toppingList = new ArrayList<>();
        toppingList.add(getPomodoro().getNome());
        toppingList.add(getMozzarella().getNome());
        return new Pizza("Margherita", toppingList, 1000, 6.00);

    }

    @Bean (name = "pizza americana")
    Pizza pizzaAmericana() {
        List<String> toppingList = new ArrayList<>();
        toppingList.add(getPomodoro().getNome());
        toppingList.add(getMozzarella().getNome());
        toppingList.add(getWustel().getNome());
        toppingList.add(getPatatine().getNome());
        return new Pizza("Americana", toppingList, 1550, 8.50);

    }


    @Bean (name = "pizza Boscaiola")
    Pizza pizzaBoscaiola() {
        List<String> toppingList = new ArrayList<>();
        toppingList.add(getMozzarella().getNome());
        toppingList.add(getFunghi().getNome());
        toppingList.add(getSalsiccia().getNome());
        return new Pizza("Boscaiola", toppingList, 1250, 9.00);

    }



//******************************************* BEVANDE ****************************************************


    @Bean
    Bevande getAcqua(){
        return new Bevande("Acqua", 10, 1.00);
    }

    @Bean
    Bevande getSoda() {
        return new Bevande("Soda", 40, 2.50);
    }

    @Bean
    Bevande getBirra() {
        return new Bevande("Birra", 30, 2.00);
    }

    @Bean
    Bevande getAranciata() {
        return new Bevande("Aranciata", 45, 2.00);
    }

    @Bean
    Bevande getVino() {
        return new Bevande("Vino", 83, 3.00);
    }

    //******************************************* Menu ****************************************************
    @Bean
    Menu getMenu() {
        List<Pizza> pizzeList = new ArrayList<>(Arrays.asList(pizzaMargherita(),pizzaAmericana(),pizzaBoscaiola()));
        List<Topping> toppingList = new ArrayList<>(Arrays.asList(getPomodoro(), getMozzarella(), getWustel(), getPatatine(), getFunghi(), getSalsiccia()));
        List<Bevande> bevandeList = new ArrayList<>(Arrays.asList(getAcqua(),getSoda(), getBirra(),getAranciata(), getVino()));
        return new Menu(pizzeList, bevandeList, toppingList);
    }
}

