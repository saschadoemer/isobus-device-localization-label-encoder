package de.saschadoemer.iso11873.builder;

import de.saschadoemer.iso11873.parameters.MetricDeviceLocalizationParameter;

/**
 * Builder class for the parameter.
 */
public class MetricDeviceLocalizationLabelParameterBuilder extends DeviceLocalizationLabelParameterBuilder {

    public MetricDeviceLocalizationLabelParameterBuilder() {
        super(new MetricDeviceLocalizationParameter());
    }
}
