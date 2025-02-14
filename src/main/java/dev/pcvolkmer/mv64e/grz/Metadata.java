package dev.pcvolkmer.mv64e.grz;

import com.fasterxml.jackson.annotation.*;
import java.util.List;

/**
 * General metadata schema for submissions to the GRZ
 */
public class Metadata {
    private List<Donor> donors;
    private Submission submission;

    /**
     * List of donors including the index patient.
     */
    @JsonProperty("donors")
    public List<Donor> getDonors() { return donors; }
    @JsonProperty("donors")
    public void setDonors(List<Donor> value) { this.donors = value; }

    @JsonProperty("submission")
    public Submission getSubmission() { return submission; }
    @JsonProperty("submission")
    public void setSubmission(Submission value) { this.submission = value; }
}
