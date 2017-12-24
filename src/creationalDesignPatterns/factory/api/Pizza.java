package creationalDesignPatterns.factory.api;

import creationalDesignPatterns.factory.api.ingredient.Cheese;
import creationalDesignPatterns.factory.api.ingredient.Clams;
import creationalDesignPatterns.factory.api.ingredient.Dough;
import creationalDesignPatterns.factory.api.ingredient.Pepperoni;
import creationalDesignPatterns.factory.api.ingredient.Sauce;
import creationalDesignPatterns.factory.api.ingredient.Veggies;

import java.util.Arrays;

/**
 * Pizza.
 * Date: 07/18/2017
 *
 * @author Mikalai Bezmen
 */
public abstract class Pizza {

    private String name;
    private Dough dough;
    private Sauce sauce;
    private Veggies veggies[];
    private Cheese cheese;
    private Pepperoni pepperoni;
    private Clams clam;

    public abstract void prepare();

    public void bake() {
        System.out.println("Bake for 25 minutes at 350");
    }

    public void cut() {
        System.out.println("Cutting the pizza into diagonal slices");
    }

    public void box() {
        System.out.println("Place pizza in official PizzaStore box");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Dough getDough() {
        return dough;
    }

    public void setDough(Dough dough) {
        this.dough = dough;
    }

    public Sauce getSauce() {
        return sauce;
    }

    public void setSauce(Sauce sauce) {
        this.sauce = sauce;
    }

    public Veggies[] getVeggies() {
        return veggies;
    }

    public void setVeggies(Veggies[] veggies) {
        this.veggies = veggies;
    }

    public Cheese getCheese() {
        return cheese;
    }

    public void setCheese(Cheese cheese) {
        this.cheese = cheese;
    }

    public Pepperoni getPepperoni() {
        return pepperoni;
    }

    public void setPepperoni(Pepperoni pepperoni) {
        this.pepperoni = pepperoni;
    }

    public Clams getClam() {
        return clam;
    }

    public void setClam(Clams clam) {
        this.clam = clam;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Pizza)) return false;

        Pizza pizza = (Pizza) o;

        if (name != null ? !name.equals(pizza.name) : pizza.name != null) return false;
        if (dough != null ? !dough.equals(pizza.dough) : pizza.dough != null) return false;
        if (sauce != null ? !sauce.equals(pizza.sauce) : pizza.sauce != null) return false;
        // Probably incorrect - comparing Object[] arrays with Arrays.equals
        if (!Arrays.equals(veggies, pizza.veggies)) return false;
        if (cheese != null ? !cheese.equals(pizza.cheese) : pizza.cheese != null) return false;
        if (pepperoni != null ? !pepperoni.equals(pizza.pepperoni) : pizza.pepperoni != null) return false;
        return clam != null ? clam.equals(pizza.clam) : pizza.clam == null;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (dough != null ? dough.hashCode() : 0);
        result = 31 * result + (sauce != null ? sauce.hashCode() : 0);
        result = 31 * result + Arrays.hashCode(veggies);
        result = 31 * result + (cheese != null ? cheese.hashCode() : 0);
        result = 31 * result + (pepperoni != null ? pepperoni.hashCode() : 0);
        result = 31 * result + (clam != null ? clam.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Pizza{");
        sb.append("name='").append(name).append('\'');
        sb.append(", dough='").append(dough).append('\'');
        sb.append(", sauce='").append(sauce).append('\'');
        sb.append(", veggies=").append(Arrays.toString(veggies));
        sb.append(", cheese=").append(cheese);
        sb.append(", pepperoni=").append(pepperoni);
        sb.append(", clam=").append(clam);
        sb.append('}');
        return sb.toString();
    }
}
