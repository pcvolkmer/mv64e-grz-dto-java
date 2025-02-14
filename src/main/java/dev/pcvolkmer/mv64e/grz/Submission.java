package dev.pcvolkmer.mv64e.grz;

import com.fasterxml.jackson.annotation.*;
import java.util.Date;

public class Submission {
    private String clinicalDataNodeId;
    private String genomicDataCenterId;
    private GenomicStudySubtype genomicStudySubtype;
    private GenomicStudyType genomicStudyType;
    private String labName;
    private String localCaseId;
    private Date submissionDate;
    private SubmissionType submissionType;
    private String submitterId;
    private String tanG;

    /**
     * ID of the clinical data node in the format KDKXXXnnn.
     */
    @JsonProperty("clinicalDataNodeId")
    public String getClinicalDataNodeId() { return clinicalDataNodeId; }
    @JsonProperty("clinicalDataNodeId")
    public void setClinicalDataNodeId(String value) { this.clinicalDataNodeId = value; }

    /**
     * ID of the genomic data center in the format GRZXXXnnn.
     */
    @JsonProperty("genomicDataCenterId")
    public String getGenomicDataCenterId() { return genomicDataCenterId; }
    @JsonProperty("genomicDataCenterId")
    public void setGenomicDataCenterId(String value) { this.genomicDataCenterId = value; }

    /**
     * whether tumor and/or germ-line are tested
     */
    @JsonProperty("genomicStudySubtype")
    public GenomicStudySubtype getGenomicStudySubtype() { return genomicStudySubtype; }
    @JsonProperty("genomicStudySubtype")
    public void setGenomicStudySubtype(GenomicStudySubtype value) { this.genomicStudySubtype = value; }

    /**
     * whether additional persons are tested as well
     */
    @JsonProperty("genomicStudyType")
    public GenomicStudyType getGenomicStudyType() { return genomicStudyType; }
    @JsonProperty("genomicStudyType")
    public void setGenomicStudyType(GenomicStudyType value) { this.genomicStudyType = value; }

    /**
     * Name of the sequencing lab.
     */
    @JsonProperty("labName")
    public String getLabName() { return labName; }
    @JsonProperty("labName")
    public void setLabName(String value) { this.labName = value; }

    /**
     * A local case identifier for synchronizing locally
     */
    @JsonProperty("localCaseId")
    public String getLocalCaseId() { return localCaseId; }
    @JsonProperty("localCaseId")
    public void setLocalCaseId(String value) { this.localCaseId = value; }

    /**
     * Date of submission in ISO 8601 format YYYY-MM-DD
     */
    @JsonProperty("submissionDate")
    @JsonFormat(pattern = "yyyy-MM-dd")
    public Date getSubmissionDate() { return submissionDate; }
    @JsonProperty("submissionDate")
    @JsonFormat(pattern = "yyyy-MM-dd")
    public void setSubmissionDate(Date value) { this.submissionDate = value; }

    /**
     * The options are: 'initial' for first submission, 'followup' is for followup submissions,
     * 'addition' for additional submission, 'correction' for correction
     */
    @JsonProperty("submissionType")
    public SubmissionType getSubmissionType() { return submissionType; }
    @JsonProperty("submissionType")
    public void setSubmissionType(SubmissionType value) { this.submissionType = value; }

    /**
     * Institutional ID of the submitter according to §293 SGB V.
     */
    @JsonProperty("submitterId")
    public String getSubmitterId() { return submitterId; }
    @JsonProperty("submitterId")
    public void setSubmitterId(String value) { this.submitterId = value; }

    /**
     * The VNg of the genomic data of the patient that will be reimbursed --> a unique 32-length
     * byte code represented in a hex string of length 64.
     */
    @JsonProperty("tanG")
    public String getTanG() { return tanG; }
    @JsonProperty("tanG")
    public void setTanG(String value) { this.tanG = value; }
}
