// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.wafv2.outputs;

import com.pulumi.aws.wafv2.outputs.RuleGroupRuleActionCountCustomRequestHandlingInsertHeader;
import com.pulumi.core.annotations.CustomType;
import java.util.List;
import java.util.Objects;

@CustomType
public final class RuleGroupRuleActionCountCustomRequestHandling {
    /**
     * @return The `insert_header` blocks used to define HTTP headers added to the request. See Custom HTTP Header below for details.
     * 
     */
    private final List<RuleGroupRuleActionCountCustomRequestHandlingInsertHeader> insertHeaders;

    @CustomType.Constructor
    private RuleGroupRuleActionCountCustomRequestHandling(@CustomType.Parameter("insertHeaders") List<RuleGroupRuleActionCountCustomRequestHandlingInsertHeader> insertHeaders) {
        this.insertHeaders = insertHeaders;
    }

    /**
     * @return The `insert_header` blocks used to define HTTP headers added to the request. See Custom HTTP Header below for details.
     * 
     */
    public List<RuleGroupRuleActionCountCustomRequestHandlingInsertHeader> insertHeaders() {
        return this.insertHeaders;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RuleGroupRuleActionCountCustomRequestHandling defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<RuleGroupRuleActionCountCustomRequestHandlingInsertHeader> insertHeaders;

        public Builder() {
    	      // Empty
        }

        public Builder(RuleGroupRuleActionCountCustomRequestHandling defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.insertHeaders = defaults.insertHeaders;
        }

        public Builder insertHeaders(List<RuleGroupRuleActionCountCustomRequestHandlingInsertHeader> insertHeaders) {
            this.insertHeaders = Objects.requireNonNull(insertHeaders);
            return this;
        }
        public Builder insertHeaders(RuleGroupRuleActionCountCustomRequestHandlingInsertHeader... insertHeaders) {
            return insertHeaders(List.of(insertHeaders));
        }        public RuleGroupRuleActionCountCustomRequestHandling build() {
            return new RuleGroupRuleActionCountCustomRequestHandling(insertHeaders);
        }
    }
}
