package dev.pcvolkmer.mv64e.grz;

import java.io.IOException;
import com.fasterxml.jackson.annotation.*;

/**
 * Schema version of de.medizininformatikinitiative.kerndatensatz.consent
 */
public enum SchemaVersion {
    VERSION_202501;

    @JsonValue
    public String toValue() {
        switch (this) {
            case VERSION_202501: return "2025.0.1";
        }
        return null;
    }

    @JsonCreator
    public static SchemaVersion forValue(String value) throws IOException {
        if (value.equals("2025.0.1")) return VERSION_202501;
        throw new IOException("Cannot deserialize SchemaVersion");
    }
}
