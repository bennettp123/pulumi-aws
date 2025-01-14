// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.acmpca.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetCertificateResult {
    private final String arn;
    /**
     * @return The PEM-encoded certificate value.
     * 
     */
    private final String certificate;
    private final String certificateAuthorityArn;
    /**
     * @return The PEM-encoded certificate chain that includes any intermediate certificates and chains up to root CA.
     * 
     */
    private final String certificateChain;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private final String id;

    @CustomType.Constructor
    private GetCertificateResult(
        @CustomType.Parameter("arn") String arn,
        @CustomType.Parameter("certificate") String certificate,
        @CustomType.Parameter("certificateAuthorityArn") String certificateAuthorityArn,
        @CustomType.Parameter("certificateChain") String certificateChain,
        @CustomType.Parameter("id") String id) {
        this.arn = arn;
        this.certificate = certificate;
        this.certificateAuthorityArn = certificateAuthorityArn;
        this.certificateChain = certificateChain;
        this.id = id;
    }

    public String arn() {
        return this.arn;
    }
    /**
     * @return The PEM-encoded certificate value.
     * 
     */
    public String certificate() {
        return this.certificate;
    }
    public String certificateAuthorityArn() {
        return this.certificateAuthorityArn;
    }
    /**
     * @return The PEM-encoded certificate chain that includes any intermediate certificates and chains up to root CA.
     * 
     */
    public String certificateChain() {
        return this.certificateChain;
    }
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetCertificateResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String arn;
        private String certificate;
        private String certificateAuthorityArn;
        private String certificateChain;
        private String id;

        public Builder() {
    	      // Empty
        }

        public Builder(GetCertificateResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arn = defaults.arn;
    	      this.certificate = defaults.certificate;
    	      this.certificateAuthorityArn = defaults.certificateAuthorityArn;
    	      this.certificateChain = defaults.certificateChain;
    	      this.id = defaults.id;
        }

        public Builder arn(String arn) {
            this.arn = Objects.requireNonNull(arn);
            return this;
        }
        public Builder certificate(String certificate) {
            this.certificate = Objects.requireNonNull(certificate);
            return this;
        }
        public Builder certificateAuthorityArn(String certificateAuthorityArn) {
            this.certificateAuthorityArn = Objects.requireNonNull(certificateAuthorityArn);
            return this;
        }
        public Builder certificateChain(String certificateChain) {
            this.certificateChain = Objects.requireNonNull(certificateChain);
            return this;
        }
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }        public GetCertificateResult build() {
            return new GetCertificateResult(arn, certificate, certificateAuthorityArn, certificateChain, id);
        }
    }
}
