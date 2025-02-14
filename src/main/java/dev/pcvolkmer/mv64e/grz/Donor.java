package dev.pcvolkmer.mv64e.grz;

import com.fasterxml.jackson.annotation.*;
import java.util.Date;
import java.util.List;

public class Donor {
    private Gender gender;
    private List<LabDatum> labData;
    private String localCaseId;
    private Date mvConsentDate;
    private Date mvConsentPresentedDate;
    private MvConsentScope mvConsentScope;
    private Date mvConsentTerminationDate;
    private MvConsentTerminationScope mvConsentTerminationScope;
    private String mvConsentVersion;
    private Relation relation;
    private Date researchConsentDate;
    private Date researchConsentPresentedDate;
    private Date researchConsentRevocationDate;
    private String researchConsentVersion;
    private String tanG;

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

    /**
     * A local case identifier for synchronizing locally
     */
    @JsonProperty("localCaseId")
    public String getLocalCaseId() { return localCaseId; }
    @JsonProperty("localCaseId")
    public void setLocalCaseId(String value) { this.localCaseId = value; }

    /**
     * Date of the signature of the Modellvorhaben consent; Date in ISO 8601 format YYYY-MM-DD
     */
    @JsonProperty("mvConsentDate")
    @JsonFormat(pattern = "yyyy-MM-dd")
    public Date getMvConsentDate() { return mvConsentDate; }
    @JsonProperty("mvConsentDate")
    @JsonFormat(pattern = "yyyy-MM-dd")
    public void setMvConsentDate(Date value) { this.mvConsentDate = value; }

    /**
     * Date of the presentation of the Modellvorhaben consent; Date in ISO 8601 format YYYY-MM-DD
     */
    @JsonProperty("mvConsentPresentedDate")
    public Date getMvConsentPresentedDate() { return mvConsentPresentedDate; }
    @JsonProperty("mvConsentPresentedDate")
    public void setMvConsentPresentedDate(Date value) { this.mvConsentPresentedDate = value; }

    /**
     * The scope of the Modellvorhaben consent given by the donor.
     */
    @JsonProperty("mvConsentScope")
    public MvConsentScope getMvConsentScope() { return mvConsentScope; }
    @JsonProperty("mvConsentScope")
    public void setMvConsentScope(MvConsentScope value) { this.mvConsentScope = value; }

    /**
     * Date of the termination of the Modellvorhaben consent; Date in ISO 8601 format YYYY-MM-DD
     */
    @JsonProperty("mvConsentTerminationDate")
    public Date getMvConsentTerminationDate() { return mvConsentTerminationDate; }
    @JsonProperty("mvConsentTerminationDate")
    public void setMvConsentTerminationDate(Date value) { this.mvConsentTerminationDate = value; }

    /**
     * The scope of the termination of the Modellvorhaben consent.
     */
    @JsonProperty("mvConsentTerminationScope")
    public MvConsentTerminationScope getMvConsentTerminationScope() { return mvConsentTerminationScope; }
    @JsonProperty("mvConsentTerminationScope")
    public void setMvConsentTerminationScope(MvConsentTerminationScope value) { this.mvConsentTerminationScope = value; }

    /**
     * Version of the research consent
     */
    @JsonProperty("mvConsentVersion")
    public String getMvConsentVersion() { return mvConsentVersion; }
    @JsonProperty("mvConsentVersion")
    public void setMvConsentVersion(String value) { this.mvConsentVersion = value; }

    /**
     * Relationship of the donor in respect to the index patient, e.g. 'index', 'brother',
     * 'mother', etc.
     */
    @JsonProperty("relation")
    public Relation getRelation() { return relation; }
    @JsonProperty("relation")
    public void setRelation(Relation value) { this.relation = value; }

    /**
     * Date of the signature of the research consent; Date in ISO 8601 format YYYY-MM-DD
     */
    @JsonProperty("researchConsentDate")
    public Date getResearchConsentDate() { return researchConsentDate; }
    @JsonProperty("researchConsentDate")
    public void setResearchConsentDate(Date value) { this.researchConsentDate = value; }

    /**
     * Date of the presentation of the research consent; Date in ISO 8601 format YYYY-MM-DD
     */
    @JsonProperty("researchConsentPresentedDate")
    public Date getResearchConsentPresentedDate() { return researchConsentPresentedDate; }
    @JsonProperty("researchConsentPresentedDate")
    public void setResearchConsentPresentedDate(Date value) { this.researchConsentPresentedDate = value; }

    /**
     * Date of the revocation of the research consent; Date in ISO 8601 format YYYY-MM-DD
     */
    @JsonProperty("researchConsentRevocationDate")
    public Date getResearchConsentRevocationDate() { return researchConsentRevocationDate; }
    @JsonProperty("researchConsentRevocationDate")
    public void setResearchConsentRevocationDate(Date value) { this.researchConsentRevocationDate = value; }

    /**
     * Version of the research consent
     */
    @JsonProperty("researchConsentVersion")
    public String getResearchConsentVersion() { return researchConsentVersion; }
    @JsonProperty("researchConsentVersion")
    public void setResearchConsentVersion(String value) { this.researchConsentVersion = value; }

    /**
     * The VNg of the genomic data of the donor --> a unique 32-length byte code represented in
     * a hex string of length 64.
     */
    @JsonProperty("tanG")
    public String getTanG() { return tanG; }
    @JsonProperty("tanG")
    public void setTanG(String value) { this.tanG = value; }
}
