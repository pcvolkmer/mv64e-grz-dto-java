package dev.pcvolkmer.mv64e.grz;

import com.fasterxml.jackson.annotation.*;

/**
 * The scope of the termination of the Modellvorhaben consent.
 */
public class MvConsentTerminationScope {
    private Boolean consentCaseIdentificationTermination;
    private Boolean consentMvSequencingTermination;
    private Boolean consentReIdentificationTermination;

    /**
     * The patient's termination of the Modellvorhaben consent to identify the case
     */
    @JsonProperty("consentCaseIdentificationTermination")
    public Boolean getConsentCaseIdentificationTermination() { return consentCaseIdentificationTermination; }
    @JsonProperty("consentCaseIdentificationTermination")
    public void setConsentCaseIdentificationTermination(Boolean value) { this.consentCaseIdentificationTermination = value; }

    /**
     * The patient's termination of the Modellvorhaben consent to participate in the
     * Modellvorhaben and sequencing
     */
    @JsonProperty("consentMvSequencingTermination")
    public Boolean getConsentMvSequencingTermination() { return consentMvSequencingTermination; }
    @JsonProperty("consentMvSequencingTermination")
    public void setConsentMvSequencingTermination(Boolean value) { this.consentMvSequencingTermination = value; }

    /**
     * The patient's termination of the Modellvorhaben consent to re-identify the case and to
     * re-contact the patient in case of new findings
     */
    @JsonProperty("consentReIdentificationTermination")
    public Boolean getConsentReIdentificationTermination() { return consentReIdentificationTermination; }
    @JsonProperty("consentReIdentificationTermination")
    public void setConsentReIdentificationTermination(Boolean value) { this.consentReIdentificationTermination = value; }
}
