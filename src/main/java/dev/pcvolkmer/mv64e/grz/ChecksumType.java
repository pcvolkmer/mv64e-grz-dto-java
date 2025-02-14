package dev.pcvolkmer.mv64e.grz;

import java.io.IOException;
import com.fasterxml.jackson.annotation.*;

/**
 * Type of checksum algorithm used
 */
public enum ChecksumType {
    SHA256;

    @JsonValue
    public String toValue() {
        switch (this) {
            case SHA256: return "sha256";
        }
        return null;
    }

    @JsonCreator
    public static ChecksumType forValue(String value) throws IOException {
        if (value.equals("sha256")) return SHA256;
        throw new IOException("Cannot deserialize ChecksumType");
    }
}
