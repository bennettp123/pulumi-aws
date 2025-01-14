// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.codedeploy.outputs;

import com.pulumi.aws.codedeploy.outputs.DeploymentGroupBlueGreenDeploymentConfigDeploymentReadyOption;
import com.pulumi.aws.codedeploy.outputs.DeploymentGroupBlueGreenDeploymentConfigGreenFleetProvisioningOption;
import com.pulumi.aws.codedeploy.outputs.DeploymentGroupBlueGreenDeploymentConfigTerminateBlueInstancesOnDeploymentSuccess;
import com.pulumi.core.annotations.CustomType;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class DeploymentGroupBlueGreenDeploymentConfig {
    /**
     * @return Information about the action to take when newly provisioned instances are ready to receive traffic in a blue/green deployment (documented below).
     * 
     */
    private final @Nullable DeploymentGroupBlueGreenDeploymentConfigDeploymentReadyOption deploymentReadyOption;
    /**
     * @return Information about how instances are provisioned for a replacement environment in a blue/green deployment (documented below).
     * 
     */
    private final @Nullable DeploymentGroupBlueGreenDeploymentConfigGreenFleetProvisioningOption greenFleetProvisioningOption;
    /**
     * @return Information about whether to terminate instances in the original fleet during a blue/green deployment (documented below).
     * 
     */
    private final @Nullable DeploymentGroupBlueGreenDeploymentConfigTerminateBlueInstancesOnDeploymentSuccess terminateBlueInstancesOnDeploymentSuccess;

    @CustomType.Constructor
    private DeploymentGroupBlueGreenDeploymentConfig(
        @CustomType.Parameter("deploymentReadyOption") @Nullable DeploymentGroupBlueGreenDeploymentConfigDeploymentReadyOption deploymentReadyOption,
        @CustomType.Parameter("greenFleetProvisioningOption") @Nullable DeploymentGroupBlueGreenDeploymentConfigGreenFleetProvisioningOption greenFleetProvisioningOption,
        @CustomType.Parameter("terminateBlueInstancesOnDeploymentSuccess") @Nullable DeploymentGroupBlueGreenDeploymentConfigTerminateBlueInstancesOnDeploymentSuccess terminateBlueInstancesOnDeploymentSuccess) {
        this.deploymentReadyOption = deploymentReadyOption;
        this.greenFleetProvisioningOption = greenFleetProvisioningOption;
        this.terminateBlueInstancesOnDeploymentSuccess = terminateBlueInstancesOnDeploymentSuccess;
    }

    /**
     * @return Information about the action to take when newly provisioned instances are ready to receive traffic in a blue/green deployment (documented below).
     * 
     */
    public Optional<DeploymentGroupBlueGreenDeploymentConfigDeploymentReadyOption> deploymentReadyOption() {
        return Optional.ofNullable(this.deploymentReadyOption);
    }
    /**
     * @return Information about how instances are provisioned for a replacement environment in a blue/green deployment (documented below).
     * 
     */
    public Optional<DeploymentGroupBlueGreenDeploymentConfigGreenFleetProvisioningOption> greenFleetProvisioningOption() {
        return Optional.ofNullable(this.greenFleetProvisioningOption);
    }
    /**
     * @return Information about whether to terminate instances in the original fleet during a blue/green deployment (documented below).
     * 
     */
    public Optional<DeploymentGroupBlueGreenDeploymentConfigTerminateBlueInstancesOnDeploymentSuccess> terminateBlueInstancesOnDeploymentSuccess() {
        return Optional.ofNullable(this.terminateBlueInstancesOnDeploymentSuccess);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DeploymentGroupBlueGreenDeploymentConfig defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable DeploymentGroupBlueGreenDeploymentConfigDeploymentReadyOption deploymentReadyOption;
        private @Nullable DeploymentGroupBlueGreenDeploymentConfigGreenFleetProvisioningOption greenFleetProvisioningOption;
        private @Nullable DeploymentGroupBlueGreenDeploymentConfigTerminateBlueInstancesOnDeploymentSuccess terminateBlueInstancesOnDeploymentSuccess;

        public Builder() {
    	      // Empty
        }

        public Builder(DeploymentGroupBlueGreenDeploymentConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.deploymentReadyOption = defaults.deploymentReadyOption;
    	      this.greenFleetProvisioningOption = defaults.greenFleetProvisioningOption;
    	      this.terminateBlueInstancesOnDeploymentSuccess = defaults.terminateBlueInstancesOnDeploymentSuccess;
        }

        public Builder deploymentReadyOption(@Nullable DeploymentGroupBlueGreenDeploymentConfigDeploymentReadyOption deploymentReadyOption) {
            this.deploymentReadyOption = deploymentReadyOption;
            return this;
        }
        public Builder greenFleetProvisioningOption(@Nullable DeploymentGroupBlueGreenDeploymentConfigGreenFleetProvisioningOption greenFleetProvisioningOption) {
            this.greenFleetProvisioningOption = greenFleetProvisioningOption;
            return this;
        }
        public Builder terminateBlueInstancesOnDeploymentSuccess(@Nullable DeploymentGroupBlueGreenDeploymentConfigTerminateBlueInstancesOnDeploymentSuccess terminateBlueInstancesOnDeploymentSuccess) {
            this.terminateBlueInstancesOnDeploymentSuccess = terminateBlueInstancesOnDeploymentSuccess;
            return this;
        }        public DeploymentGroupBlueGreenDeploymentConfig build() {
            return new DeploymentGroupBlueGreenDeploymentConfig(deploymentReadyOption, greenFleetProvisioningOption, terminateBlueInstancesOnDeploymentSuccess);
        }
    }
}
