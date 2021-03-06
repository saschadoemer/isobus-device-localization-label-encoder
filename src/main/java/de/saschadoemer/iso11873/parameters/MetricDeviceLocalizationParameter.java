package de.saschadoemer.iso11873.parameters;

import de.saschadoemer.iso11873.enums.UnitSystem;
import de.saschadoemer.iso11873.enums.units.*;

/**
 * Device localization parameters, especially for the metric system. All units are predefined.
 */
public class MetricDeviceLocalizationParameter extends DeviceLocalizationLabelParameter {

    public MetricDeviceLocalizationParameter() {
        super();
        distanceUnit = DistanceUnit.METRIC;
        areaUnit = AreaUnit.METRIC;
        volumeUnit = VolumeUnit.METRIC;
        massUnit = MassUnit.METRIC;
        temperatureUnit = TemperatureUnit.METRIC;
        pressureUnit = PressureUnit.METRIC;
        forceUnit = ForceUnit.METRIC;
        unitSystem = UnitSystem.METRIC;
    }

}
