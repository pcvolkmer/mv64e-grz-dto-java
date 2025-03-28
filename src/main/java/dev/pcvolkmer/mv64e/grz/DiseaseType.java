package dev.pcvolkmer.mv64e.grz;

import java.io.IOException;
import com.fasterxml.jackson.annotation.*;

/**
 * Type of the disease
 */
public enum DiseaseType {
    HEREDITARY, ONCOLOGICAL, RARE;

    @JsonValue
    public String toValue() {
        switch (this) {
            case HEREDITARY: return "hereditary";
            case ONCOLOGICAL: return "oncological";
            case RARE: return "rare";
        }
        return null;
    }

    @JsonCreator
    public static DiseaseType forValue(String value) throws IOException {
        if (value.equals("hereditary")) return HEREDITARY;
        if (value.equals("oncological")) return ONCOLOGICAL;
        if (value.equals("rare")) return RARE;
        throw new IOException("Cannot deserialize DiseaseType");
    }
}
