package de.saschadoemer.iso11783;

import de.saschadoemer.iso11873.DeviceLocalizationLabelEncoder;
import de.saschadoemer.iso11873.DeviceLocalizationLabelParameters;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class DeviceLocalizationLabelEncoderTest {

    @Test
    void givenNullAsParameterValuesWhenEncodingDeviceLocalizationLabelThenTheEncoderShouldThrowAnException(){
        Assertions.assertThrows(IllegalArgumentException.class,()->new DeviceLocalizationLabelEncoder().encode(null));
    }

    @Test
    void givenEmptyParameterValuesWhenEncodingDeviceLocalizationLabelThenTheEncoderShouldThrowAnException(){
        Assertions.assertThrows(IllegalArgumentException.class,()->new DeviceLocalizationLabelEncoder().encode(new DeviceLocalizationLabelParameters()));
    }



}
