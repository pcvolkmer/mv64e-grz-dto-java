package dev.pcvolkmer.mv64e.grz;

import com.fasterxml.jackson.annotation.*;

/**
 * Percentage of bases with a specified minimum quality threshold, according to
 * https://www.bfarm.de/SharedDocs/Downloads/DE/Forschung/modellvorhaben-genomsequenzierung/Qs-durch-GRZ.pdf?__blob=publicationFile
 */
public class PercentBasesAboveQualityThreshold {
    private double minimumQuality;
    private double percent;

    /**
     * The minimum quality score threshold
     */
    @JsonProperty("minimumQuality")
    public double getMinimumQuality() { return minimumQuality; }
    @JsonProperty("minimumQuality")
    public void setMinimumQuality(double value) { this.minimumQuality = value; }

    /**
     * Percentage of bases that meet or exceed the minimum quality score
     */
    @JsonProperty("percent")
    public double getPercent() { return percent; }
    @JsonProperty("percent")
    public void setPercent(double value) { this.percent = value; }
}
