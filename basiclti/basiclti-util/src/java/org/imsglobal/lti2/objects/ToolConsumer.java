
package org.imsglobal.lti2.objects;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Generated;

import org.imsglobal.lti2.LTI2Config;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

@JsonSerialize(include = JsonSerialize.Inclusion.NON_NULL)
@Generated("com.googlecode.jsonschema2pojo")
@JsonPropertyOrder({
    "@context",
    "@type",
    "@id",
    "lti_version",
    "guid",
    "product_instance",
    "capability_offered",
    "service_offered"
})
public class ToolConsumer {

    public static final String LTI_LAUNCH = "basic-lti-launch-request";

    public static final String USER_ID = "User.id";
    public static final String USER_USERNAME = "User.username";
    public static final String USER_IMAGE = "User.image" ;

    public static final String COURSESECTION_SOURCEDID = "CourseSection.sourcedId";
    public static final String MEMBERSHIP_ROLE = "Membership.role";

    public static final String PERSON_SOURCEDID = "Person.sourcedId";
    public static final String PERSON_NAME_FULL = "Person.name.full";
    public static final String PERSON_NAME_GIVEN = "Person.name.given" ;
    public static final String PERSON_NAME_FAMILY = "Person.name.family" ;
    public static final String PERSON_EMAIL_PRIMARY = "Person.email.primary" ;

    public static final String LTILINK_CUSTOM_URL = "LtiLink.custom.url";
    public static final String TOOLPROXY_CUSTOM_URL = "ToolProxy.custom.url";
    public static final String TOOLPROXYBINDING_CUSTOM_URL = "ToolProxyBinding.custom.url";

    public static final String RESULT_SOURCEDID = "Result.sourcedId" ;
    public static final String RESULT_AUTOCREATE = "Result.autocreate";
    public static final String RESULT_URL = "Result.url";

    public static final String OAUTH_SPLITSECRET = "OAuth.splitSecret";
    public static final String OAUTH_HMAC256 = "OAuth.hmac-sha256";

    @JsonProperty("@context")
    private List<Object> _context = new ArrayList<Object>();
    @JsonProperty("@type")
    private String _type;
    @JsonProperty("@id")
    private String _id;
    @JsonProperty("lti_version")
    private String lti_version;
    @JsonProperty("guid")
    private String guid;
    @JsonProperty("product_instance")
    private Product_instance product_instance;
    @JsonProperty("capability_offered")
    private List<String> capability_offered = new ArrayList<String>();
    @JsonProperty("service_offered")
    private List<Service_offered> service_offered = new ArrayList<Service_offered>();
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    public static String[] STANDARD_CAPABILITIES = {
        LTI_LAUNCH, USER_ID, COURSESECTION_SOURCEDID, 
        PERSON_SOURCEDID, MEMBERSHIP_ROLE
    } ;

    // Constructor
    public ToolConsumer(String guid, String tcp, LTI2Config cnf) {
        this._context.add("http://purl.imsglobal.org/ctx/lti/v2/ToolConsumerProfile");
        NamedContext nc = new NamedContext();
        nc.setAdditionalProperties("tcp", tcp);
        this._context.add(nc);
        this._type = "ToolConsumerProfile";
        this.lti_version = "LTI-2p0";
        this.guid = guid;
        this.product_instance = new Product_instance(cnf);
        addCapabilites(STANDARD_CAPABILITIES);
    }

    @JsonProperty("@context")
    public List<Object> get_context() {
        return _context;
    }

    @JsonProperty("@context")
    public void set_context(List<Object> _context) {
        this._context = _context;
    }

    @JsonProperty("@type")
    public String get_type() {
        return _type;
    }

    @JsonProperty("@type")
    public void set_type(String _type) {
        this._type = _type;
    }

    @JsonProperty("@id")
    public String get_id() {
        return _id;
    }

    @JsonProperty("@id")
    public void set_id(String _id) {
        this._id = _id;
    }

    @JsonProperty("lti_version")
    public String getLti_version() {
        return lti_version;
    }

    @JsonProperty("lti_version")
    public void setLti_version(String lti_version) {
        this.lti_version = lti_version;
    }

    @JsonProperty("guid")
    public String getGuid() {
        return guid;
    }

    @JsonProperty("guid")
    public void setGuid(String guid) {
        this.guid = guid;
    }

    @JsonProperty("product_instance")
    public Product_instance getProduct_instance() {
        return product_instance;
    }

    @JsonProperty("product_instance")
    public void setProduct_instance(Product_instance product_instance) {
        this.product_instance = product_instance;
    }

    @JsonProperty("capability_offered")
    public List<String> getCapability_offered() {
        return capability_offered;
    }

    @JsonProperty("capability_offered")
    public void setCapability_offered(List<String> capability_offered) {
        this.capability_offered = capability_offered;
    }

    @JsonProperty("service_offered")
    public List<Service_offered> getService_offered() {
        return service_offered;
    }

    @JsonProperty("service_offered")
    public void setService_offered(List<Service_offered> service_offered) {
        this.service_offered = service_offered;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperties(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    // Convienence method
    public void addCapabilites(String [] capabilities) {
        Collections.addAll(this.capability_offered, capabilities);
    }

    // Convienence method
    public void addCapability(String capability) {
        this.capability_offered.add(capability);
    }

    public void allowEmail() {
        this.capability_offered.add(PERSON_EMAIL_PRIMARY);
    }

    public void allowName() {
        this.capability_offered.add(USER_USERNAME);
        this.capability_offered.add(PERSON_NAME_FULL);
        this.capability_offered.add(PERSON_NAME_GIVEN);
        this.capability_offered.add(PERSON_NAME_FAMILY);
        this.capability_offered.add(PERSON_NAME_FULL);
    }

    public void allowResult() {
        this.capability_offered.add(RESULT_SOURCEDID);
        this.capability_offered.add(RESULT_AUTOCREATE);
        this.capability_offered.add(RESULT_URL);
    }

    public void allowSettings() {
        this.capability_offered.add(LTILINK_CUSTOM_URL);
        this.capability_offered.add(TOOLPROXY_CUSTOM_URL);
        this.capability_offered.add(TOOLPROXYBINDING_CUSTOM_URL);
    }

    public void allowSplitSecret() {
        this.capability_offered.add(OAUTH_SPLITSECRET);
    }

    public void allowHmac256() {
        this.capability_offered.add(OAUTH_HMAC256);
    }
}
