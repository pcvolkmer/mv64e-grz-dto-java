package dev.pcvolkmer.mv64e.grz;

import java.io.IOException;
import com.fasterxml.jackson.annotation.*;

/**
 * Subtype of sequence (germline, somatic, etc.)
 */
public enum SequenceSubtype {
    GERMLINE, OTHER, SOMATIC, UNKNOWN;

    @JsonValue
    public String toValue() {
        switch (this) {
            case GERMLINE: return "germline";
            case OTHER: return "other";
            case SOMATIC: return "somatic";
            case UNKNOWN: return "unknown";
        }
        return null;
    }

    @JsonCreator
    public static SequenceSubtype forValue(String value) throws IOException {
        if (value.equals("germline")) return GERMLINE;
        if (value.equals("other")) return OTHER;
        if (value.equals("somatic")) return SOMATIC;
        if (value.equals("unknown")) return UNKNOWN;
        throw new IOException("Cannot deserialize SequenceSubtype");
    }
}
