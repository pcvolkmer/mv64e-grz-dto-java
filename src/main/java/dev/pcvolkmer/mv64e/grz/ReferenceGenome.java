package dev.pcvolkmer.mv64e.grz;

import java.io.IOException;
import com.fasterxml.jackson.annotation.*;

/**
 * Reference genome used according to the Genome Reference Consortium
 * (https://www.ncbi.nlm.nih.gov/grc)
 */
public enum ReferenceGenome {
    GR_CH37, GR_CH38;

    @JsonValue
    public String toValue() {
        switch (this) {
            case GR_CH37: return "GRCh37";
            case GR_CH38: return "GRCh38";
        }
        return null;
    }

    @JsonCreator
    public static ReferenceGenome forValue(String value) throws IOException {
        if (value.equals("GRCh37")) return GR_CH37;
        if (value.equals("GRCh38")) return GR_CH38;
        throw new IOException("Cannot deserialize ReferenceGenome");
    }
}
