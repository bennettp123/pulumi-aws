// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.kms.inputs;

import com.pulumi.aws.kms.inputs.GrantConstraintArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GrantState extends com.pulumi.resources.ResourceArgs {

    public static final GrantState Empty = new GrantState();

    /**
     * A structure that you can use to allow certain operations in the grant only when the desired encryption context is present. For more information about encryption context, see [Encryption Context](http://docs.aws.amazon.com/kms/latest/developerguide/encryption-context.html).
     * 
     */
    @Import(name="constraints")
    private @Nullable Output<List<GrantConstraintArgs>> constraints;

    /**
     * @return A structure that you can use to allow certain operations in the grant only when the desired encryption context is present. For more information about encryption context, see [Encryption Context](http://docs.aws.amazon.com/kms/latest/developerguide/encryption-context.html).
     * 
     */
    public Optional<Output<List<GrantConstraintArgs>>> constraints() {
        return Optional.ofNullable(this.constraints);
    }

    /**
     * A list of grant tokens to be used when creating the grant. See [Grant Tokens](http://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#grant_token) for more information about grant tokens.
     * 
     */
    @Import(name="grantCreationTokens")
    private @Nullable Output<List<String>> grantCreationTokens;

    /**
     * @return A list of grant tokens to be used when creating the grant. See [Grant Tokens](http://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#grant_token) for more information about grant tokens.
     * 
     */
    public Optional<Output<List<String>>> grantCreationTokens() {
        return Optional.ofNullable(this.grantCreationTokens);
    }

    /**
     * The unique identifier for the grant.
     * 
     */
    @Import(name="grantId")
    private @Nullable Output<String> grantId;

    /**
     * @return The unique identifier for the grant.
     * 
     */
    public Optional<Output<String>> grantId() {
        return Optional.ofNullable(this.grantId);
    }

    /**
     * The grant token for the created grant. For more information, see [Grant Tokens](http://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#grant_token).
     * 
     */
    @Import(name="grantToken")
    private @Nullable Output<String> grantToken;

    /**
     * @return The grant token for the created grant. For more information, see [Grant Tokens](http://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#grant_token).
     * 
     */
    public Optional<Output<String>> grantToken() {
        return Optional.ofNullable(this.grantToken);
    }

    /**
     * The principal that is given permission to perform the operations that the grant permits in ARN format. Note that due to eventual consistency issues around IAM principals, the providers&#39;s state may not always be refreshed to reflect what is true in AWS.
     * 
     */
    @Import(name="granteePrincipal")
    private @Nullable Output<String> granteePrincipal;

    /**
     * @return The principal that is given permission to perform the operations that the grant permits in ARN format. Note that due to eventual consistency issues around IAM principals, the providers&#39;s state may not always be refreshed to reflect what is true in AWS.
     * 
     */
    public Optional<Output<String>> granteePrincipal() {
        return Optional.ofNullable(this.granteePrincipal);
    }

    /**
     * The unique identifier for the customer master key (CMK) that the grant applies to. Specify the key ID or the Amazon Resource Name (ARN) of the CMK. To specify a CMK in a different AWS account, you must use the key ARN.
     * 
     */
    @Import(name="keyId")
    private @Nullable Output<String> keyId;

    /**
     * @return The unique identifier for the customer master key (CMK) that the grant applies to. Specify the key ID or the Amazon Resource Name (ARN) of the CMK. To specify a CMK in a different AWS account, you must use the key ARN.
     * 
     */
    public Optional<Output<String>> keyId() {
        return Optional.ofNullable(this.keyId);
    }

    /**
     * A friendly name for identifying the grant.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return A friendly name for identifying the grant.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * A list of operations that the grant permits. The permitted values are: `Decrypt`, `Encrypt`, `GenerateDataKey`, `GenerateDataKeyWithoutPlaintext`, `ReEncryptFrom`, `ReEncryptTo`, `Sign`, `Verify`, `GetPublicKey`, `CreateGrant`, `RetireGrant`, `DescribeKey`, `GenerateDataKeyPair`, or `GenerateDataKeyPairWithoutPlaintext`.
     * 
     */
    @Import(name="operations")
    private @Nullable Output<List<String>> operations;

    /**
     * @return A list of operations that the grant permits. The permitted values are: `Decrypt`, `Encrypt`, `GenerateDataKey`, `GenerateDataKeyWithoutPlaintext`, `ReEncryptFrom`, `ReEncryptTo`, `Sign`, `Verify`, `GetPublicKey`, `CreateGrant`, `RetireGrant`, `DescribeKey`, `GenerateDataKeyPair`, or `GenerateDataKeyPairWithoutPlaintext`.
     * 
     */
    public Optional<Output<List<String>>> operations() {
        return Optional.ofNullable(this.operations);
    }

    /**
     * -(Defaults to false, Forces new resources) If set to false (the default) the grants will be revoked upon deletion, and if set to true the grants will try to be retired upon deletion. Note that retiring grants requires special permissions, hence why we default to revoking grants.
     * See [RetireGrant](https://docs.aws.amazon.com/kms/latest/APIReference/API_RetireGrant.html) for more information.
     * 
     */
    @Import(name="retireOnDelete")
    private @Nullable Output<Boolean> retireOnDelete;

    /**
     * @return -(Defaults to false, Forces new resources) If set to false (the default) the grants will be revoked upon deletion, and if set to true the grants will try to be retired upon deletion. Note that retiring grants requires special permissions, hence why we default to revoking grants.
     * See [RetireGrant](https://docs.aws.amazon.com/kms/latest/APIReference/API_RetireGrant.html) for more information.
     * 
     */
    public Optional<Output<Boolean>> retireOnDelete() {
        return Optional.ofNullable(this.retireOnDelete);
    }

    /**
     * The principal that is given permission to retire the grant by using RetireGrant operation in ARN format. Note that due to eventual consistency issues around IAM principals, the providers&#39;s state may not always be refreshed to reflect what is true in AWS.
     * 
     */
    @Import(name="retiringPrincipal")
    private @Nullable Output<String> retiringPrincipal;

    /**
     * @return The principal that is given permission to retire the grant by using RetireGrant operation in ARN format. Note that due to eventual consistency issues around IAM principals, the providers&#39;s state may not always be refreshed to reflect what is true in AWS.
     * 
     */
    public Optional<Output<String>> retiringPrincipal() {
        return Optional.ofNullable(this.retiringPrincipal);
    }

    private GrantState() {}

    private GrantState(GrantState $) {
        this.constraints = $.constraints;
        this.grantCreationTokens = $.grantCreationTokens;
        this.grantId = $.grantId;
        this.grantToken = $.grantToken;
        this.granteePrincipal = $.granteePrincipal;
        this.keyId = $.keyId;
        this.name = $.name;
        this.operations = $.operations;
        this.retireOnDelete = $.retireOnDelete;
        this.retiringPrincipal = $.retiringPrincipal;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GrantState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GrantState $;

        public Builder() {
            $ = new GrantState();
        }

        public Builder(GrantState defaults) {
            $ = new GrantState(Objects.requireNonNull(defaults));
        }

        /**
         * @param constraints A structure that you can use to allow certain operations in the grant only when the desired encryption context is present. For more information about encryption context, see [Encryption Context](http://docs.aws.amazon.com/kms/latest/developerguide/encryption-context.html).
         * 
         * @return builder
         * 
         */
        public Builder constraints(@Nullable Output<List<GrantConstraintArgs>> constraints) {
            $.constraints = constraints;
            return this;
        }

        /**
         * @param constraints A structure that you can use to allow certain operations in the grant only when the desired encryption context is present. For more information about encryption context, see [Encryption Context](http://docs.aws.amazon.com/kms/latest/developerguide/encryption-context.html).
         * 
         * @return builder
         * 
         */
        public Builder constraints(List<GrantConstraintArgs> constraints) {
            return constraints(Output.of(constraints));
        }

        /**
         * @param constraints A structure that you can use to allow certain operations in the grant only when the desired encryption context is present. For more information about encryption context, see [Encryption Context](http://docs.aws.amazon.com/kms/latest/developerguide/encryption-context.html).
         * 
         * @return builder
         * 
         */
        public Builder constraints(GrantConstraintArgs... constraints) {
            return constraints(List.of(constraints));
        }

        /**
         * @param grantCreationTokens A list of grant tokens to be used when creating the grant. See [Grant Tokens](http://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#grant_token) for more information about grant tokens.
         * 
         * @return builder
         * 
         */
        public Builder grantCreationTokens(@Nullable Output<List<String>> grantCreationTokens) {
            $.grantCreationTokens = grantCreationTokens;
            return this;
        }

        /**
         * @param grantCreationTokens A list of grant tokens to be used when creating the grant. See [Grant Tokens](http://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#grant_token) for more information about grant tokens.
         * 
         * @return builder
         * 
         */
        public Builder grantCreationTokens(List<String> grantCreationTokens) {
            return grantCreationTokens(Output.of(grantCreationTokens));
        }

        /**
         * @param grantCreationTokens A list of grant tokens to be used when creating the grant. See [Grant Tokens](http://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#grant_token) for more information about grant tokens.
         * 
         * @return builder
         * 
         */
        public Builder grantCreationTokens(String... grantCreationTokens) {
            return grantCreationTokens(List.of(grantCreationTokens));
        }

        /**
         * @param grantId The unique identifier for the grant.
         * 
         * @return builder
         * 
         */
        public Builder grantId(@Nullable Output<String> grantId) {
            $.grantId = grantId;
            return this;
        }

        /**
         * @param grantId The unique identifier for the grant.
         * 
         * @return builder
         * 
         */
        public Builder grantId(String grantId) {
            return grantId(Output.of(grantId));
        }

        /**
         * @param grantToken The grant token for the created grant. For more information, see [Grant Tokens](http://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#grant_token).
         * 
         * @return builder
         * 
         */
        public Builder grantToken(@Nullable Output<String> grantToken) {
            $.grantToken = grantToken;
            return this;
        }

        /**
         * @param grantToken The grant token for the created grant. For more information, see [Grant Tokens](http://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#grant_token).
         * 
         * @return builder
         * 
         */
        public Builder grantToken(String grantToken) {
            return grantToken(Output.of(grantToken));
        }

        /**
         * @param granteePrincipal The principal that is given permission to perform the operations that the grant permits in ARN format. Note that due to eventual consistency issues around IAM principals, the providers&#39;s state may not always be refreshed to reflect what is true in AWS.
         * 
         * @return builder
         * 
         */
        public Builder granteePrincipal(@Nullable Output<String> granteePrincipal) {
            $.granteePrincipal = granteePrincipal;
            return this;
        }

        /**
         * @param granteePrincipal The principal that is given permission to perform the operations that the grant permits in ARN format. Note that due to eventual consistency issues around IAM principals, the providers&#39;s state may not always be refreshed to reflect what is true in AWS.
         * 
         * @return builder
         * 
         */
        public Builder granteePrincipal(String granteePrincipal) {
            return granteePrincipal(Output.of(granteePrincipal));
        }

        /**
         * @param keyId The unique identifier for the customer master key (CMK) that the grant applies to. Specify the key ID or the Amazon Resource Name (ARN) of the CMK. To specify a CMK in a different AWS account, you must use the key ARN.
         * 
         * @return builder
         * 
         */
        public Builder keyId(@Nullable Output<String> keyId) {
            $.keyId = keyId;
            return this;
        }

        /**
         * @param keyId The unique identifier for the customer master key (CMK) that the grant applies to. Specify the key ID or the Amazon Resource Name (ARN) of the CMK. To specify a CMK in a different AWS account, you must use the key ARN.
         * 
         * @return builder
         * 
         */
        public Builder keyId(String keyId) {
            return keyId(Output.of(keyId));
        }

        /**
         * @param name A friendly name for identifying the grant.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name A friendly name for identifying the grant.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param operations A list of operations that the grant permits. The permitted values are: `Decrypt`, `Encrypt`, `GenerateDataKey`, `GenerateDataKeyWithoutPlaintext`, `ReEncryptFrom`, `ReEncryptTo`, `Sign`, `Verify`, `GetPublicKey`, `CreateGrant`, `RetireGrant`, `DescribeKey`, `GenerateDataKeyPair`, or `GenerateDataKeyPairWithoutPlaintext`.
         * 
         * @return builder
         * 
         */
        public Builder operations(@Nullable Output<List<String>> operations) {
            $.operations = operations;
            return this;
        }

        /**
         * @param operations A list of operations that the grant permits. The permitted values are: `Decrypt`, `Encrypt`, `GenerateDataKey`, `GenerateDataKeyWithoutPlaintext`, `ReEncryptFrom`, `ReEncryptTo`, `Sign`, `Verify`, `GetPublicKey`, `CreateGrant`, `RetireGrant`, `DescribeKey`, `GenerateDataKeyPair`, or `GenerateDataKeyPairWithoutPlaintext`.
         * 
         * @return builder
         * 
         */
        public Builder operations(List<String> operations) {
            return operations(Output.of(operations));
        }

        /**
         * @param operations A list of operations that the grant permits. The permitted values are: `Decrypt`, `Encrypt`, `GenerateDataKey`, `GenerateDataKeyWithoutPlaintext`, `ReEncryptFrom`, `ReEncryptTo`, `Sign`, `Verify`, `GetPublicKey`, `CreateGrant`, `RetireGrant`, `DescribeKey`, `GenerateDataKeyPair`, or `GenerateDataKeyPairWithoutPlaintext`.
         * 
         * @return builder
         * 
         */
        public Builder operations(String... operations) {
            return operations(List.of(operations));
        }

        /**
         * @param retireOnDelete -(Defaults to false, Forces new resources) If set to false (the default) the grants will be revoked upon deletion, and if set to true the grants will try to be retired upon deletion. Note that retiring grants requires special permissions, hence why we default to revoking grants.
         * See [RetireGrant](https://docs.aws.amazon.com/kms/latest/APIReference/API_RetireGrant.html) for more information.
         * 
         * @return builder
         * 
         */
        public Builder retireOnDelete(@Nullable Output<Boolean> retireOnDelete) {
            $.retireOnDelete = retireOnDelete;
            return this;
        }

        /**
         * @param retireOnDelete -(Defaults to false, Forces new resources) If set to false (the default) the grants will be revoked upon deletion, and if set to true the grants will try to be retired upon deletion. Note that retiring grants requires special permissions, hence why we default to revoking grants.
         * See [RetireGrant](https://docs.aws.amazon.com/kms/latest/APIReference/API_RetireGrant.html) for more information.
         * 
         * @return builder
         * 
         */
        public Builder retireOnDelete(Boolean retireOnDelete) {
            return retireOnDelete(Output.of(retireOnDelete));
        }

        /**
         * @param retiringPrincipal The principal that is given permission to retire the grant by using RetireGrant operation in ARN format. Note that due to eventual consistency issues around IAM principals, the providers&#39;s state may not always be refreshed to reflect what is true in AWS.
         * 
         * @return builder
         * 
         */
        public Builder retiringPrincipal(@Nullable Output<String> retiringPrincipal) {
            $.retiringPrincipal = retiringPrincipal;
            return this;
        }

        /**
         * @param retiringPrincipal The principal that is given permission to retire the grant by using RetireGrant operation in ARN format. Note that due to eventual consistency issues around IAM principals, the providers&#39;s state may not always be refreshed to reflect what is true in AWS.
         * 
         * @return builder
         * 
         */
        public Builder retiringPrincipal(String retiringPrincipal) {
            return retiringPrincipal(Output.of(retiringPrincipal));
        }

        public GrantState build() {
            return $;
        }
    }

}
