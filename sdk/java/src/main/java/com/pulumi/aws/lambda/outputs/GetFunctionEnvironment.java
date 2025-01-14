// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.lambda.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Map;
import java.util.Objects;

@CustomType
public final class GetFunctionEnvironment {
    private final Map<String,String> variables;

    @CustomType.Constructor
    private GetFunctionEnvironment(@CustomType.Parameter("variables") Map<String,String> variables) {
        this.variables = variables;
    }

    public Map<String,String> variables() {
        return this.variables;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetFunctionEnvironment defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Map<String,String> variables;

        public Builder() {
    	      // Empty
        }

        public Builder(GetFunctionEnvironment defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.variables = defaults.variables;
        }

        public Builder variables(Map<String,String> variables) {
            this.variables = Objects.requireNonNull(variables);
            return this;
        }        public GetFunctionEnvironment build() {
            return new GetFunctionEnvironment(variables);
        }
    }
}
