package com.aion.smartapi.smartapi.camel.router;


import org.apache.camel.CamelContext;
import org.apache.camel.Endpoint;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.model.ChoiceDefinition;
import org.apache.camel.model.RouteDefinition;
import org.apache.camel.spring.SpringRouteBuilder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;
import org.springframework.util.Assert;

import java.util.ArrayList;
import java.util.List;

@Component
public class RouterBuilderInit extends RouteBuilder implements
        InitializingBean {

    Class<?> clazz = getClass();

    private static final Logger LOGGER = LoggerFactory
            .getLogger(RouterBuilderInit.class);

    private final CamelContext camelContext;

    public RouterBuilderInit(CamelContext camelContext){
        System.out.println("entra al constructor");
        Assert.notNull(camelContext,"CamelContext must not be null");
        this.camelContext = camelContext;
    }

    public void afterPropertiesSet() {
        // Verifica ruteos
        try {
            System.out.println("entra a verificar");
        } catch (Exception e) {
            LOGGER.debug(String.valueOf(e),clazz);
        }

    }

    @Override
    public void configure() {
        System.out.println("entra a Configurar");
        System.out.println(camelContext.toString());
    }

}
