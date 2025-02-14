package dev.pcvolkmer.mv64e.grz;

import java.io.IOException;
import com.fasterxml.jackson.annotation.*;

/**
 * The sequencing layout, aka the end type of sequencing.
 */
public enum SequencingLayout {
    OTHER, PAIRED_END, REVERSE, SINGLE_END;

    @JsonValue
    public String toValue() {
        switch (this) {
            case OTHER: return "other";
            case PAIRED_END: return "paired-end";
            case REVERSE: return "reverse";
            case SINGLE_END: return "single-end";
        }
        return null;
    }

    @JsonCreator
    public static SequencingLayout forValue(String value) throws IOException {
        if (value.equals("other")) return OTHER;
        if (value.equals("paired-end")) return PAIRED_END;
        if (value.equals("reverse")) return REVERSE;
        if (value.equals("single-end")) return SINGLE_END;
        throw new IOException("Cannot deserialize SequencingLayout");
    }
}
