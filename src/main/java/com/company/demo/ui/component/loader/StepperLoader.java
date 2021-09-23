package com.company.demo.ui.component.loader;


import com.company.demo.ui.component.Stepper;
import io.jmix.ui.xml.layout.loader.AbstractFieldLoader;

public class StepperLoader extends AbstractFieldLoader<Stepper> {

    @Override
    public void createComponent() {
        resultComponent = factory.create(Stepper.class);
        loadId(resultComponent, element);
    }

    @Override
    public void loadComponent() {
        super.loadComponent();

        loadBoolean(element, "manualInput", resultComponent::setManualInputAllowed);
        loadBoolean(element, "mouseWheel", resultComponent::setMouseWheelEnabled);

        loadInteger(element, "stepAmount", resultComponent::setStepAmount);
        loadInteger(element, "maxValue", resultComponent::setMaxValue);
        loadInteger(element, "minValue", resultComponent::setMinValue);
    }
}
