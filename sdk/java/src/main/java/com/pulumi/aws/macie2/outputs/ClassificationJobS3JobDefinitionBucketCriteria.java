// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.macie2.outputs;

import com.pulumi.aws.macie2.outputs.ClassificationJobS3JobDefinitionBucketCriteriaExcludes;
import com.pulumi.aws.macie2.outputs.ClassificationJobS3JobDefinitionBucketCriteriaIncludes;
import com.pulumi.core.annotations.CustomType;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ClassificationJobS3JobDefinitionBucketCriteria {
    /**
     * @return The property- or tag-based conditions that determine which S3 buckets to exclude from the analysis. (documented below)
     * 
     */
    private final @Nullable ClassificationJobS3JobDefinitionBucketCriteriaExcludes excludes;
    /**
     * @return The property- or tag-based conditions that determine which S3 buckets to include in the analysis. (documented below)
     * 
     */
    private final @Nullable ClassificationJobS3JobDefinitionBucketCriteriaIncludes includes;

    @CustomType.Constructor
    private ClassificationJobS3JobDefinitionBucketCriteria(
        @CustomType.Parameter("excludes") @Nullable ClassificationJobS3JobDefinitionBucketCriteriaExcludes excludes,
        @CustomType.Parameter("includes") @Nullable ClassificationJobS3JobDefinitionBucketCriteriaIncludes includes) {
        this.excludes = excludes;
        this.includes = includes;
    }

    /**
     * @return The property- or tag-based conditions that determine which S3 buckets to exclude from the analysis. (documented below)
     * 
     */
    public Optional<ClassificationJobS3JobDefinitionBucketCriteriaExcludes> excludes() {
        return Optional.ofNullable(this.excludes);
    }
    /**
     * @return The property- or tag-based conditions that determine which S3 buckets to include in the analysis. (documented below)
     * 
     */
    public Optional<ClassificationJobS3JobDefinitionBucketCriteriaIncludes> includes() {
        return Optional.ofNullable(this.includes);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClassificationJobS3JobDefinitionBucketCriteria defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable ClassificationJobS3JobDefinitionBucketCriteriaExcludes excludes;
        private @Nullable ClassificationJobS3JobDefinitionBucketCriteriaIncludes includes;

        public Builder() {
    	      // Empty
        }

        public Builder(ClassificationJobS3JobDefinitionBucketCriteria defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.excludes = defaults.excludes;
    	      this.includes = defaults.includes;
        }

        public Builder excludes(@Nullable ClassificationJobS3JobDefinitionBucketCriteriaExcludes excludes) {
            this.excludes = excludes;
            return this;
        }
        public Builder includes(@Nullable ClassificationJobS3JobDefinitionBucketCriteriaIncludes includes) {
            this.includes = includes;
            return this;
        }        public ClassificationJobS3JobDefinitionBucketCriteria build() {
            return new ClassificationJobS3JobDefinitionBucketCriteria(excludes, includes);
        }
    }
}
