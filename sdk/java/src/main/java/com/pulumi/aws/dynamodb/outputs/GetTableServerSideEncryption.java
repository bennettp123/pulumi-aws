// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.dynamodb.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetTableServerSideEncryption {
    private final Boolean enabled;
    private final String kmsKeyArn;

    @CustomType.Constructor
    private GetTableServerSideEncryption(
        @CustomType.Parameter("enabled") Boolean enabled,
        @CustomType.Parameter("kmsKeyArn") String kmsKeyArn) {
        this.enabled = enabled;
        this.kmsKeyArn = kmsKeyArn;
    }

    public Boolean enabled() {
        return this.enabled;
    }
    public String kmsKeyArn() {
        return this.kmsKeyArn;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetTableServerSideEncryption defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Boolean enabled;
        private String kmsKeyArn;

        public Builder() {
    	      // Empty
        }

        public Builder(GetTableServerSideEncryption defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enabled = defaults.enabled;
    	      this.kmsKeyArn = defaults.kmsKeyArn;
        }

        public Builder enabled(Boolean enabled) {
            this.enabled = Objects.requireNonNull(enabled);
            return this;
        }
        public Builder kmsKeyArn(String kmsKeyArn) {
            this.kmsKeyArn = Objects.requireNonNull(kmsKeyArn);
            return this;
        }        public GetTableServerSideEncryption build() {
            return new GetTableServerSideEncryption(enabled, kmsKeyArn);
        }
    }
}
