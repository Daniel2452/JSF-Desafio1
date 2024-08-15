package sv.edu.udb.www.beans;

import sv.edu.udb.www.models.Product;
import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;
import java.util.ArrayList;
import java.util.List;

@Named
@RequestScoped
public class ProductBean {

    private List<Product> products;
    private String message;

    @PostConstruct
    public void init() {
        products = new ArrayList<>();
        products.add(new Product("Guantes", "Guantes de látex", 5.99, "resources/img/guantes.jpg"));
        products.add(new Product("Mascarilla", "Mascarilla quirúrgica", 1.99, "resources/img/mascarilla-quirurgica.jpg"));
        products.add(new Product("Termómetro", "Termómetro digital", 10.99, "resources/img/termometro-digital.jpg"));
        products.add(new Product("Alcohol en Gel", "Alcohol en gel 70%", 3.49, "resources/img/alcohol-gel.jpg"));
        products.add(new Product("Botiquín", "Botiquín de primeros auxilios", 25.00, "resources/img/botiquin.jpg"));
        products.add(new Product("Papel Higiénico", "Papel higiénico 4 rollos", 2.99, "resources/img/papel-higienico.jpg"));
        products.add(new Product("Gafas de Protección", "Gafas de protección ocular", 6.99, "resources/img/gafas-proteccion.jpg"));
        products.add(new Product("Mascarillas FFP2", "Mascarillas FFP2, paquete de 10", 12.99, "resources/img/mascarillas.jpg"));
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public List<Product> getProducts() {
        return products;
    }

    public String generateJson() {

        this.message = "¡Hola Developer! este es el endpoint para consumir el listado de productos como servicio: http://localhost:8080/DWF404_PENA_CARLOS_MOLINA_DANIEL-1.0-SNAPSHOT/rest/products";
        return null;
    }

}
