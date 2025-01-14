// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.cloudfront.inputs;

import com.pulumi.aws.cloudfront.inputs.CachePolicyParametersInCacheKeyAndForwardedToOriginHeadersConfigHeadersArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class CachePolicyParametersInCacheKeyAndForwardedToOriginHeadersConfigArgs extends com.pulumi.resources.ResourceArgs {

    public static final CachePolicyParametersInCacheKeyAndForwardedToOriginHeadersConfigArgs Empty = new CachePolicyParametersInCacheKeyAndForwardedToOriginHeadersConfigArgs();

    /**
     * Determines whether any HTTP headers are included in the cache key and automatically included in requests that CloudFront sends to the origin. Valid values are `none`, `whitelist`.
     * 
     */
    @Import(name="headerBehavior")
    private @Nullable Output<String> headerBehavior;

    /**
     * @return Determines whether any HTTP headers are included in the cache key and automatically included in requests that CloudFront sends to the origin. Valid values are `none`, `whitelist`.
     * 
     */
    public Optional<Output<String>> headerBehavior() {
        return Optional.ofNullable(this.headerBehavior);
    }

    /**
     * Object that contains a list of header names. See Items for more information.
     * 
     */
    @Import(name="headers")
    private @Nullable Output<CachePolicyParametersInCacheKeyAndForwardedToOriginHeadersConfigHeadersArgs> headers;

    /**
     * @return Object that contains a list of header names. See Items for more information.
     * 
     */
    public Optional<Output<CachePolicyParametersInCacheKeyAndForwardedToOriginHeadersConfigHeadersArgs>> headers() {
        return Optional.ofNullable(this.headers);
    }

    private CachePolicyParametersInCacheKeyAndForwardedToOriginHeadersConfigArgs() {}

    private CachePolicyParametersInCacheKeyAndForwardedToOriginHeadersConfigArgs(CachePolicyParametersInCacheKeyAndForwardedToOriginHeadersConfigArgs $) {
        this.headerBehavior = $.headerBehavior;
        this.headers = $.headers;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(CachePolicyParametersInCacheKeyAndForwardedToOriginHeadersConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private CachePolicyParametersInCacheKeyAndForwardedToOriginHeadersConfigArgs $;

        public Builder() {
            $ = new CachePolicyParametersInCacheKeyAndForwardedToOriginHeadersConfigArgs();
        }

        public Builder(CachePolicyParametersInCacheKeyAndForwardedToOriginHeadersConfigArgs defaults) {
            $ = new CachePolicyParametersInCacheKeyAndForwardedToOriginHeadersConfigArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param headerBehavior Determines whether any HTTP headers are included in the cache key and automatically included in requests that CloudFront sends to the origin. Valid values are `none`, `whitelist`.
         * 
         * @return builder
         * 
         */
        public Builder headerBehavior(@Nullable Output<String> headerBehavior) {
            $.headerBehavior = headerBehavior;
            return this;
        }

        /**
         * @param headerBehavior Determines whether any HTTP headers are included in the cache key and automatically included in requests that CloudFront sends to the origin. Valid values are `none`, `whitelist`.
         * 
         * @return builder
         * 
         */
        public Builder headerBehavior(String headerBehavior) {
            return headerBehavior(Output.of(headerBehavior));
        }

        /**
         * @param headers Object that contains a list of header names. See Items for more information.
         * 
         * @return builder
         * 
         */
        public Builder headers(@Nullable Output<CachePolicyParametersInCacheKeyAndForwardedToOriginHeadersConfigHeadersArgs> headers) {
            $.headers = headers;
            return this;
        }

        /**
         * @param headers Object that contains a list of header names. See Items for more information.
         * 
         * @return builder
         * 
         */
        public Builder headers(CachePolicyParametersInCacheKeyAndForwardedToOriginHeadersConfigHeadersArgs headers) {
            return headers(Output.of(headers));
        }

        public CachePolicyParametersInCacheKeyAndForwardedToOriginHeadersConfigArgs build() {
            return $;
        }
    }

}
