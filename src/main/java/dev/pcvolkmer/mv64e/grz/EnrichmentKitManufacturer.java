package dev.pcvolkmer.mv64e.grz;

import java.io.IOException;
import com.fasterxml.jackson.annotation.*;

/**
 * Manufacturer of the enrichment kit
 */
public enum EnrichmentKitManufacturer {
    AGILENT, ILLUMINA, NEB, NONE, OTHER, TWIST, UNKNOWN;

    @JsonValue
    public String toValue() {
        switch (this) {
            case AGILENT: return "Agilent";
            case ILLUMINA: return "Illumina";
            case NEB: return "NEB";
            case NONE: return "none";
            case OTHER: return "other";
            case TWIST: return "Twist";
            case UNKNOWN: return "unknown";
        }
        return null;
    }

    @JsonCreator
    public static EnrichmentKitManufacturer forValue(String value) throws IOException {
        if (value.equals("Agilent")) return AGILENT;
        if (value.equals("Illumina")) return ILLUMINA;
        if (value.equals("NEB")) return NEB;
        if (value.equals("none")) return NONE;
        if (value.equals("other")) return OTHER;
        if (value.equals("Twist")) return TWIST;
        if (value.equals("unknown")) return UNKNOWN;
        throw new IOException("Cannot deserialize EnrichmentKitManufacturer");
    }
}
