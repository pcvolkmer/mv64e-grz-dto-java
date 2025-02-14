package dev.pcvolkmer.mv64e.grz;

import com.fasterxml.jackson.annotation.*;
import java.util.Date;
import java.util.List;

public class LabDatum {
    private String barcode;
    private String enrichmentKitDescription;
    private EnrichmentKitManufacturer enrichmentKitManufacturer;
    private FragmentationMethod fragmentationMethod;
    private String kitManufacturer;
    private String kitName;
    private String labDataName;
    private String libraryPrepKit;
    private String libraryPrepKitManufacturer;
    private LibraryType libraryType;
    private SampleConservation sampleConservation;
    private Date sampleDate;
    private SequenceData sequenceData;
    private SequenceSubtype sequenceSubtype;
    private SequenceType sequenceType;
    private String sequencerManufacturer;
    private String sequencerModel;
    private SequencingLayout sequencingLayout;
    private TissueOntology tissueOntology;
    private String tissueTypeId;
    private String tissueTypeName;
    private List<TumorCellCount> tumorCellCount;

    /**
     * The barcode used or 'na'
     */
    @JsonProperty("barcode")
    public String getBarcode() { return barcode; }
    @JsonProperty("barcode")
    public void setBarcode(String value) { this.barcode = value; }

    /**
     * Name/version of the enrichment kit
     */
    @JsonProperty("enrichmentKitDescription")
    public String getEnrichmentKitDescription() { return enrichmentKitDescription; }
    @JsonProperty("enrichmentKitDescription")
    public void setEnrichmentKitDescription(String value) { this.enrichmentKitDescription = value; }

    /**
     * Manufacturer of the enrichment kit
     */
    @JsonProperty("enrichmentKitManufacturer")
    public EnrichmentKitManufacturer getEnrichmentKitManufacturer() { return enrichmentKitManufacturer; }
    @JsonProperty("enrichmentKitManufacturer")
    public void setEnrichmentKitManufacturer(EnrichmentKitManufacturer value) { this.enrichmentKitManufacturer = value; }

    /**
     * Fragmentation method
     */
    @JsonProperty("fragmentationMethod")
    public FragmentationMethod getFragmentationMethod() { return fragmentationMethod; }
    @JsonProperty("fragmentationMethod")
    public void setFragmentationMethod(FragmentationMethod value) { this.fragmentationMethod = value; }

    /**
     * Sequencing kit manufacturer
     */
    @JsonProperty("kitManufacturer")
    public String getKitManufacturer() { return kitManufacturer; }
    @JsonProperty("kitManufacturer")
    public void setKitManufacturer(String value) { this.kitManufacturer = value; }

    /**
     * Name/version of the sequencing kit
     */
    @JsonProperty("kitName")
    public String getKitName() { return kitName; }
    @JsonProperty("kitName")
    public void setKitName(String value) { this.kitName = value; }

    /**
     * Name/ID of the biospecimen e.g. 'Blut DNA normal'
     */
    @JsonProperty("labDataName")
    public String getLabDataName() { return labDataName; }
    @JsonProperty("labDataName")
    public void setLabDataName(String value) { this.labDataName = value; }

    /**
     * Name/version of the library prepkit
     */
    @JsonProperty("libraryPrepKit")
    public String getLibraryPrepKit() { return libraryPrepKit; }
    @JsonProperty("libraryPrepKit")
    public void setLibraryPrepKit(String value) { this.libraryPrepKit = value; }

    /**
     * Library prep kit manufacturer
     */
    @JsonProperty("libraryPrepKitManufacturer")
    public String getLibraryPrepKitManufacturer() { return libraryPrepKitManufacturer; }
    @JsonProperty("libraryPrepKitManufacturer")
    public void setLibraryPrepKitManufacturer(String value) { this.libraryPrepKitManufacturer = value; }

    /**
     * Library type
     */
    @JsonProperty("libraryType")
    public LibraryType getLibraryType() { return libraryType; }
    @JsonProperty("libraryType")
    public void setLibraryType(LibraryType value) { this.libraryType = value; }

    /**
     * Sample conservation
     */
    @JsonProperty("sampleConservation")
    public SampleConservation getSampleConservation() { return sampleConservation; }
    @JsonProperty("sampleConservation")
    public void setSampleConservation(SampleConservation value) { this.sampleConservation = value; }

    /**
     * Date of sample in ISO 8601 format YYYY-MM-DD
     */
    @JsonProperty("sampleDate")
    @JsonFormat(pattern = "yyyy-MM-dd")
    public Date getSampleDate() { return sampleDate; }
    @JsonProperty("sampleDate")
    @JsonFormat(pattern = "yyyy-MM-dd")
    public void setSampleDate(Date value) { this.sampleDate = value; }

    /**
     * Sequence data generated from the wet lab experiment.
     */
    @JsonProperty("sequenceData")
    public SequenceData getSequenceData() { return sequenceData; }
    @JsonProperty("sequenceData")
    public void setSequenceData(SequenceData value) { this.sequenceData = value; }

    /**
     * Subtype of sequence (germline, somatic, etc.)
     */
    @JsonProperty("sequenceSubtype")
    public SequenceSubtype getSequenceSubtype() { return sequenceSubtype; }
    @JsonProperty("sequenceSubtype")
    public void setSequenceSubtype(SequenceSubtype value) { this.sequenceSubtype = value; }

    /**
     * Type of sequence (DNA or RNA)
     */
    @JsonProperty("sequenceType")
    public SequenceType getSequenceType() { return sequenceType; }
    @JsonProperty("sequenceType")
    public void setSequenceType(SequenceType value) { this.sequenceType = value; }

    /**
     * Sequencer manufacturer
     */
    @JsonProperty("sequencerManufacturer")
    public String getSequencerManufacturer() { return sequencerManufacturer; }
    @JsonProperty("sequencerManufacturer")
    public void setSequencerManufacturer(String value) { this.sequencerManufacturer = value; }

    /**
     * Name/version of the sequencer model
     */
    @JsonProperty("sequencerModel")
    public String getSequencerModel() { return sequencerModel; }
    @JsonProperty("sequencerModel")
    public void setSequencerModel(String value) { this.sequencerModel = value; }

    /**
     * The sequencing layout, aka the end type of sequencing.
     */
    @JsonProperty("sequencingLayout")
    public SequencingLayout getSequencingLayout() { return sequencingLayout; }
    @JsonProperty("sequencingLayout")
    public void setSequencingLayout(SequencingLayout value) { this.sequencingLayout = value; }

    @JsonProperty("tissueOntology")
    public TissueOntology getTissueOntology() { return tissueOntology; }
    @JsonProperty("tissueOntology")
    public void setTissueOntology(TissueOntology value) { this.tissueOntology = value; }

    /**
     * Tissue ID according to the ontology in use.
     */
    @JsonProperty("tissueTypeId")
    public String getTissueTypeId() { return tissueTypeId; }
    @JsonProperty("tissueTypeId")
    public void setTissueTypeId(String value) { this.tissueTypeId = value; }

    /**
     * Tissue name according to the ontology in use.
     */
    @JsonProperty("tissueTypeName")
    public String getTissueTypeName() { return tissueTypeName; }
    @JsonProperty("tissueTypeName")
    public void setTissueTypeName(String value) { this.tissueTypeName = value; }

    /**
     * Tuple of tumor cell counts and how they were determined.
     */
    @JsonProperty("tumorCellCount")
    public List<TumorCellCount> getTumorCellCount() { return tumorCellCount; }
    @JsonProperty("tumorCellCount")
    public void setTumorCellCount(List<TumorCellCount> value) { this.tumorCellCount = value; }
}
