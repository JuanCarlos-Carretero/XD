package com.entrainement;

import javax.ws.rs.ApplicationPath;
import org.glassfish.jersey.server.ResourceConfig;
import io.swagger.jaxrs.config.BeanConfig;

@ApplicationPath("/api")
public class JerseyConfig extends ResourceConfig {
    public JerseyConfig() {
        // Enregistrez vos classes de ressources ici
        packages("com.entrainement.rest");

        // Configurez Swagger pour scanner les classes de ressources dans le paquet spécifié
        BeanConfig beanConfig = new BeanConfig();
        beanConfig.setVersion("1.0");
        beanConfig.setSchemes(new String[]{"http"});
        beanConfig.setHost("localhost:8080");
        beanConfig.setBasePath("/XD/api");
        beanConfig.setResourcePackage("com.entrainement.rest");
        beanConfig.setScan(true);

        // Enregistrez les composants nécessaires de Swagger
        register(io.swagger.jaxrs.listing.ApiListingResource.class);
        register(io.swagger.jaxrs.listing.SwaggerSerializers.class);
        register(OpenAPIServlet.class);
    }
}