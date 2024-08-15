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

@Path("/products")
public class ProductService {

    @Inject
    private ProductBean productBean;

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response getProducts() {
        // Devuelve la lista de productos en formato JSON
        return Response.ok(productListAsJson()).build();
    }

    private String productListAsJson() {
        JsonArrayBuilder jsonArrayBuilder = Json.createArrayBuilder();

        for (Product product : productBean.getProducts()) {
            JsonObjectBuilder jsonObjectBuilder = Json.createObjectBuilder()
                    .add("name", product.getName())
                    .add("description", product.getDescription())
                    .add("price", product.getPrice())
                    .add("imageUrl", product.getImageUrl());

            jsonArrayBuilder.add(jsonObjectBuilder);
        }

        return jsonArrayBuilder.build().toString();
    }
}
