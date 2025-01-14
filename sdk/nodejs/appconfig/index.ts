// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

// Export members:
export * from "./application";
export * from "./configurationProfile";
export * from "./deployment";
export * from "./deploymentStrategy";
export * from "./environment";
export * from "./eventIntegration";
export * from "./hostedConfigurationVersion";

// Import resources to register:
import { Application } from "./application";
import { ConfigurationProfile } from "./configurationProfile";
import { Deployment } from "./deployment";
import { DeploymentStrategy } from "./deploymentStrategy";
import { Environment } from "./environment";
import { EventIntegration } from "./eventIntegration";
import { HostedConfigurationVersion } from "./hostedConfigurationVersion";

const _module = {
    version: utilities.getVersion(),
    construct: (name: string, type: string, urn: string): pulumi.Resource => {
        switch (type) {
            case "aws:appconfig/application:Application":
                return new Application(name, <any>undefined, { urn })
            case "aws:appconfig/configurationProfile:ConfigurationProfile":
                return new ConfigurationProfile(name, <any>undefined, { urn })
            case "aws:appconfig/deployment:Deployment":
                return new Deployment(name, <any>undefined, { urn })
            case "aws:appconfig/deploymentStrategy:DeploymentStrategy":
                return new DeploymentStrategy(name, <any>undefined, { urn })
            case "aws:appconfig/environment:Environment":
                return new Environment(name, <any>undefined, { urn })
            case "aws:appconfig/eventIntegration:EventIntegration":
                return new EventIntegration(name, <any>undefined, { urn })
            case "aws:appconfig/hostedConfigurationVersion:HostedConfigurationVersion":
                return new HostedConfigurationVersion(name, <any>undefined, { urn })
            default:
                throw new Error(`unknown resource type ${type}`);
        }
    },
};
pulumi.runtime.registerResourceModule("aws", "appconfig/application", _module)
pulumi.runtime.registerResourceModule("aws", "appconfig/configurationProfile", _module)
pulumi.runtime.registerResourceModule("aws", "appconfig/deployment", _module)
pulumi.runtime.registerResourceModule("aws", "appconfig/deploymentStrategy", _module)
pulumi.runtime.registerResourceModule("aws", "appconfig/environment", _module)
pulumi.runtime.registerResourceModule("aws", "appconfig/eventIntegration", _module)
pulumi.runtime.registerResourceModule("aws", "appconfig/hostedConfigurationVersion", _module)
