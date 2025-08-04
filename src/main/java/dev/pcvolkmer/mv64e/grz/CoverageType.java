package dev.pcvolkmer.mv64e.grz;

import java.io.IOException;
import com.fasterxml.jackson.annotation.*;

/**
 * "GKV" gesetzliche Krankenversicherung, "PKV" private Krankenversicherung, "BG"
 * Berufsgenossenschaft, "SEL" Selbstzahler, "SOZ" Sozialamt, "GPV" gesetzliche
 * Pflegeversicherung, "PPV" private Pflegeversicherung, "BEI" Beihilfe, "SKT" Sonstige
 * Kostenträger, "UNK" Unbekannt
 */
public enum CoverageType {
    BEI, BG, GKV, GPV, PKV, PPV, SEL, SKT, SOZ, UNK;

    @JsonValue
    public String toValue() {
        switch (this) {
            case BEI: return "BEI";
            case BG: return "BG";
            case GKV: return "GKV";
            case GPV: return "GPV";
            case PKV: return "PKV";
            case PPV: return "PPV";
            case SEL: return "SEL";
            case SKT: return "SKT";
            case SOZ: return "SOZ";
            case UNK: return "UNK";
        }
        return null;
    }

    @JsonCreator
    public static CoverageType forValue(String value) throws IOException {
        if (value.equals("BEI")) return BEI;
        if (value.equals("BG")) return BG;
        if (value.equals("GKV")) return GKV;
        if (value.equals("GPV")) return GPV;
        if (value.equals("PKV")) return PKV;
        if (value.equals("PPV")) return PPV;
        if (value.equals("SEL")) return SEL;
        if (value.equals("SKT")) return SKT;
        if (value.equals("SOZ")) return SOZ;
        if (value.equals("UNK")) return UNK;
        throw new IOException("Cannot deserialize CoverageType");
    }
}
