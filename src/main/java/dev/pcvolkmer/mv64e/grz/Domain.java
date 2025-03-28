package dev.pcvolkmer.mv64e.grz;

import java.io.IOException;
import com.fasterxml.jackson.annotation.*;

/**
 * Scope of consent or revocation.
 */
public enum Domain {
    CASE_IDENTIFICATION, MV_SEQUENCING, RE_IDENTIFICATION;

    @JsonValue
    public String toValue() {
        switch (this) {
            case CASE_IDENTIFICATION: return "caseIdentification";
            case MV_SEQUENCING: return "mvSequencing";
            case RE_IDENTIFICATION: return "reIdentification";
        }
        return null;
    }

    @JsonCreator
    public static Domain forValue(String value) throws IOException {
        if (value.equals("caseIdentification")) return CASE_IDENTIFICATION;
        if (value.equals("mvSequencing")) return MV_SEQUENCING;
        if (value.equals("reIdentification")) return RE_IDENTIFICATION;
        throw new IOException("Cannot deserialize Domain");
    }
}
