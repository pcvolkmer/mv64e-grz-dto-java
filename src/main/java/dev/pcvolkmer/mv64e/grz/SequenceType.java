package dev.pcvolkmer.mv64e.grz;

import java.io.IOException;
import com.fasterxml.jackson.annotation.*;

/**
 * Type of sequence (DNA or RNA)
 */
public enum SequenceType {
    DNA, RNA;

    @JsonValue
    public String toValue() {
        switch (this) {
            case DNA: return "dna";
            case RNA: return "rna";
        }
        return null;
    }

    @JsonCreator
    public static SequenceType forValue(String value) throws IOException {
        if (value.equals("dna")) return DNA;
        if (value.equals("rna")) return RNA;
        throw new IOException("Cannot deserialize SequenceType");
    }
}
