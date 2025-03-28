package dev.pcvolkmer.mv64e.grz;

import com.fasterxml.jackson.annotation.*;
import java.util.Date;
import java.util.Map;

public class ResearchConsent {
    private Date presentationDate;
    private SchemaVersion schemaVersion;
    private Map<String, Object> scope;

    /**
     * Date of the delivery of the research consent in ISO 8601 format (YYYY-MM-DD)
     */
    @JsonProperty("presentationDate")
    public Date getPresentationDate() { return presentationDate; }
    @JsonProperty("presentationDate")
    public void setPresentationDate(Date value) { this.presentationDate = value; }

    /**
     * Schema version of de.medizininformatikinitiative.kerndatensatz.consent
     */
    @JsonProperty("schemaVersion")
    public SchemaVersion getSchemaVersion() { return schemaVersion; }
    @JsonProperty("schemaVersion")
    public void setSchemaVersion(SchemaVersion value) { this.schemaVersion = value; }

    /**
     * Scope of the research consent in JSON format following the MII IG Consent v2025 FHIR schema.
     * See 'https://www.medizininformatik-initiative.de/Kerndatensatz/KDS_Consent_V2025/MII-IG-Modul-Consent.html'
     * and 'https://packages2.fhir.org/packages/de.medizininformatikinitiative.kerndatensatz.consent'.
     */
    @JsonProperty("scope")
    public Map<String, Object> getScope() { return scope; }
    @JsonProperty("scope")
    public void setScope(Map<String, Object> scope) { this.scope = scope; }
}
