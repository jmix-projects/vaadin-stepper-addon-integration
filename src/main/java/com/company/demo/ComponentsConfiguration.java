package com.company.demo;

import com.company.demo.ui.component.Stepper;
import com.company.demo.ui.component.impl.StepperImpl;
import com.company.demo.ui.component.loader.StepperLoader;
import io.jmix.ui.sys.registration.ComponentRegistration;
import io.jmix.ui.sys.registration.ComponentRegistrationBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ComponentsConfiguration {

    @Bean
    public ComponentRegistration stepper() {
        return ComponentRegistrationBuilder.create(Stepper.NAME)
                .withComponentClass(StepperImpl.class)
                .withComponentLoaderClass(StepperLoader.class)
                .build();
    }
}
