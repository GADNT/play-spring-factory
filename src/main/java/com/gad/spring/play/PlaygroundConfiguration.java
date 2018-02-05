package com.gad.spring.play;

import com.gad.spring.play.service.PlayFactory;
import org.springframework.beans.factory.config.ServiceLocatorFactoryBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class PlaygroundConfiguration {


    @Bean
    public ServiceLocatorFactoryBean serviceLocatorFactoryBean(){
        ServiceLocatorFactoryBean serviceLocatorFactoryBean = new ServiceLocatorFactoryBean();
        serviceLocatorFactoryBean.setServiceLocatorInterface(PlayFactory.class);
        return serviceLocatorFactoryBean;
    }

}
