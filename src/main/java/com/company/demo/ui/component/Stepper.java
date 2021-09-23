package com.company.demo.ui.component;

import io.jmix.ui.component.Field;
import io.jmix.ui.meta.*;

import javax.validation.constraints.Positive;

// note that Stepper should extend Field
@StudioComponent(category = "Samples",
        unsupportedProperties = {"description", "icon", "responsive"},
        xmlns = "http://schemas.company.com/demo/0.1/ui-component.xsd",
        xmlnsAlias = "app",
        icon = "com/company/demo/ui/component/icons/stepper.svg",
        canvasBehaviour = CanvasBehaviour.INPUT_FIELD)
@StudioProperties(properties = {
        @StudioProperty(name = "dataContainer", type = PropertyType.DATACONTAINER_REF),
        @StudioProperty(name = "property", type = PropertyType.PROPERTY_PATH_REF, options = "int"),
}, groups = @PropertiesGroup(
        properties = {"dataContainer", "property"}, constraint = PropertiesConstraint.ALL_OR_NOTHING
))
public interface Stepper extends Field<Integer> {

    String NAME = "stepper";

    @StudioProperty(name = "manualInput", type = PropertyType.BOOLEAN, defaultValue = "true")
    void setManualInputAllowed(boolean value);
    boolean isManualInputAllowed();

    @StudioProperty(name = "mouseWheel", type = PropertyType.BOOLEAN, defaultValue = "true")
    void setMouseWheelEnabled(boolean value);
    boolean isMouseWheelEnabled();

    @StudioProperty(type = PropertyType.INTEGER, defaultValue = "1")
    @Positive
    void setStepAmount(int amount);
    int getStepAmount();

    @StudioProperty(type = PropertyType.INTEGER)
    void setMaxValue(int maxValue);
    int getMaxValue();

    @StudioProperty(type = PropertyType.INTEGER)
    void setMinValue(int minValue);
    int getMinValue();
}
