package dev.pcvolkmer.mv64e.grz;

import java.io.IOException;
import com.fasterxml.jackson.annotation.*;

/**
 * Sample conservation
 */
public enum SampleConservation {
    CRYO_FROZEN, FFPE, FRESH_TISSUE, OTHER, UNKNOWN;

    @JsonValue
    public String toValue() {
        switch (this) {
            case CRYO_FROZEN: return "cryo-frozen";
            case FFPE: return "ffpe";
            case FRESH_TISSUE: return "fresh-tissue";
            case OTHER: return "other";
            case UNKNOWN: return "unknown";
        }
        return null;
    }

    @JsonCreator
    public static SampleConservation forValue(String value) throws IOException {
        if (value.equals("cryo-frozen")) return CRYO_FROZEN;
        if (value.equals("ffpe")) return FFPE;
        if (value.equals("fresh-tissue")) return FRESH_TISSUE;
        if (value.equals("other")) return OTHER;
        if (value.equals("unknown")) return UNKNOWN;
        throw new IOException("Cannot deserialize SampleConservation");
    }
}
