// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.AppMesh.Inputs
{

    public sealed class VirtualServiceSpecProviderGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The virtual node associated with a virtual service.
        /// </summary>
        [Input("virtualNode")]
        public Input<Inputs.VirtualServiceSpecProviderVirtualNodeGetArgs>? VirtualNode { get; set; }

        /// <summary>
        /// The virtual router associated with a virtual service.
        /// </summary>
        [Input("virtualRouter")]
        public Input<Inputs.VirtualServiceSpecProviderVirtualRouterGetArgs>? VirtualRouter { get; set; }

        public VirtualServiceSpecProviderGetArgs()
        {
        }
        public static new VirtualServiceSpecProviderGetArgs Empty => new VirtualServiceSpecProviderGetArgs();
    }
}
