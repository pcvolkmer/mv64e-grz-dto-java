package dev.pcvolkmer.mv64e.grz;

import java.io.IOException;
import com.fasterxml.jackson.annotation.*;

/**
 * Relationship of the donor in respect to the index patient, e.g. 'index', 'brother',
 * 'mother', etc.
 */
public enum Relation {
    BROTHER, CHILD, FATHER, MOTHER, OTHER, SELF, SISTER;

    @JsonValue
    public String toValue() {
        switch (this) {
            case BROTHER: return "brother";
            case CHILD: return "child";
            case FATHER: return "father";
            case MOTHER: return "mother";
            case OTHER: return "other";
            case SELF: return "self";
            case SISTER: return "sister";
        }
        return null;
    }

    @JsonCreator
    public static Relation forValue(String value) throws IOException {
        if (value.equals("brother")) return BROTHER;
        if (value.equals("child")) return CHILD;
        if (value.equals("father")) return FATHER;
        if (value.equals("mother")) return MOTHER;
        if (value.equals("other")) return OTHER;
        if (value.equals("self")) return SELF;
        if (value.equals("sister")) return SISTER;
        throw new IOException("Cannot deserialize Relation");
    }
}
