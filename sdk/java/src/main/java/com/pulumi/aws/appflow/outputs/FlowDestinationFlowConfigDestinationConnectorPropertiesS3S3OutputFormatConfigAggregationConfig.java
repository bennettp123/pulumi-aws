// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.appflow.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class FlowDestinationFlowConfigDestinationConnectorPropertiesS3S3OutputFormatConfigAggregationConfig {
    /**
     * @return Specifies whether Amazon AppFlow aggregates the flow records into a single file, or leave them unaggregated. Valid values are `None` and `SingleFile`.
     * 
     */
    private final @Nullable String aggregationType;

    @CustomType.Constructor
    private FlowDestinationFlowConfigDestinationConnectorPropertiesS3S3OutputFormatConfigAggregationConfig(@CustomType.Parameter("aggregationType") @Nullable String aggregationType) {
        this.aggregationType = aggregationType;
    }

    /**
     * @return Specifies whether Amazon AppFlow aggregates the flow records into a single file, or leave them unaggregated. Valid values are `None` and `SingleFile`.
     * 
     */
    public Optional<String> aggregationType() {
        return Optional.ofNullable(this.aggregationType);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FlowDestinationFlowConfigDestinationConnectorPropertiesS3S3OutputFormatConfigAggregationConfig defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String aggregationType;

        public Builder() {
    	      // Empty
        }

        public Builder(FlowDestinationFlowConfigDestinationConnectorPropertiesS3S3OutputFormatConfigAggregationConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.aggregationType = defaults.aggregationType;
        }

        public Builder aggregationType(@Nullable String aggregationType) {
            this.aggregationType = aggregationType;
            return this;
        }        public FlowDestinationFlowConfigDestinationConnectorPropertiesS3S3OutputFormatConfigAggregationConfig build() {
            return new FlowDestinationFlowConfigDestinationConnectorPropertiesS3S3OutputFormatConfigAggregationConfig(aggregationType);
        }
    }
}
