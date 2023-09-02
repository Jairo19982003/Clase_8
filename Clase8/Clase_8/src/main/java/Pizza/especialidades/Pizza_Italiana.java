package Pizza.especialidades;
import Pizza.base.Topping;
import Pizza.base.Pizza;

public class Pizza_Italiana extends Pizza {

    private String salsa;

    public Pizza_Italiana(String nombre, double precio, String salsa, Topping... toppings) {
        super(nombre, precio, toppings);
        this.salsa = salsa;
    }

    public String getSalsa() {
        return salsa;
    }

    public void setSalsa(String salsa) {
        this.salsa = salsa;
    }
}
