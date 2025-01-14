// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.ec2.inputs;

import com.pulumi.aws.ec2.inputs.GetNetworkInterfaceFilter;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetNetworkInterfacePlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetNetworkInterfacePlainArgs Empty = new GetNetworkInterfacePlainArgs();

    /**
     * One or more name/value pairs to filter off of. There are several valid keys, for a full reference, check out [describe-network-interfaces](https://docs.aws.amazon.com/cli/latest/reference/ec2/describe-network-interfaces.html) in the AWS CLI reference.
     * 
     */
    @Import(name="filters")
    private @Nullable List<GetNetworkInterfaceFilter> filters;

    /**
     * @return One or more name/value pairs to filter off of. There are several valid keys, for a full reference, check out [describe-network-interfaces](https://docs.aws.amazon.com/cli/latest/reference/ec2/describe-network-interfaces.html) in the AWS CLI reference.
     * 
     */
    public Optional<List<GetNetworkInterfaceFilter>> filters() {
        return Optional.ofNullable(this.filters);
    }

    /**
     * The identifier for the network interface.
     * 
     */
    @Import(name="id")
    private @Nullable String id;

    /**
     * @return The identifier for the network interface.
     * 
     */
    public Optional<String> id() {
        return Optional.ofNullable(this.id);
    }

    /**
     * Any tags assigned to the network interface.
     * 
     */
    @Import(name="tags")
    private @Nullable Map<String,String> tags;

    /**
     * @return Any tags assigned to the network interface.
     * 
     */
    public Optional<Map<String,String>> tags() {
        return Optional.ofNullable(this.tags);
    }

    private GetNetworkInterfacePlainArgs() {}

    private GetNetworkInterfacePlainArgs(GetNetworkInterfacePlainArgs $) {
        this.filters = $.filters;
        this.id = $.id;
        this.tags = $.tags;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetNetworkInterfacePlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetNetworkInterfacePlainArgs $;

        public Builder() {
            $ = new GetNetworkInterfacePlainArgs();
        }

        public Builder(GetNetworkInterfacePlainArgs defaults) {
            $ = new GetNetworkInterfacePlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param filters One or more name/value pairs to filter off of. There are several valid keys, for a full reference, check out [describe-network-interfaces](https://docs.aws.amazon.com/cli/latest/reference/ec2/describe-network-interfaces.html) in the AWS CLI reference.
         * 
         * @return builder
         * 
         */
        public Builder filters(@Nullable List<GetNetworkInterfaceFilter> filters) {
            $.filters = filters;
            return this;
        }

        /**
         * @param filters One or more name/value pairs to filter off of. There are several valid keys, for a full reference, check out [describe-network-interfaces](https://docs.aws.amazon.com/cli/latest/reference/ec2/describe-network-interfaces.html) in the AWS CLI reference.
         * 
         * @return builder
         * 
         */
        public Builder filters(GetNetworkInterfaceFilter... filters) {
            return filters(List.of(filters));
        }

        /**
         * @param id The identifier for the network interface.
         * 
         * @return builder
         * 
         */
        public Builder id(@Nullable String id) {
            $.id = id;
            return this;
        }

        /**
         * @param tags Any tags assigned to the network interface.
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable Map<String,String> tags) {
            $.tags = tags;
            return this;
        }

        public GetNetworkInterfacePlainArgs build() {
            return $;
        }
    }

}
