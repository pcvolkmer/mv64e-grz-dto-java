package dev.pcvolkmer.mv64e.grz;

import com.fasterxml.jackson.annotation.*;

/**
 * The scope of the Modellvorhaben consent given by the donor.
 */
public class MvConsentScope {
    private boolean consentCaseIdentification;
    private boolean consentMvSequencing;
    private boolean consentReIdentification;

    /**
     * The donor's consent to identify the case.
     */
    @JsonProperty("consentCaseIdentification")
    public boolean getConsentCaseIdentification() { return consentCaseIdentification; }
    @JsonProperty("consentCaseIdentification")
    public void setConsentCaseIdentification(boolean value) { this.consentCaseIdentification = value; }

    /**
     * The donor's consent to participate in the Modellvorhaben and sequencing.
     */
    @JsonProperty("consentMvSequencing")
    public boolean getConsentMvSequencing() { return consentMvSequencing; }
    @JsonProperty("consentMvSequencing")
    public void setConsentMvSequencing(boolean value) { this.consentMvSequencing = value; }

    /**
     * The donor's consent to be re-identified and to be re-contacted in case of new findings.
     */
    @JsonProperty("consentReIdentification")
    public boolean getConsentReIdentification() { return consentReIdentification; }
    @JsonProperty("consentReIdentification")
    public void setConsentReIdentification(boolean value) { this.consentReIdentification = value; }
}
