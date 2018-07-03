# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import pulumi
import pulumi.runtime

class Record(pulumi.CustomResource):
    """
    Provides a Route53 record resource.
    """
    def __init__(__self__, __name__, __opts__=None, aliases=None, allow_overwrite=None, failover_routing_policies=None, geolocation_routing_policies=None, health_check_id=None, latency_routing_policies=None, multivalue_answer_routing_policy=None, name=None, records=None, set_identifier=None, ttl=None, type=None, weighted_routing_policies=None, zone_id=None):
        """Create a Record resource with the given unique name, props, and options."""
        if not __name__:
            raise TypeError('Missing resource name argument (for URN creation)')
        if not isinstance(__name__, basestring):
            raise TypeError('Expected resource name to be a string')
        if __opts__ and not isinstance(__opts__, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')

        __props__ = dict()

        if aliases and not isinstance(aliases, list):
            raise TypeError('Expected property aliases to be a list')
        __self__.aliases = aliases
        """
        An alias block. Conflicts with `ttl` & `records`.
        Alias record documented below.
        """
        __props__['aliases'] = aliases

        if allow_overwrite and not isinstance(allow_overwrite, bool):
            raise TypeError('Expected property allow_overwrite to be a bool')
        __self__.allow_overwrite = allow_overwrite
        """
        Allow creation of this record in Terraform to overwrite an existing record, if any. This does not prevent other resources within Terraform or manual Route53 changes from overwriting this record. `true` by default.
        """
        __props__['allowOverwrite'] = allow_overwrite

        if failover_routing_policies and not isinstance(failover_routing_policies, list):
            raise TypeError('Expected property failover_routing_policies to be a list')
        __self__.failover_routing_policies = failover_routing_policies
        """
        A block indicating the routing behavior when associated health check fails. Conflicts with any other routing policy. Documented below.
        """
        __props__['failoverRoutingPolicies'] = failover_routing_policies

        if geolocation_routing_policies and not isinstance(geolocation_routing_policies, list):
            raise TypeError('Expected property geolocation_routing_policies to be a list')
        __self__.geolocation_routing_policies = geolocation_routing_policies
        """
        A block indicating a routing policy based on the geolocation of the requestor. Conflicts with any other routing policy. Documented below.
        """
        __props__['geolocationRoutingPolicies'] = geolocation_routing_policies

        if health_check_id and not isinstance(health_check_id, basestring):
            raise TypeError('Expected property health_check_id to be a basestring')
        __self__.health_check_id = health_check_id
        """
        The health check the record should be associated with.
        """
        __props__['healthCheckId'] = health_check_id

        if latency_routing_policies and not isinstance(latency_routing_policies, list):
            raise TypeError('Expected property latency_routing_policies to be a list')
        __self__.latency_routing_policies = latency_routing_policies
        """
        A block indicating a routing policy based on the latency between the requestor and an AWS region. Conflicts with any other routing policy. Documented below.
        """
        __props__['latencyRoutingPolicies'] = latency_routing_policies

        if multivalue_answer_routing_policy and not isinstance(multivalue_answer_routing_policy, bool):
            raise TypeError('Expected property multivalue_answer_routing_policy to be a bool')
        __self__.multivalue_answer_routing_policy = multivalue_answer_routing_policy
        """
        Set to `true` to indicate a multivalue answer routing policy. Conflicts with any other routing policy.
        """
        __props__['multivalueAnswerRoutingPolicy'] = multivalue_answer_routing_policy

        if name and not isinstance(name, basestring):
            raise TypeError('Expected property name to be a basestring')
        __self__.name = name
        """
        DNS domain name for a CloudFront distribution, S3 bucket, ELB, or another resource record set in this hosted zone.
        """
        __props__['name'] = name

        if records and not isinstance(records, list):
            raise TypeError('Expected property records to be a list')
        __self__.records = records
        """
        A string list of records. To specify a single record value longer than 255 characters such as a TXT record for DKIM, add `\"\"` inside the Terraform configuration string (e.g. `"first255characters\"\"morecharacters"`).
        """
        __props__['records'] = records

        if set_identifier and not isinstance(set_identifier, basestring):
            raise TypeError('Expected property set_identifier to be a basestring')
        __self__.set_identifier = set_identifier
        """
        Unique identifier to differentiate records with routing policies from one another. Required if using `failover`, `geolocation`, `latency`, or `weighted` routing policies documented below.
        """
        __props__['setIdentifier'] = set_identifier

        if ttl and not isinstance(ttl, int):
            raise TypeError('Expected property ttl to be a int')
        __self__.ttl = ttl
        """
        The TTL of the record.
        """
        __props__['ttl'] = ttl

        if not type:
            raise TypeError('Missing required property type')
        elif not isinstance(type, basestring):
            raise TypeError('Expected property type to be a basestring')
        __self__.type = type
        """
        `PRIMARY` or `SECONDARY`. A `PRIMARY` record will be served if its healthcheck is passing, otherwise the `SECONDARY` will be served. See http://docs.aws.amazon.com/Route53/latest/DeveloperGuide/dns-failover-configuring-options.html#dns-failover-failover-rrsets
        """
        __props__['type'] = type

        if weighted_routing_policies and not isinstance(weighted_routing_policies, list):
            raise TypeError('Expected property weighted_routing_policies to be a list')
        __self__.weighted_routing_policies = weighted_routing_policies
        """
        A block indicating a weighted routing policy. Conflicts with any other routing policy. Documented below.
        """
        __props__['weightedRoutingPolicies'] = weighted_routing_policies

        if not zone_id:
            raise TypeError('Missing required property zone_id')
        elif not isinstance(zone_id, basestring):
            raise TypeError('Expected property zone_id to be a basestring')
        __self__.zone_id = zone_id
        """
        Hosted zone ID for a CloudFront distribution, S3 bucket, ELB, or Route 53 hosted zone. See [`resource_elb.zone_id`](/docs/providers/aws/r/elb.html#zone_id) for example.
        """
        __props__['zoneId'] = zone_id

        __self__.fqdn = pulumi.runtime.UNKNOWN
        """
        [FQDN](https://en.wikipedia.org/wiki/Fully_qualified_domain_name) built using the zone domain and `name`.
        """

        super(Record, __self__).__init__(
            'aws:route53/record:Record',
            __name__,
            __props__,
            __opts__)

    def set_outputs(self, outs):
        if 'aliases' in outs:
            self.aliases = outs['aliases']
        if 'allowOverwrite' in outs:
            self.allow_overwrite = outs['allowOverwrite']
        if 'failoverRoutingPolicies' in outs:
            self.failover_routing_policies = outs['failoverRoutingPolicies']
        if 'fqdn' in outs:
            self.fqdn = outs['fqdn']
        if 'geolocationRoutingPolicies' in outs:
            self.geolocation_routing_policies = outs['geolocationRoutingPolicies']
        if 'healthCheckId' in outs:
            self.health_check_id = outs['healthCheckId']
        if 'latencyRoutingPolicies' in outs:
            self.latency_routing_policies = outs['latencyRoutingPolicies']
        if 'multivalueAnswerRoutingPolicy' in outs:
            self.multivalue_answer_routing_policy = outs['multivalueAnswerRoutingPolicy']
        if 'name' in outs:
            self.name = outs['name']
        if 'records' in outs:
            self.records = outs['records']
        if 'setIdentifier' in outs:
            self.set_identifier = outs['setIdentifier']
        if 'ttl' in outs:
            self.ttl = outs['ttl']
        if 'type' in outs:
            self.type = outs['type']
        if 'weightedRoutingPolicies' in outs:
            self.weighted_routing_policies = outs['weightedRoutingPolicies']
        if 'zoneId' in outs:
            self.zone_id = outs['zoneId']