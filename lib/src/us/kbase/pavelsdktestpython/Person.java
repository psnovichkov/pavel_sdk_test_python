
package us.kbase.pavelsdktestpython;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * <p>Original spec-file type: Person</p>
 * 
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("com.googlecode.jsonschema2pojo")
@JsonPropertyOrder({
    "person_name",
    "person_url"
})
public class Person {

    @JsonProperty("person_name")
    private String personName;
    @JsonProperty("person_url")
    private String personUrl;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("person_name")
    public String getPersonName() {
        return personName;
    }

    @JsonProperty("person_name")
    public void setPersonName(String personName) {
        this.personName = personName;
    }

    public Person withPersonName(String personName) {
        this.personName = personName;
        return this;
    }

    @JsonProperty("person_url")
    public String getPersonUrl() {
        return personUrl;
    }

    @JsonProperty("person_url")
    public void setPersonUrl(String personUrl) {
        this.personUrl = personUrl;
    }

    public Person withPersonUrl(String personUrl) {
        this.personUrl = personUrl;
        return this;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperties(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    @Override
    public String toString() {
        return ((((((("Person"+" [personName=")+ personName)+", personUrl=")+ personUrl)+", additionalProperties=")+ additionalProperties)+"]");
    }

}
