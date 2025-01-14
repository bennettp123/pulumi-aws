// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.emr.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetReleaseLabelsFilters {
    /**
     * @return Optional release label application filter. For example, `Spark@2.1.0` or `Spark`.
     * 
     */
    private final @Nullable String application;
    /**
     * @return Optional release label version prefix filter. For example, `emr-5`.
     * 
     */
    private final @Nullable String prefix;

    @CustomType.Constructor
    private GetReleaseLabelsFilters(
        @CustomType.Parameter("application") @Nullable String application,
        @CustomType.Parameter("prefix") @Nullable String prefix) {
        this.application = application;
        this.prefix = prefix;
    }

    /**
     * @return Optional release label application filter. For example, `Spark@2.1.0` or `Spark`.
     * 
     */
    public Optional<String> application() {
        return Optional.ofNullable(this.application);
    }
    /**
     * @return Optional release label version prefix filter. For example, `emr-5`.
     * 
     */
    public Optional<String> prefix() {
        return Optional.ofNullable(this.prefix);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetReleaseLabelsFilters defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String application;
        private @Nullable String prefix;

        public Builder() {
    	      // Empty
        }

        public Builder(GetReleaseLabelsFilters defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.application = defaults.application;
    	      this.prefix = defaults.prefix;
        }

        public Builder application(@Nullable String application) {
            this.application = application;
            return this;
        }
        public Builder prefix(@Nullable String prefix) {
            this.prefix = prefix;
            return this;
        }        public GetReleaseLabelsFilters build() {
            return new GetReleaseLabelsFilters(application, prefix);
        }
    }
}
