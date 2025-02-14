package dev.pcvolkmer.mv64e.grz;

import java.io.IOException;
import com.fasterxml.jackson.annotation.*;

/**
 * Indicates the read order for paired-end reads.
 */
public enum ReadOrder {
    R1, R2;

    @JsonValue
    public String toValue() {
        switch (this) {
            case R1: return "R1";
            case R2: return "R2";
        }
        return null;
    }

    @JsonCreator
    public static ReadOrder forValue(String value) throws IOException {
        if (value.equals("R1")) return R1;
        if (value.equals("R2")) return R2;
        throw new IOException("Cannot deserialize ReadOrder");
    }
}
