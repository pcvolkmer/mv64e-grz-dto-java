package dev.pcvolkmer.mv64e.grz;

import com.fasterxml.jackson.annotation.*;
import java.util.Date;
import java.util.List;

public class MvConsent {
    private Date presentationDate;
    private List<Scope> scope;
    private String version;

    /**
     * Date of delivery. Date (in ISO 8601 format YYYY-MM-DD) on which the Model Project
     * Declaration of Participation was presented to the patient, unless identical to the date
     * of signature
     */
    @JsonProperty("presentationDate")
    public Date getPresentationDate() { return presentationDate; }
    @JsonProperty("presentationDate")
    public void setPresentationDate(Date value) { this.presentationDate = value; }

    /**
     * Modules of the consent to MV: must have at least a permit of mvSequencing
     */
    @JsonProperty("scope")
    public List<Scope> getScope() { return scope; }
    @JsonProperty("scope")
    public void setScope(List<Scope> value) { this.scope = value; }

    /**
     * Version of the declaration of participation. Name and version of the declaration of
     * participation in the MV GenomSeq, e.g.: 'Patient Info TE Consent MVGenomSeq vers01'
     */
    @JsonProperty("version")
    public String getVersion() { return version; }
    @JsonProperty("version")
    public void setVersion(String value) { this.version = value; }
}
