package dev.pcvolkmer.mv64e.grz;

import com.fasterxml.jackson.annotation.*;

public class TumorCellCount {
    private double count;
    private Method method;

    /**
     * Tumor cell count in %
     */
    @JsonProperty("count")
    public double getCount() { return count; }
    @JsonProperty("count")
    public void setCount(double value) { this.count = value; }

    /**
     * Method used to determine cell count.
     */
    @JsonProperty("method")
    public Method getMethod() { return method; }
    @JsonProperty("method")
    public void setMethod(Method value) { this.method = value; }
}
