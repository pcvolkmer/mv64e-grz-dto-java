package dev.pcvolkmer.mv64e.grz;

import java.io.IOException;
import com.fasterxml.jackson.annotation.*;

/**
 * Fragmentation method
 */
public enum FragmentationMethod {
    ENZYMATIC, NONE, OTHER, SONICATION, UNKNOWN;

    @JsonValue
    public String toValue() {
        switch (this) {
            case ENZYMATIC: return "enzymatic";
            case NONE: return "none";
            case OTHER: return "other";
            case SONICATION: return "sonication";
            case UNKNOWN: return "unknown";
        }
        return null;
    }

    @JsonCreator
    public static FragmentationMethod forValue(String value) throws IOException {
        if (value.equals("enzymatic")) return ENZYMATIC;
        if (value.equals("none")) return NONE;
        if (value.equals("other")) return OTHER;
        if (value.equals("sonication")) return SONICATION;
        if (value.equals("unknown")) return UNKNOWN;
        throw new IOException("Cannot deserialize FragmentationMethod");
    }
}
