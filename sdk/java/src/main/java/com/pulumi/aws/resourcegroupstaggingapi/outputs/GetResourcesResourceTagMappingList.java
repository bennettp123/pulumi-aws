// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.resourcegroupstaggingapi.outputs;

import com.pulumi.aws.resourcegroupstaggingapi.outputs.GetResourcesResourceTagMappingListComplianceDetail;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;

@CustomType
public final class GetResourcesResourceTagMappingList {
    /**
     * @return List of objects with information that shows whether a resource is compliant with the effective tag policy, including details on any noncompliant tag keys.
     * 
     */
    private final List<GetResourcesResourceTagMappingListComplianceDetail> complianceDetails;
    /**
     * @return ARN of the resource.
     * 
     */
    private final String resourceArn;
    /**
     * @return Map of tags assigned to the resource.
     * 
     */
    private final Map<String,String> tags;

    @CustomType.Constructor
    private GetResourcesResourceTagMappingList(
        @CustomType.Parameter("complianceDetails") List<GetResourcesResourceTagMappingListComplianceDetail> complianceDetails,
        @CustomType.Parameter("resourceArn") String resourceArn,
        @CustomType.Parameter("tags") Map<String,String> tags) {
        this.complianceDetails = complianceDetails;
        this.resourceArn = resourceArn;
        this.tags = tags;
    }

    /**
     * @return List of objects with information that shows whether a resource is compliant with the effective tag policy, including details on any noncompliant tag keys.
     * 
     */
    public List<GetResourcesResourceTagMappingListComplianceDetail> complianceDetails() {
        return this.complianceDetails;
    }
    /**
     * @return ARN of the resource.
     * 
     */
    public String resourceArn() {
        return this.resourceArn;
    }
    /**
     * @return Map of tags assigned to the resource.
     * 
     */
    public Map<String,String> tags() {
        return this.tags;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetResourcesResourceTagMappingList defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<GetResourcesResourceTagMappingListComplianceDetail> complianceDetails;
        private String resourceArn;
        private Map<String,String> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(GetResourcesResourceTagMappingList defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.complianceDetails = defaults.complianceDetails;
    	      this.resourceArn = defaults.resourceArn;
    	      this.tags = defaults.tags;
        }

        public Builder complianceDetails(List<GetResourcesResourceTagMappingListComplianceDetail> complianceDetails) {
            this.complianceDetails = Objects.requireNonNull(complianceDetails);
            return this;
        }
        public Builder complianceDetails(GetResourcesResourceTagMappingListComplianceDetail... complianceDetails) {
            return complianceDetails(List.of(complianceDetails));
        }
        public Builder resourceArn(String resourceArn) {
            this.resourceArn = Objects.requireNonNull(resourceArn);
            return this;
        }
        public Builder tags(Map<String,String> tags) {
            this.tags = Objects.requireNonNull(tags);
            return this;
        }        public GetResourcesResourceTagMappingList build() {
            return new GetResourcesResourceTagMappingList(complianceDetails, resourceArn, tags);
        }
    }
}
