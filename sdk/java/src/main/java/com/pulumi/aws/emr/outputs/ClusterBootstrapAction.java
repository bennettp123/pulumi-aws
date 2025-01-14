// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.emr.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@CustomType
public final class ClusterBootstrapAction {
    /**
     * @return List of command line arguments passed to the JAR file&#39;s main function when executed.
     * 
     */
    private final @Nullable List<String> args;
    /**
     * @return Name of the step.
     * 
     */
    private final String name;
    /**
     * @return Location of the script to run during a bootstrap action. Can be either a location in Amazon S3 or on a local file system.
     * 
     */
    private final String path;

    @CustomType.Constructor
    private ClusterBootstrapAction(
        @CustomType.Parameter("args") @Nullable List<String> args,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("path") String path) {
        this.args = args;
        this.name = name;
        this.path = path;
    }

    /**
     * @return List of command line arguments passed to the JAR file&#39;s main function when executed.
     * 
     */
    public List<String> args() {
        return this.args == null ? List.of() : this.args;
    }
    /**
     * @return Name of the step.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return Location of the script to run during a bootstrap action. Can be either a location in Amazon S3 or on a local file system.
     * 
     */
    public String path() {
        return this.path;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClusterBootstrapAction defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<String> args;
        private String name;
        private String path;

        public Builder() {
    	      // Empty
        }

        public Builder(ClusterBootstrapAction defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.args = defaults.args;
    	      this.name = defaults.name;
    	      this.path = defaults.path;
        }

        public Builder args(@Nullable List<String> args) {
            this.args = args;
            return this;
        }
        public Builder args(String... args) {
            return args(List.of(args));
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder path(String path) {
            this.path = Objects.requireNonNull(path);
            return this;
        }        public ClusterBootstrapAction build() {
            return new ClusterBootstrapAction(args, name, path);
        }
    }
}
