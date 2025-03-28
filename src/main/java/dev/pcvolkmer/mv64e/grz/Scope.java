package dev.pcvolkmer.mv64e.grz;

import com.fasterxml.jackson.annotation.*;
import java.util.Date;

public class Scope {
    private Date date;
    private Domain domain;
    private Type type;

    /**
     * Date of signature of the pilot projects consent; in ISO 8601 format YYYY-MM-DD.
     */
    @JsonProperty("date")
    @JsonFormat(pattern = "yyyy-MM-dd")
    public Date getDate() { return date; }
    @JsonProperty("date")
    @JsonFormat(pattern = "yyyy-MM-dd")
    public void setDate(Date value) { this.date = value; }

    /**
     * Scope of consent or revocation.
     */
    @JsonProperty("domain")
    public Domain getDomain() { return domain; }
    @JsonProperty("domain")
    public void setDomain(Domain value) { this.domain = value; }

    /**
     * Consent or refusal to participate and consent, must be indicated for each option listed
     * in the scope of consent.
     */
    @JsonProperty("type")
    public Type getType() { return type; }
    @JsonProperty("type")
    public void setType(Type value) { this.type = value; }
}
