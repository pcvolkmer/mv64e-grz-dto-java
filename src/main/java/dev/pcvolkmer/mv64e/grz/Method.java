package dev.pcvolkmer.mv64e.grz;

import java.io.IOException;
import com.fasterxml.jackson.annotation.*;

/**
 * Method used to determine cell count.
 */
public enum Method {
    BIOINFORMATICS, OTHER, PATHOLOGY, UNKNOWN;

    @JsonValue
    public String toValue() {
        switch (this) {
            case BIOINFORMATICS: return "Bioinformatics";
            case OTHER: return "other";
            case PATHOLOGY: return "Pathology";
            case UNKNOWN: return "unknown";
        }
        return null;
    }

    @JsonCreator
    public static Method forValue(String value) throws IOException {
        if (value.equals("Bioinformatics")) return BIOINFORMATICS;
        if (value.equals("other")) return OTHER;
        if (value.equals("Pathology")) return PATHOLOGY;
        if (value.equals("unknown")) return UNKNOWN;
        throw new IOException("Cannot deserialize Method");
    }
}
