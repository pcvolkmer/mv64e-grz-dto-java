package dev.pcvolkmer.mv64e.grz;

import com.fasterxml.jackson.annotation.*;
import java.util.List;

/**
 * Sequence data generated from the wet lab experiment.
 */
public class SequenceData {
    private String bioinformaticsPipelineName;
    private String bioinformaticsPipelineVersion;
    private List<CallerUsed> callerUsed;
    private List<File> files;
    private double meanDepthOfCoverage;
    private double minCoverage;
    private boolean nonCodingVariants;
    private PercentBasesAboveQualityThreshold percentBasesAboveQualityThreshold;
    private ReferenceGenome referenceGenome;
    private double targetedRegionsAboveMinCoverage;

    /**
     * Name of the bioinformatics pipeline used
     */
    @JsonProperty("bioinformaticsPipelineName")
    public String getBioinformaticsPipelineName() { return bioinformaticsPipelineName; }
    @JsonProperty("bioinformaticsPipelineName")
    public void setBioinformaticsPipelineName(String value) { this.bioinformaticsPipelineName = value; }

    /**
     * Version or commit hash of the bioinformatics pipeline
     */
    @JsonProperty("bioinformaticsPipelineVersion")
    public String getBioinformaticsPipelineVersion() { return bioinformaticsPipelineVersion; }
    @JsonProperty("bioinformaticsPipelineVersion")
    public void setBioinformaticsPipelineVersion(String value) { this.bioinformaticsPipelineVersion = value; }

    /**
     * Caller that is used in the pipeline
     */
    @JsonProperty("callerUsed")
    public List<CallerUsed> getCallerUsed() { return callerUsed; }
    @JsonProperty("callerUsed")
    public void setCallerUsed(List<CallerUsed> value) { this.callerUsed = value; }

    /**
     * List of files generated and required in this analysis.
     */
    @JsonProperty("files")
    public List<File> getFiles() { return files; }
    @JsonProperty("files")
    public void setFiles(List<File> value) { this.files = value; }

    /**
     * Mean depth of coverage
     */
    @JsonProperty("meanDepthOfCoverage")
    public double getMeanDepthOfCoverage() { return meanDepthOfCoverage; }
    @JsonProperty("meanDepthOfCoverage")
    public void setMeanDepthOfCoverage(double value) { this.meanDepthOfCoverage = value; }

    /**
     * Minimum coverage
     */
    @JsonProperty("minCoverage")
    public double getMinCoverage() { return minCoverage; }
    @JsonProperty("minCoverage")
    public void setMinCoverage(double value) { this.minCoverage = value; }

    /**
     * The analysis includes non-coding variants -> true or false
     */
    @JsonProperty("nonCodingVariants")
    public boolean getNonCodingVariants() { return nonCodingVariants; }
    @JsonProperty("nonCodingVariants")
    public void setNonCodingVariants(boolean value) { this.nonCodingVariants = value; }

    /**
     * Percentage of bases with a specified minimum quality threshold, according to
     * https://www.bfarm.de/SharedDocs/Downloads/DE/Forschung/modellvorhaben-genomsequenzierung/Qs-durch-GRZ.pdf?__blob=publicationFile
     */
    @JsonProperty("percentBasesAboveQualityThreshold")
    public PercentBasesAboveQualityThreshold getPercentBasesAboveQualityThreshold() { return percentBasesAboveQualityThreshold; }
    @JsonProperty("percentBasesAboveQualityThreshold")
    public void setPercentBasesAboveQualityThreshold(PercentBasesAboveQualityThreshold value) { this.percentBasesAboveQualityThreshold = value; }

    /**
     * Reference genome used according to the Genome Reference Consortium
     * (https://www.ncbi.nlm.nih.gov/grc)
     */
    @JsonProperty("referenceGenome")
    public ReferenceGenome getReferenceGenome() { return referenceGenome; }
    @JsonProperty("referenceGenome")
    public void setReferenceGenome(ReferenceGenome value) { this.referenceGenome = value; }

    /**
     * Fraction of targeted regions that are above minimum coverage
     */
    @JsonProperty("targetedRegionsAboveMinCoverage")
    public double getTargetedRegionsAboveMinCoverage() { return targetedRegionsAboveMinCoverage; }
    @JsonProperty("targetedRegionsAboveMinCoverage")
    public void setTargetedRegionsAboveMinCoverage(double value) { this.targetedRegionsAboveMinCoverage = value; }
}
