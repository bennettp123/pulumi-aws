// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.Glue.Outputs
{

    [OutputType]
    public sealed class CrawlerLineageConfiguration
    {
        /// <summary>
        /// Specifies whether data lineage is enabled for the crawler. Valid values are: `ENABLE` and `DISABLE`. Default value is `Disable`.
        /// </summary>
        public readonly string? CrawlerLineageSettings;

        [OutputConstructor]
        private CrawlerLineageConfiguration(string? crawlerLineageSettings)
        {
            CrawlerLineageSettings = crawlerLineageSettings;
        }
    }
}