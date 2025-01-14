// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.route53.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetResolverRuleArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetResolverRuleArgs Empty = new GetResolverRuleArgs();

    /**
     * The domain name the desired resolver rule forwards DNS queries for. Conflicts with `resolver_rule_id`.
     * 
     */
    @Import(name="domainName")
    private @Nullable Output<String> domainName;

    /**
     * @return The domain name the desired resolver rule forwards DNS queries for. Conflicts with `resolver_rule_id`.
     * 
     */
    public Optional<Output<String>> domainName() {
        return Optional.ofNullable(this.domainName);
    }

    /**
     * The friendly name of the desired resolver rule. Conflicts with `resolver_rule_id`.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The friendly name of the desired resolver rule. Conflicts with `resolver_rule_id`.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * The ID of the outbound resolver endpoint of the desired resolver rule. Conflicts with `resolver_rule_id`.
     * 
     */
    @Import(name="resolverEndpointId")
    private @Nullable Output<String> resolverEndpointId;

    /**
     * @return The ID of the outbound resolver endpoint of the desired resolver rule. Conflicts with `resolver_rule_id`.
     * 
     */
    public Optional<Output<String>> resolverEndpointId() {
        return Optional.ofNullable(this.resolverEndpointId);
    }

    /**
     * The ID of the desired resolver rule. Conflicts with `domain_name`, `name`, `resolver_endpoint_id` and `rule_type`.
     * 
     */
    @Import(name="resolverRuleId")
    private @Nullable Output<String> resolverRuleId;

    /**
     * @return The ID of the desired resolver rule. Conflicts with `domain_name`, `name`, `resolver_endpoint_id` and `rule_type`.
     * 
     */
    public Optional<Output<String>> resolverRuleId() {
        return Optional.ofNullable(this.resolverRuleId);
    }

    /**
     * The rule type of the desired resolver rule. Valid values are `FORWARD`, `SYSTEM` and `RECURSIVE`. Conflicts with `resolver_rule_id`.
     * 
     */
    @Import(name="ruleType")
    private @Nullable Output<String> ruleType;

    /**
     * @return The rule type of the desired resolver rule. Valid values are `FORWARD`, `SYSTEM` and `RECURSIVE`. Conflicts with `resolver_rule_id`.
     * 
     */
    public Optional<Output<String>> ruleType() {
        return Optional.ofNullable(this.ruleType);
    }

    /**
     * A map of tags assigned to the resolver rule.
     * 
     */
    @Import(name="tags")
    private @Nullable Output<Map<String,String>> tags;

    /**
     * @return A map of tags assigned to the resolver rule.
     * 
     */
    public Optional<Output<Map<String,String>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    private GetResolverRuleArgs() {}

    private GetResolverRuleArgs(GetResolverRuleArgs $) {
        this.domainName = $.domainName;
        this.name = $.name;
        this.resolverEndpointId = $.resolverEndpointId;
        this.resolverRuleId = $.resolverRuleId;
        this.ruleType = $.ruleType;
        this.tags = $.tags;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetResolverRuleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetResolverRuleArgs $;

        public Builder() {
            $ = new GetResolverRuleArgs();
        }

        public Builder(GetResolverRuleArgs defaults) {
            $ = new GetResolverRuleArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param domainName The domain name the desired resolver rule forwards DNS queries for. Conflicts with `resolver_rule_id`.
         * 
         * @return builder
         * 
         */
        public Builder domainName(@Nullable Output<String> domainName) {
            $.domainName = domainName;
            return this;
        }

        /**
         * @param domainName The domain name the desired resolver rule forwards DNS queries for. Conflicts with `resolver_rule_id`.
         * 
         * @return builder
         * 
         */
        public Builder domainName(String domainName) {
            return domainName(Output.of(domainName));
        }

        /**
         * @param name The friendly name of the desired resolver rule. Conflicts with `resolver_rule_id`.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The friendly name of the desired resolver rule. Conflicts with `resolver_rule_id`.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param resolverEndpointId The ID of the outbound resolver endpoint of the desired resolver rule. Conflicts with `resolver_rule_id`.
         * 
         * @return builder
         * 
         */
        public Builder resolverEndpointId(@Nullable Output<String> resolverEndpointId) {
            $.resolverEndpointId = resolverEndpointId;
            return this;
        }

        /**
         * @param resolverEndpointId The ID of the outbound resolver endpoint of the desired resolver rule. Conflicts with `resolver_rule_id`.
         * 
         * @return builder
         * 
         */
        public Builder resolverEndpointId(String resolverEndpointId) {
            return resolverEndpointId(Output.of(resolverEndpointId));
        }

        /**
         * @param resolverRuleId The ID of the desired resolver rule. Conflicts with `domain_name`, `name`, `resolver_endpoint_id` and `rule_type`.
         * 
         * @return builder
         * 
         */
        public Builder resolverRuleId(@Nullable Output<String> resolverRuleId) {
            $.resolverRuleId = resolverRuleId;
            return this;
        }

        /**
         * @param resolverRuleId The ID of the desired resolver rule. Conflicts with `domain_name`, `name`, `resolver_endpoint_id` and `rule_type`.
         * 
         * @return builder
         * 
         */
        public Builder resolverRuleId(String resolverRuleId) {
            return resolverRuleId(Output.of(resolverRuleId));
        }

        /**
         * @param ruleType The rule type of the desired resolver rule. Valid values are `FORWARD`, `SYSTEM` and `RECURSIVE`. Conflicts with `resolver_rule_id`.
         * 
         * @return builder
         * 
         */
        public Builder ruleType(@Nullable Output<String> ruleType) {
            $.ruleType = ruleType;
            return this;
        }

        /**
         * @param ruleType The rule type of the desired resolver rule. Valid values are `FORWARD`, `SYSTEM` and `RECURSIVE`. Conflicts with `resolver_rule_id`.
         * 
         * @return builder
         * 
         */
        public Builder ruleType(String ruleType) {
            return ruleType(Output.of(ruleType));
        }

        /**
         * @param tags A map of tags assigned to the resolver rule.
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            $.tags = tags;
            return this;
        }

        /**
         * @param tags A map of tags assigned to the resolver rule.
         * 
         * @return builder
         * 
         */
        public Builder tags(Map<String,String> tags) {
            return tags(Output.of(tags));
        }

        public GetResolverRuleArgs build() {
            return $;
        }
    }

}
