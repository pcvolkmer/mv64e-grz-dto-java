package dev.pcvolkmer.mv64e.grz;

import com.fasterxml.jackson.annotation.*;

public class TissueOntology {
    private String name;
    private String version;

    /**
     * Name of the tissue ontology
     */
    @JsonProperty("name")
    public String getName() { return name; }
    @JsonProperty("name")
    public void setName(String value) { this.name = value; }

    /**
     * Version of the tissue ontology
     */
    @JsonProperty("version")
    public String getVersion() { return version; }
    @JsonProperty("version")
    public void setVersion(String value) { this.version = value; }
}
