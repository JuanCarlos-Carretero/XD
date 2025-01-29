package com.entrainement;

import javax.ws.rs.ApplicationPath;
import org.glassfish.jersey.server.ResourceConfig;
import io.swagger.jaxrs.config.BeanConfig;

@ApplicationPath("/api")
public class JerseyConfig extends ResourceConfig {
    public JerseyConfig() {
        // Registra tus clases de recursos aquí
        packages("com.entrainement.rest");

        // Configura Swagger para escanear las clases de recursos en el paquete especificado
        BeanConfig beanConfig = new BeanConfig();
        beanConfig.setVersion("1.0");
        beanConfig.setSchemes(new String[]{"http"});
        beanConfig.setHost("localhost:8080");
        beanConfig.setBasePath("/api");
        beanConfig.setResourcePackage("com.entrainement.rest");
        beanConfig.setScan(true);

        // Registra los componentes de Swagger necesarios
        register(io.swagger.jaxrs.listing.ApiListingResource.class);
        register(io.swagger.jaxrs.listing.SwaggerSerializers.class);
    }
}
