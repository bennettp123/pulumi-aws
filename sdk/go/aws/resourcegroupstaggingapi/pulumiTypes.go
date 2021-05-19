// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package resourcegroupstaggingapi

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

type GetResourcesResourceTagMappingList struct {
	// List of objects with information that shows whether a resource is compliant with the effective tag policy, including details on any noncompliant tag keys.
	ComplianceDetails []GetResourcesResourceTagMappingListComplianceDetail `pulumi:"complianceDetails"`
	// ARN of the resource.
	ResourceArn string `pulumi:"resourceArn"`
	// Map of tags assigned to the resource.
	Tags map[string]string `pulumi:"tags"`
}

// GetResourcesResourceTagMappingListInput is an input type that accepts GetResourcesResourceTagMappingListArgs and GetResourcesResourceTagMappingListOutput values.
// You can construct a concrete instance of `GetResourcesResourceTagMappingListInput` via:
//
//          GetResourcesResourceTagMappingListArgs{...}
type GetResourcesResourceTagMappingListInput interface {
	pulumi.Input

	ToGetResourcesResourceTagMappingListOutput() GetResourcesResourceTagMappingListOutput
	ToGetResourcesResourceTagMappingListOutputWithContext(context.Context) GetResourcesResourceTagMappingListOutput
}

type GetResourcesResourceTagMappingListArgs struct {
	// List of objects with information that shows whether a resource is compliant with the effective tag policy, including details on any noncompliant tag keys.
	ComplianceDetails GetResourcesResourceTagMappingListComplianceDetailArrayInput `pulumi:"complianceDetails"`
	// ARN of the resource.
	ResourceArn pulumi.StringInput `pulumi:"resourceArn"`
	// Map of tags assigned to the resource.
	Tags pulumi.StringMapInput `pulumi:"tags"`
}

func (GetResourcesResourceTagMappingListArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*GetResourcesResourceTagMappingList)(nil)).Elem()
}

func (i GetResourcesResourceTagMappingListArgs) ToGetResourcesResourceTagMappingListOutput() GetResourcesResourceTagMappingListOutput {
	return i.ToGetResourcesResourceTagMappingListOutputWithContext(context.Background())
}

func (i GetResourcesResourceTagMappingListArgs) ToGetResourcesResourceTagMappingListOutputWithContext(ctx context.Context) GetResourcesResourceTagMappingListOutput {
	return pulumi.ToOutputWithContext(ctx, i).(GetResourcesResourceTagMappingListOutput)
}

// GetResourcesResourceTagMappingListArrayInput is an input type that accepts GetResourcesResourceTagMappingListArray and GetResourcesResourceTagMappingListArrayOutput values.
// You can construct a concrete instance of `GetResourcesResourceTagMappingListArrayInput` via:
//
//          GetResourcesResourceTagMappingListArray{ GetResourcesResourceTagMappingListArgs{...} }
type GetResourcesResourceTagMappingListArrayInput interface {
	pulumi.Input

	ToGetResourcesResourceTagMappingListArrayOutput() GetResourcesResourceTagMappingListArrayOutput
	ToGetResourcesResourceTagMappingListArrayOutputWithContext(context.Context) GetResourcesResourceTagMappingListArrayOutput
}

type GetResourcesResourceTagMappingListArray []GetResourcesResourceTagMappingListInput

func (GetResourcesResourceTagMappingListArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]GetResourcesResourceTagMappingList)(nil)).Elem()
}

func (i GetResourcesResourceTagMappingListArray) ToGetResourcesResourceTagMappingListArrayOutput() GetResourcesResourceTagMappingListArrayOutput {
	return i.ToGetResourcesResourceTagMappingListArrayOutputWithContext(context.Background())
}

func (i GetResourcesResourceTagMappingListArray) ToGetResourcesResourceTagMappingListArrayOutputWithContext(ctx context.Context) GetResourcesResourceTagMappingListArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(GetResourcesResourceTagMappingListArrayOutput)
}

type GetResourcesResourceTagMappingListOutput struct{ *pulumi.OutputState }

func (GetResourcesResourceTagMappingListOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GetResourcesResourceTagMappingList)(nil)).Elem()
}

func (o GetResourcesResourceTagMappingListOutput) ToGetResourcesResourceTagMappingListOutput() GetResourcesResourceTagMappingListOutput {
	return o
}

func (o GetResourcesResourceTagMappingListOutput) ToGetResourcesResourceTagMappingListOutputWithContext(ctx context.Context) GetResourcesResourceTagMappingListOutput {
	return o
}

// List of objects with information that shows whether a resource is compliant with the effective tag policy, including details on any noncompliant tag keys.
func (o GetResourcesResourceTagMappingListOutput) ComplianceDetails() GetResourcesResourceTagMappingListComplianceDetailArrayOutput {
	return o.ApplyT(func(v GetResourcesResourceTagMappingList) []GetResourcesResourceTagMappingListComplianceDetail {
		return v.ComplianceDetails
	}).(GetResourcesResourceTagMappingListComplianceDetailArrayOutput)
}

// ARN of the resource.
func (o GetResourcesResourceTagMappingListOutput) ResourceArn() pulumi.StringOutput {
	return o.ApplyT(func(v GetResourcesResourceTagMappingList) string { return v.ResourceArn }).(pulumi.StringOutput)
}

// Map of tags assigned to the resource.
func (o GetResourcesResourceTagMappingListOutput) Tags() pulumi.StringMapOutput {
	return o.ApplyT(func(v GetResourcesResourceTagMappingList) map[string]string { return v.Tags }).(pulumi.StringMapOutput)
}

type GetResourcesResourceTagMappingListArrayOutput struct{ *pulumi.OutputState }

func (GetResourcesResourceTagMappingListArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]GetResourcesResourceTagMappingList)(nil)).Elem()
}

func (o GetResourcesResourceTagMappingListArrayOutput) ToGetResourcesResourceTagMappingListArrayOutput() GetResourcesResourceTagMappingListArrayOutput {
	return o
}

func (o GetResourcesResourceTagMappingListArrayOutput) ToGetResourcesResourceTagMappingListArrayOutputWithContext(ctx context.Context) GetResourcesResourceTagMappingListArrayOutput {
	return o
}

func (o GetResourcesResourceTagMappingListArrayOutput) Index(i pulumi.IntInput) GetResourcesResourceTagMappingListOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) GetResourcesResourceTagMappingList {
		return vs[0].([]GetResourcesResourceTagMappingList)[vs[1].(int)]
	}).(GetResourcesResourceTagMappingListOutput)
}

type GetResourcesResourceTagMappingListComplianceDetail struct {
	// Whether the resource is compliant.
	// * ` keysWithNoncompliantValues  ` - Set of tag keys with non-compliant tag values.
	// * ` nonCompliantKeys  ` - Set of non-compliant tag keys.
	ComplianceStatus           bool     `pulumi:"complianceStatus"`
	KeysWithNoncompliantValues []string `pulumi:"keysWithNoncompliantValues"`
	NonCompliantKeys           []string `pulumi:"nonCompliantKeys"`
}

// GetResourcesResourceTagMappingListComplianceDetailInput is an input type that accepts GetResourcesResourceTagMappingListComplianceDetailArgs and GetResourcesResourceTagMappingListComplianceDetailOutput values.
// You can construct a concrete instance of `GetResourcesResourceTagMappingListComplianceDetailInput` via:
//
//          GetResourcesResourceTagMappingListComplianceDetailArgs{...}
type GetResourcesResourceTagMappingListComplianceDetailInput interface {
	pulumi.Input

	ToGetResourcesResourceTagMappingListComplianceDetailOutput() GetResourcesResourceTagMappingListComplianceDetailOutput
	ToGetResourcesResourceTagMappingListComplianceDetailOutputWithContext(context.Context) GetResourcesResourceTagMappingListComplianceDetailOutput
}

type GetResourcesResourceTagMappingListComplianceDetailArgs struct {
	// Whether the resource is compliant.
	// * ` keysWithNoncompliantValues  ` - Set of tag keys with non-compliant tag values.
	// * ` nonCompliantKeys  ` - Set of non-compliant tag keys.
	ComplianceStatus           pulumi.BoolInput        `pulumi:"complianceStatus"`
	KeysWithNoncompliantValues pulumi.StringArrayInput `pulumi:"keysWithNoncompliantValues"`
	NonCompliantKeys           pulumi.StringArrayInput `pulumi:"nonCompliantKeys"`
}

func (GetResourcesResourceTagMappingListComplianceDetailArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*GetResourcesResourceTagMappingListComplianceDetail)(nil)).Elem()
}

func (i GetResourcesResourceTagMappingListComplianceDetailArgs) ToGetResourcesResourceTagMappingListComplianceDetailOutput() GetResourcesResourceTagMappingListComplianceDetailOutput {
	return i.ToGetResourcesResourceTagMappingListComplianceDetailOutputWithContext(context.Background())
}

func (i GetResourcesResourceTagMappingListComplianceDetailArgs) ToGetResourcesResourceTagMappingListComplianceDetailOutputWithContext(ctx context.Context) GetResourcesResourceTagMappingListComplianceDetailOutput {
	return pulumi.ToOutputWithContext(ctx, i).(GetResourcesResourceTagMappingListComplianceDetailOutput)
}

// GetResourcesResourceTagMappingListComplianceDetailArrayInput is an input type that accepts GetResourcesResourceTagMappingListComplianceDetailArray and GetResourcesResourceTagMappingListComplianceDetailArrayOutput values.
// You can construct a concrete instance of `GetResourcesResourceTagMappingListComplianceDetailArrayInput` via:
//
//          GetResourcesResourceTagMappingListComplianceDetailArray{ GetResourcesResourceTagMappingListComplianceDetailArgs{...} }
type GetResourcesResourceTagMappingListComplianceDetailArrayInput interface {
	pulumi.Input

	ToGetResourcesResourceTagMappingListComplianceDetailArrayOutput() GetResourcesResourceTagMappingListComplianceDetailArrayOutput
	ToGetResourcesResourceTagMappingListComplianceDetailArrayOutputWithContext(context.Context) GetResourcesResourceTagMappingListComplianceDetailArrayOutput
}

type GetResourcesResourceTagMappingListComplianceDetailArray []GetResourcesResourceTagMappingListComplianceDetailInput

func (GetResourcesResourceTagMappingListComplianceDetailArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]GetResourcesResourceTagMappingListComplianceDetail)(nil)).Elem()
}

func (i GetResourcesResourceTagMappingListComplianceDetailArray) ToGetResourcesResourceTagMappingListComplianceDetailArrayOutput() GetResourcesResourceTagMappingListComplianceDetailArrayOutput {
	return i.ToGetResourcesResourceTagMappingListComplianceDetailArrayOutputWithContext(context.Background())
}

func (i GetResourcesResourceTagMappingListComplianceDetailArray) ToGetResourcesResourceTagMappingListComplianceDetailArrayOutputWithContext(ctx context.Context) GetResourcesResourceTagMappingListComplianceDetailArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(GetResourcesResourceTagMappingListComplianceDetailArrayOutput)
}

type GetResourcesResourceTagMappingListComplianceDetailOutput struct{ *pulumi.OutputState }

func (GetResourcesResourceTagMappingListComplianceDetailOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GetResourcesResourceTagMappingListComplianceDetail)(nil)).Elem()
}

func (o GetResourcesResourceTagMappingListComplianceDetailOutput) ToGetResourcesResourceTagMappingListComplianceDetailOutput() GetResourcesResourceTagMappingListComplianceDetailOutput {
	return o
}

func (o GetResourcesResourceTagMappingListComplianceDetailOutput) ToGetResourcesResourceTagMappingListComplianceDetailOutputWithContext(ctx context.Context) GetResourcesResourceTagMappingListComplianceDetailOutput {
	return o
}

// Whether the resource is compliant.
// * ` keysWithNoncompliantValues  ` - Set of tag keys with non-compliant tag values.
// * ` nonCompliantKeys  ` - Set of non-compliant tag keys.
func (o GetResourcesResourceTagMappingListComplianceDetailOutput) ComplianceStatus() pulumi.BoolOutput {
	return o.ApplyT(func(v GetResourcesResourceTagMappingListComplianceDetail) bool { return v.ComplianceStatus }).(pulumi.BoolOutput)
}

func (o GetResourcesResourceTagMappingListComplianceDetailOutput) KeysWithNoncompliantValues() pulumi.StringArrayOutput {
	return o.ApplyT(func(v GetResourcesResourceTagMappingListComplianceDetail) []string {
		return v.KeysWithNoncompliantValues
	}).(pulumi.StringArrayOutput)
}

func (o GetResourcesResourceTagMappingListComplianceDetailOutput) NonCompliantKeys() pulumi.StringArrayOutput {
	return o.ApplyT(func(v GetResourcesResourceTagMappingListComplianceDetail) []string { return v.NonCompliantKeys }).(pulumi.StringArrayOutput)
}

type GetResourcesResourceTagMappingListComplianceDetailArrayOutput struct{ *pulumi.OutputState }

func (GetResourcesResourceTagMappingListComplianceDetailArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]GetResourcesResourceTagMappingListComplianceDetail)(nil)).Elem()
}

func (o GetResourcesResourceTagMappingListComplianceDetailArrayOutput) ToGetResourcesResourceTagMappingListComplianceDetailArrayOutput() GetResourcesResourceTagMappingListComplianceDetailArrayOutput {
	return o
}

func (o GetResourcesResourceTagMappingListComplianceDetailArrayOutput) ToGetResourcesResourceTagMappingListComplianceDetailArrayOutputWithContext(ctx context.Context) GetResourcesResourceTagMappingListComplianceDetailArrayOutput {
	return o
}

func (o GetResourcesResourceTagMappingListComplianceDetailArrayOutput) Index(i pulumi.IntInput) GetResourcesResourceTagMappingListComplianceDetailOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) GetResourcesResourceTagMappingListComplianceDetail {
		return vs[0].([]GetResourcesResourceTagMappingListComplianceDetail)[vs[1].(int)]
	}).(GetResourcesResourceTagMappingListComplianceDetailOutput)
}

type GetResourcesTagFilter struct {
	// One part of a key-value pair that makes up a tag.
	Key string `pulumi:"key"`
	// The optional part of a key-value pair that make up a tag.
	Values []string `pulumi:"values"`
}

// GetResourcesTagFilterInput is an input type that accepts GetResourcesTagFilterArgs and GetResourcesTagFilterOutput values.
// You can construct a concrete instance of `GetResourcesTagFilterInput` via:
//
//          GetResourcesTagFilterArgs{...}
type GetResourcesTagFilterInput interface {
	pulumi.Input

	ToGetResourcesTagFilterOutput() GetResourcesTagFilterOutput
	ToGetResourcesTagFilterOutputWithContext(context.Context) GetResourcesTagFilterOutput
}

type GetResourcesTagFilterArgs struct {
	// One part of a key-value pair that makes up a tag.
	Key pulumi.StringInput `pulumi:"key"`
	// The optional part of a key-value pair that make up a tag.
	Values pulumi.StringArrayInput `pulumi:"values"`
}

func (GetResourcesTagFilterArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*GetResourcesTagFilter)(nil)).Elem()
}

func (i GetResourcesTagFilterArgs) ToGetResourcesTagFilterOutput() GetResourcesTagFilterOutput {
	return i.ToGetResourcesTagFilterOutputWithContext(context.Background())
}

func (i GetResourcesTagFilterArgs) ToGetResourcesTagFilterOutputWithContext(ctx context.Context) GetResourcesTagFilterOutput {
	return pulumi.ToOutputWithContext(ctx, i).(GetResourcesTagFilterOutput)
}

// GetResourcesTagFilterArrayInput is an input type that accepts GetResourcesTagFilterArray and GetResourcesTagFilterArrayOutput values.
// You can construct a concrete instance of `GetResourcesTagFilterArrayInput` via:
//
//          GetResourcesTagFilterArray{ GetResourcesTagFilterArgs{...} }
type GetResourcesTagFilterArrayInput interface {
	pulumi.Input

	ToGetResourcesTagFilterArrayOutput() GetResourcesTagFilterArrayOutput
	ToGetResourcesTagFilterArrayOutputWithContext(context.Context) GetResourcesTagFilterArrayOutput
}

type GetResourcesTagFilterArray []GetResourcesTagFilterInput

func (GetResourcesTagFilterArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]GetResourcesTagFilter)(nil)).Elem()
}

func (i GetResourcesTagFilterArray) ToGetResourcesTagFilterArrayOutput() GetResourcesTagFilterArrayOutput {
	return i.ToGetResourcesTagFilterArrayOutputWithContext(context.Background())
}

func (i GetResourcesTagFilterArray) ToGetResourcesTagFilterArrayOutputWithContext(ctx context.Context) GetResourcesTagFilterArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(GetResourcesTagFilterArrayOutput)
}

type GetResourcesTagFilterOutput struct{ *pulumi.OutputState }

func (GetResourcesTagFilterOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GetResourcesTagFilter)(nil)).Elem()
}

func (o GetResourcesTagFilterOutput) ToGetResourcesTagFilterOutput() GetResourcesTagFilterOutput {
	return o
}

func (o GetResourcesTagFilterOutput) ToGetResourcesTagFilterOutputWithContext(ctx context.Context) GetResourcesTagFilterOutput {
	return o
}

// One part of a key-value pair that makes up a tag.
func (o GetResourcesTagFilterOutput) Key() pulumi.StringOutput {
	return o.ApplyT(func(v GetResourcesTagFilter) string { return v.Key }).(pulumi.StringOutput)
}

// The optional part of a key-value pair that make up a tag.
func (o GetResourcesTagFilterOutput) Values() pulumi.StringArrayOutput {
	return o.ApplyT(func(v GetResourcesTagFilter) []string { return v.Values }).(pulumi.StringArrayOutput)
}

type GetResourcesTagFilterArrayOutput struct{ *pulumi.OutputState }

func (GetResourcesTagFilterArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]GetResourcesTagFilter)(nil)).Elem()
}

func (o GetResourcesTagFilterArrayOutput) ToGetResourcesTagFilterArrayOutput() GetResourcesTagFilterArrayOutput {
	return o
}

func (o GetResourcesTagFilterArrayOutput) ToGetResourcesTagFilterArrayOutputWithContext(ctx context.Context) GetResourcesTagFilterArrayOutput {
	return o
}

func (o GetResourcesTagFilterArrayOutput) Index(i pulumi.IntInput) GetResourcesTagFilterOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) GetResourcesTagFilter {
		return vs[0].([]GetResourcesTagFilter)[vs[1].(int)]
	}).(GetResourcesTagFilterOutput)
}

func init() {
	pulumi.RegisterOutputType(GetResourcesResourceTagMappingListOutput{})
	pulumi.RegisterOutputType(GetResourcesResourceTagMappingListArrayOutput{})
	pulumi.RegisterOutputType(GetResourcesResourceTagMappingListComplianceDetailOutput{})
	pulumi.RegisterOutputType(GetResourcesResourceTagMappingListComplianceDetailArrayOutput{})
	pulumi.RegisterOutputType(GetResourcesTagFilterOutput{})
	pulumi.RegisterOutputType(GetResourcesTagFilterArrayOutput{})
}