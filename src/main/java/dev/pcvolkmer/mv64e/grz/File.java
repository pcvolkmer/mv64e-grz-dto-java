package dev.pcvolkmer.mv64e.grz;

import com.fasterxml.jackson.annotation.*;

public class File {
    private ChecksumType checksumType;
    private String fileChecksum;
    private String filePath;
    private double fileSizeInBytes;
    private FileType fileType;
    private String flowcellId;
    private String laneId;
    private ReadOrder readOrder;

    /**
     * Type of checksum algorithm used
     */
    @JsonProperty("checksumType")
    public ChecksumType getChecksumType() { return checksumType; }
    @JsonProperty("checksumType")
    public void setChecksumType(ChecksumType value) { this.checksumType = value; }

    /**
     * checksum of the file
     */
    @JsonProperty("fileChecksum")
    public String getFileChecksum() { return fileChecksum; }
    @JsonProperty("fileChecksum")
    public void setFileChecksum(String value) { this.fileChecksum = value; }

    /**
     * Path relative to the submission root, e.g.:
     * sequencing_data/patient_001/patient_001_dna.bam
     */
    @JsonProperty("filePath")
    public String getFilePath() { return filePath; }
    @JsonProperty("filePath")
    public void setFilePath(String value) { this.filePath = value; }

    /**
     * Size of the file in bytes
     */
    @JsonProperty("fileSizeInBytes")
    public double getFileSizeInBytes() { return fileSizeInBytes; }
    @JsonProperty("fileSizeInBytes")
    public void setFileSizeInBytes(double value) { this.fileSizeInBytes = value; }

    /**
     * Type of the file; if BED file is submitted, only 1 file is allowed.
     */
    @JsonProperty("fileType")
    public FileType getFileType() { return fileType; }
    @JsonProperty("fileType")
    public void setFileType(FileType value) { this.fileType = value; }

    /**
     * Indicates the flow cell.
     */
    @JsonProperty("flowcellId")
    public String getFlowcellId() { return flowcellId; }
    @JsonProperty("flowcellId")
    public void setFlowcellId(String value) { this.flowcellId = value; }

    /**
     * Indicates the lane
     */
    @JsonProperty("laneId")
    public String getLaneId() { return laneId; }
    @JsonProperty("laneId")
    public void setLaneId(String value) { this.laneId = value; }

    /**
     * Indicates the read order for paired-end reads.
     */
    @JsonProperty("readOrder")
    public ReadOrder getReadOrder() { return readOrder; }
    @JsonProperty("readOrder")
    public void setReadOrder(ReadOrder value) { this.readOrder = value; }
}
