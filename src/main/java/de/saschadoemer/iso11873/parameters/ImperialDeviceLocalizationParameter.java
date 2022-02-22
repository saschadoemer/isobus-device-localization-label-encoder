package de.saschadoemer.iso11873.parameters;

import de.saschadoemer.iso11873.enums.UnitSystem;
import de.saschadoemer.iso11873.enums.units.*;

/**
 * Device localization parameters, especially for the imperial/us system. All units are predefined.
 */
public class ImperialDeviceLocalizationParameter extends DeviceLocalizationLabelParameter {

    public ImperialDeviceLocalizationParameter() {
        super();
        distanceUnit = DistanceUnit.IMPERIAL_US;
        areaUnit = AreaUnit.IMPERIAL_US;
        volumeUnit = VolumeUnit.IMPERIAL;
        massUnit = MassUnit.IMPERIAL;
        temperatureUnit = TemperatureUnit.IMPERIAL_US;
        pressureUnit = PressureUnit.IMPERIAL_US;
        forceUnit = ForceUnit.IMPERIAL_US;
        unitSystem = UnitSystem.IMPERIAL;
    }

}
