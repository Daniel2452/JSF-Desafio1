package sv.edu.udb.www.rest;

import sv.edu.udb.www.beans.ProductBean;
import sv.edu.udb.www.models.Product;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.json.Json;
import javax.json.JsonArrayBuilder;
import javax.json.JsonObjectBuilder;
import javax.ws.rs.core.Response.Status;
import java.util.logging.Level;
import java.util.logging.Logger;

@Path("/products")
public class ProductService {

    @Inject
    private ProductBean productBean;

    private static final Logger LOGGER = Logger.getLogger(ProductService.class.getName());

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response getProducts() {
        try {
            return Response.ok(productListAsJson()).build();
        } catch (Exception e) {
            LOGGER.log(Level.SEVERE, "Error al generar el JSON de productos", e);
            return Response.status(Status.INTERNAL_SERVER_ERROR)
                    .entity("{\"error\":\"Error interno del servidor al generar el JSON\"}")
                    .build();
        }
    }

    private String productListAsJson() throws Exception {
        JsonArrayBuilder jsonArrayBuilder = Json.createArrayBuilder();

        try {
            for (Product product : productBean.getProducts()) {
                JsonObjectBuilder jsonObjectBuilder = Json.createObjectBuilder()
                        .add("name", product.getName())
                        .add("description", product.getDescription())
                        .add("price", product.getPrice())
                        .add("imageUrl", product.getImageUrl());

                jsonArrayBuilder.add(jsonObjectBuilder);
            }
        } catch (Exception e) {
            LOGGER.log(Level.SEVERE, "Error al procesar la lista de productos", e);
            throw new Exception("Error al procesar la lista de productos", e);
        }

        return jsonArrayBuilder.build().toString();
    }
}
