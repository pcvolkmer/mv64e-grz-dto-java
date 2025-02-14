package dev.pcvolkmer.mv64e.grz;

import java.io.IOException;
import com.fasterxml.jackson.annotation.*;

/**
 * Type of the file; if BED file is submitted, only 1 file is allowed.
 */
public enum FileType {
    BAM, BED, FASTQ, VCF;

    @JsonValue
    public String toValue() {
        switch (this) {
            case BAM: return "bam";
            case BED: return "bed";
            case FASTQ: return "fastq";
            case VCF: return "vcf";
        }
        return null;
    }

    @JsonCreator
    public static FileType forValue(String value) throws IOException {
        if (value.equals("bam")) return BAM;
        if (value.equals("bed")) return BED;
        if (value.equals("fastq")) return FASTQ;
        if (value.equals("vcf")) return VCF;
        throw new IOException("Cannot deserialize FileType");
    }
}
