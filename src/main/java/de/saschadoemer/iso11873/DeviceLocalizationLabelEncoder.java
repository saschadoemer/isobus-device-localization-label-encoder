package de.saschadoemer.iso11873;

/**
 * Encoder for the device localization label.
 */
public class DeviceLocalizationLabelEncoder {

    public void encode(DeviceLocalizationLabelParameters deviceLocalizationParameters) {
        if (null == deviceLocalizationParameters) {
            throw new IllegalArgumentException("Please provide parameters to encode the device localization label");
        } else {
            if (deviceLocalizationParameters.hasAllNecessaryParameters()) {

            } else {
                throw new IllegalArgumentException("Please check your input. The following parameters are mandatory:");
            }
        }
    }

}
