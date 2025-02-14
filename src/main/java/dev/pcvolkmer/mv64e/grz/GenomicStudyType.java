package dev.pcvolkmer.mv64e.grz;

import java.io.IOException;
import com.fasterxml.jackson.annotation.*;

/**
 * whether additional persons are tested as well
 */
public enum GenomicStudyType {
    DUO, SINGLE, TRIO;

    @JsonValue
    public String toValue() {
        switch (this) {
            case DUO: return "duo";
            case SINGLE: return "single";
            case TRIO: return "trio";
        }
        return null;
    }

    @JsonCreator
    public static GenomicStudyType forValue(String value) throws IOException {
        if (value.equals("duo")) return DUO;
        if (value.equals("single")) return SINGLE;
        if (value.equals("trio")) return TRIO;
        throw new IOException("Cannot deserialize GenomicStudyType");
    }
}
