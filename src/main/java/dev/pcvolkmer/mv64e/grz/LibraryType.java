package dev.pcvolkmer.mv64e.grz;

import java.io.IOException;
import com.fasterxml.jackson.annotation.*;

/**
 * Library type
 */
public enum LibraryType {
    OTHER, PANEL, PANEL_LR, UNKNOWN, WES, WES_LR, WGS, WGS_LR, WXS, WXS_LR;

    @JsonValue
    public String toValue() {
        switch (this) {
            case OTHER: return "other";
            case PANEL: return "panel";
            case PANEL_LR: return "panel_lr";
            case UNKNOWN: return "unknown";
            case WES: return "wes";
            case WES_LR: return "wes_lr";
            case WGS: return "wgs";
            case WGS_LR: return "wgs_lr";
            case WXS: return "wxs";
            case WXS_LR: return "wxs_lr";
        }
        return null;
    }

    @JsonCreator
    public static LibraryType forValue(String value) throws IOException {
        if (value.equals("other")) return OTHER;
        if (value.equals("panel")) return PANEL;
        if (value.equals("panel_lr")) return PANEL_LR;
        if (value.equals("unknown")) return UNKNOWN;
        if (value.equals("wes")) return WES;
        if (value.equals("wes_lr")) return WES_LR;
        if (value.equals("wgs")) return WGS;
        if (value.equals("wgs_lr")) return WGS_LR;
        if (value.equals("wxs")) return WXS;
        if (value.equals("wxs_lr")) return WXS_LR;
        throw new IOException("Cannot deserialize LibraryType");
    }
}
