// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.acmpca.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class CertificateAuthorityRevocationConfigurationOcspConfiguration {
    /**
     * @return Boolean value that specifies whether a custom OCSP responder is enabled.
     * 
     */
    private final Boolean enabled;
    /**
     * @return A CNAME specifying a customized OCSP domain. Note: The value of the CNAME must not include a protocol prefix such as &#34;http://&#34; or &#34;https://&#34;.
     * 
     */
    private final @Nullable String ocspCustomCname;

    @CustomType.Constructor
    private CertificateAuthorityRevocationConfigurationOcspConfiguration(
        @CustomType.Parameter("enabled") Boolean enabled,
        @CustomType.Parameter("ocspCustomCname") @Nullable String ocspCustomCname) {
        this.enabled = enabled;
        this.ocspCustomCname = ocspCustomCname;
    }

    /**
     * @return Boolean value that specifies whether a custom OCSP responder is enabled.
     * 
     */
    public Boolean enabled() {
        return this.enabled;
    }
    /**
     * @return A CNAME specifying a customized OCSP domain. Note: The value of the CNAME must not include a protocol prefix such as &#34;http://&#34; or &#34;https://&#34;.
     * 
     */
    public Optional<String> ocspCustomCname() {
        return Optional.ofNullable(this.ocspCustomCname);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CertificateAuthorityRevocationConfigurationOcspConfiguration defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Boolean enabled;
        private @Nullable String ocspCustomCname;

        public Builder() {
    	      // Empty
        }

        public Builder(CertificateAuthorityRevocationConfigurationOcspConfiguration defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enabled = defaults.enabled;
    	      this.ocspCustomCname = defaults.ocspCustomCname;
        }

        public Builder enabled(Boolean enabled) {
            this.enabled = Objects.requireNonNull(enabled);
            return this;
        }
        public Builder ocspCustomCname(@Nullable String ocspCustomCname) {
            this.ocspCustomCname = ocspCustomCname;
            return this;
        }        public CertificateAuthorityRevocationConfigurationOcspConfiguration build() {
            return new CertificateAuthorityRevocationConfigurationOcspConfiguration(enabled, ocspCustomCname);
        }
    }
}
