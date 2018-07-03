// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package ec2

import (
	"github.com/pkg/errors"
	"github.com/pulumi/pulumi/sdk/go/pulumi"
)

// Provides a VPC Endpoint Service resource.
// Service consumers can create an _Interface_ [VPC Endpoint](vpc_endpoint.html) to connect to the service.
// 
// ~> **NOTE on VPC Endpoint Services and VPC Endpoint Service Allowed Principals:** Terraform provides
// both a standalone [VPC Endpoint Service Allowed Principal](vpc_endpoint_service_allowed_principal.html) resource
// and a VPC Endpoint Service resource with an `allowed_principals` attribute. Do not use the same principal ARN in both
// a VPC Endpoint Service resource and a VPC Endpoint Service Allowed Principal resource. Doing so will cause a conflict
// and will overwrite the association.
type VpcEndpointService struct {
	s *pulumi.ResourceState
}

// NewVpcEndpointService registers a new resource with the given unique name, arguments, and options.
func NewVpcEndpointService(ctx *pulumi.Context,
	name string, args *VpcEndpointServiceArgs, opts ...pulumi.ResourceOpt) (*VpcEndpointService, error) {
	if args == nil || args.AcceptanceRequired == nil {
		return nil, errors.New("missing required argument 'AcceptanceRequired'")
	}
	if args == nil || args.NetworkLoadBalancerArns == nil {
		return nil, errors.New("missing required argument 'NetworkLoadBalancerArns'")
	}
	inputs := make(map[string]interface{})
	if args == nil {
		inputs["acceptanceRequired"] = nil
		inputs["allowedPrincipals"] = nil
		inputs["networkLoadBalancerArns"] = nil
	} else {
		inputs["acceptanceRequired"] = args.AcceptanceRequired
		inputs["allowedPrincipals"] = args.AllowedPrincipals
		inputs["networkLoadBalancerArns"] = args.NetworkLoadBalancerArns
	}
	inputs["availabilityZones"] = nil
	inputs["baseEndpointDnsNames"] = nil
	inputs["privateDnsName"] = nil
	inputs["serviceName"] = nil
	inputs["serviceType"] = nil
	inputs["state"] = nil
	s, err := ctx.RegisterResource("aws:ec2/vpcEndpointService:VpcEndpointService", name, true, inputs, opts...)
	if err != nil {
		return nil, err
	}
	return &VpcEndpointService{s: s}, nil
}

// GetVpcEndpointService gets an existing VpcEndpointService resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetVpcEndpointService(ctx *pulumi.Context,
	name string, id pulumi.ID, state *VpcEndpointServiceState, opts ...pulumi.ResourceOpt) (*VpcEndpointService, error) {
	inputs := make(map[string]interface{})
	if state != nil {
		inputs["acceptanceRequired"] = state.AcceptanceRequired
		inputs["allowedPrincipals"] = state.AllowedPrincipals
		inputs["availabilityZones"] = state.AvailabilityZones
		inputs["baseEndpointDnsNames"] = state.BaseEndpointDnsNames
		inputs["networkLoadBalancerArns"] = state.NetworkLoadBalancerArns
		inputs["privateDnsName"] = state.PrivateDnsName
		inputs["serviceName"] = state.ServiceName
		inputs["serviceType"] = state.ServiceType
		inputs["state"] = state.State
	}
	s, err := ctx.ReadResource("aws:ec2/vpcEndpointService:VpcEndpointService", name, id, inputs, opts...)
	if err != nil {
		return nil, err
	}
	return &VpcEndpointService{s: s}, nil
}

// URN is this resource's unique name assigned by Pulumi.
func (r *VpcEndpointService) URN() *pulumi.URNOutput {
	return r.s.URN
}

// ID is this resource's unique identifier assigned by its provider.
func (r *VpcEndpointService) ID() *pulumi.IDOutput {
	return r.s.ID
}

// Whether or not VPC endpoint connection requests to the service must be accepted by the service owner - `true` or `false`.
func (r *VpcEndpointService) AcceptanceRequired() *pulumi.BoolOutput {
	return (*pulumi.BoolOutput)(r.s.State["acceptanceRequired"])
}

// The ARNs of one or more principals allowed to discover the endpoint service.
func (r *VpcEndpointService) AllowedPrincipals() *pulumi.ArrayOutput {
	return (*pulumi.ArrayOutput)(r.s.State["allowedPrincipals"])
}

// The Availability Zones in which the service is available.
func (r *VpcEndpointService) AvailabilityZones() *pulumi.ArrayOutput {
	return (*pulumi.ArrayOutput)(r.s.State["availabilityZones"])
}

// The DNS names for the service.
func (r *VpcEndpointService) BaseEndpointDnsNames() *pulumi.ArrayOutput {
	return (*pulumi.ArrayOutput)(r.s.State["baseEndpointDnsNames"])
}

// The ARNs of one or more Network Load Balancers for the endpoint service.
func (r *VpcEndpointService) NetworkLoadBalancerArns() *pulumi.ArrayOutput {
	return (*pulumi.ArrayOutput)(r.s.State["networkLoadBalancerArns"])
}

// The private DNS name for the service.
func (r *VpcEndpointService) PrivateDnsName() *pulumi.StringOutput {
	return (*pulumi.StringOutput)(r.s.State["privateDnsName"])
}

// The service name.
func (r *VpcEndpointService) ServiceName() *pulumi.StringOutput {
	return (*pulumi.StringOutput)(r.s.State["serviceName"])
}

// The service type, `Gateway` or `Interface`.
func (r *VpcEndpointService) ServiceType() *pulumi.StringOutput {
	return (*pulumi.StringOutput)(r.s.State["serviceType"])
}

// The state of the VPC endpoint service.
func (r *VpcEndpointService) State() *pulumi.StringOutput {
	return (*pulumi.StringOutput)(r.s.State["state"])
}

// Input properties used for looking up and filtering VpcEndpointService resources.
type VpcEndpointServiceState struct {
	// Whether or not VPC endpoint connection requests to the service must be accepted by the service owner - `true` or `false`.
	AcceptanceRequired interface{}
	// The ARNs of one or more principals allowed to discover the endpoint service.
	AllowedPrincipals interface{}
	// The Availability Zones in which the service is available.
	AvailabilityZones interface{}
	// The DNS names for the service.
	BaseEndpointDnsNames interface{}
	// The ARNs of one or more Network Load Balancers for the endpoint service.
	NetworkLoadBalancerArns interface{}
	// The private DNS name for the service.
	PrivateDnsName interface{}
	// The service name.
	ServiceName interface{}
	// The service type, `Gateway` or `Interface`.
	ServiceType interface{}
	// The state of the VPC endpoint service.
	State interface{}
}

// The set of arguments for constructing a VpcEndpointService resource.
type VpcEndpointServiceArgs struct {
	// Whether or not VPC endpoint connection requests to the service must be accepted by the service owner - `true` or `false`.
	AcceptanceRequired interface{}
	// The ARNs of one or more principals allowed to discover the endpoint service.
	AllowedPrincipals interface{}
	// The ARNs of one or more Network Load Balancers for the endpoint service.
	NetworkLoadBalancerArns interface{}
}