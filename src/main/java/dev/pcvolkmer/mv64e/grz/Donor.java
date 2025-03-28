package dev.pcvolkmer.mv64e.grz;

import com.fasterxml.jackson.annotation.*;
import java.util.List;

public class Donor {
    private String donorPseudonym;
    private Gender gender;
    private List<LabDatum> labData;
    private MvConsent mvConsent;
    private Relation relation;
    private List<ResearchConsent> researchConsents;

    /**
     * A unique identifier given by the Leistungserbringer for each donor of a single, duo or
     * trio sequencing; the donorPseudonym needs to be identifiable by the Leistungserbringer in
     * case of changes to the consents by one of the donors. For Index patient use TanG.
     */
    @JsonProperty("donorPseudonym")
    public String getDonorPseudonym() { return donorPseudonym; }
    @JsonProperty("donorPseudonym")
    public void setDonorPseudonym(String value) { this.donorPseudonym = value; }

    /**
     * Gender of the donor.
     */
    @JsonProperty("gender")
    public Gender getGender() { return gender; }
    @JsonProperty("gender")
    public void setGender(Gender value) { this.gender = value; }

    /**
     * Lab data related to the donor.
     */
    @JsonProperty("labData")
    public List<LabDatum> getLabData() { return labData; }
    @JsonProperty("labData")
    public void setLabData(List<LabDatum> value) { this.labData = value; }

    @JsonProperty("mvConsent")
    public MvConsent getMvConsent() { return mvConsent; }
    @JsonProperty("mvConsent")
    public void setMvConsent(MvConsent value) { this.mvConsent = value; }

    /**
     * Relationship of the donor in respect to the index patient, e.g. 'index', 'brother',
     * 'mother', etc.
     */
    @JsonProperty("relation")
    public Relation getRelation() { return relation; }
    @JsonProperty("relation")
    public void setRelation(Relation value) { this.relation = value; }

    /**
     * Research consents. Multiple declarations of consent are possible! Must be assigned to the
     * respective data sets.
     */
    @JsonProperty("researchConsents")
    public List<ResearchConsent> getResearchConsents() { return researchConsents; }
    @JsonProperty("researchConsents")
    public void setResearchConsents(List<ResearchConsent> value) { this.researchConsents = value; }
}
