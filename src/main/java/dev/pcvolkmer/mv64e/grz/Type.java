package dev.pcvolkmer.mv64e.grz;

import java.io.IOException;
import com.fasterxml.jackson.annotation.*;

/**
 * Consent or refusal to participate and consent, must be indicated for each option listed
 * in the scope of consent.
 */
public enum Type {
    DENY, PERMIT;

    @JsonValue
    public String toValue() {
        switch (this) {
            case DENY: return "deny";
            case PERMIT: return "permit";
        }
        return null;
    }

    @JsonCreator
    public static Type forValue(String value) throws IOException {
        if (value.equals("deny")) return DENY;
        if (value.equals("permit")) return PERMIT;
        throw new IOException("Cannot deserialize Type");
    }
}
