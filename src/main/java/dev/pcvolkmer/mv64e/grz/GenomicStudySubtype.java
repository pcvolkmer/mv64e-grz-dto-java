package dev.pcvolkmer.mv64e.grz;

import java.io.IOException;
import com.fasterxml.jackson.annotation.*;

/**
 * whether tumor and/or germ-line are tested
 */
public enum GenomicStudySubtype {
    GERMLINE_ONLY, TUMOR_GERMLINE, TUMOR_ONLY;

    @JsonValue
    public String toValue() {
        switch (this) {
            case GERMLINE_ONLY: return "germline-only";
            case TUMOR_GERMLINE: return "tumor+germline";
            case TUMOR_ONLY: return "tumor-only";
        }
        return null;
    }

    @JsonCreator
    public static GenomicStudySubtype forValue(String value) throws IOException {
        if (value.equals("germline-only")) return GERMLINE_ONLY;
        if (value.equals("tumor+germline")) return TUMOR_GERMLINE;
        if (value.equals("tumor-only")) return TUMOR_ONLY;
        throw new IOException("Cannot deserialize GenomicStudySubtype");
    }
}
