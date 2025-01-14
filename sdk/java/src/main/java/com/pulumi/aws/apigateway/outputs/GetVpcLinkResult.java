// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.apigateway.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;

@CustomType
public final class GetVpcLinkResult {
    /**
     * @return The description of the VPC link.
     * 
     */
    private final String description;
    /**
     * @return Set to the ID of the found API Gateway VPC Link.
     * 
     */
    private final String id;
    private final String name;
    /**
     * @return The status of the VPC link.
     * 
     */
    private final String status;
    /**
     * @return The status message of the VPC link.
     * 
     */
    private final String statusMessage;
    /**
     * @return Key-value map of resource tags
     * 
     */
    private final Map<String,String> tags;
    /**
     * @return The list of network load balancer arns in the VPC targeted by the VPC link. Currently AWS only supports 1 target.
     * 
     */
    private final List<String> targetArns;

    @CustomType.Constructor
    private GetVpcLinkResult(
        @CustomType.Parameter("description") String description,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("status") String status,
        @CustomType.Parameter("statusMessage") String statusMessage,
        @CustomType.Parameter("tags") Map<String,String> tags,
        @CustomType.Parameter("targetArns") List<String> targetArns) {
        this.description = description;
        this.id = id;
        this.name = name;
        this.status = status;
        this.statusMessage = statusMessage;
        this.tags = tags;
        this.targetArns = targetArns;
    }

    /**
     * @return The description of the VPC link.
     * 
     */
    public String description() {
        return this.description;
    }
    /**
     * @return Set to the ID of the found API Gateway VPC Link.
     * 
     */
    public String id() {
        return this.id;
    }
    public String name() {
        return this.name;
    }
    /**
     * @return The status of the VPC link.
     * 
     */
    public String status() {
        return this.status;
    }
    /**
     * @return The status message of the VPC link.
     * 
     */
    public String statusMessage() {
        return this.statusMessage;
    }
    /**
     * @return Key-value map of resource tags
     * 
     */
    public Map<String,String> tags() {
        return this.tags;
    }
    /**
     * @return The list of network load balancer arns in the VPC targeted by the VPC link. Currently AWS only supports 1 target.
     * 
     */
    public List<String> targetArns() {
        return this.targetArns;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetVpcLinkResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String description;
        private String id;
        private String name;
        private String status;
        private String statusMessage;
        private Map<String,String> tags;
        private List<String> targetArns;

        public Builder() {
    	      // Empty
        }

        public Builder(GetVpcLinkResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.id = defaults.id;
    	      this.name = defaults.name;
    	      this.status = defaults.status;
    	      this.statusMessage = defaults.statusMessage;
    	      this.tags = defaults.tags;
    	      this.targetArns = defaults.targetArns;
        }

        public Builder description(String description) {
            this.description = Objects.requireNonNull(description);
            return this;
        }
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder status(String status) {
            this.status = Objects.requireNonNull(status);
            return this;
        }
        public Builder statusMessage(String statusMessage) {
            this.statusMessage = Objects.requireNonNull(statusMessage);
            return this;
        }
        public Builder tags(Map<String,String> tags) {
            this.tags = Objects.requireNonNull(tags);
            return this;
        }
        public Builder targetArns(List<String> targetArns) {
            this.targetArns = Objects.requireNonNull(targetArns);
            return this;
        }
        public Builder targetArns(String... targetArns) {
            return targetArns(List.of(targetArns));
        }        public GetVpcLinkResult build() {
            return new GetVpcLinkResult(description, id, name, status, statusMessage, tags, targetArns);
        }
    }
}
