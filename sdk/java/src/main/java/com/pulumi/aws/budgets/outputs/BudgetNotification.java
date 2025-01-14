// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.budgets.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Double;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@CustomType
public final class BudgetNotification {
    /**
     * @return (Required) Comparison operator to use to evaluate the condition. Can be `LESS_THAN`, `EQUAL_TO` or `GREATER_THAN`.
     * 
     */
    private final String comparisonOperator;
    /**
     * @return (Required) What kind of budget value to notify on. Can be `ACTUAL` or `FORECASTED`
     * 
     */
    private final String notificationType;
    /**
     * @return (Optional) E-Mail addresses to notify. Either this or `subscriber_sns_topic_arns` is required.
     * 
     */
    private final @Nullable List<String> subscriberEmailAddresses;
    /**
     * @return (Optional) SNS topics to notify. Either this or `subscriber_email_addresses` is required.
     * 
     */
    private final @Nullable List<String> subscriberSnsTopicArns;
    /**
     * @return (Required) Threshold when the notification should be sent.
     * 
     */
    private final Double threshold;
    /**
     * @return (Required) What kind of threshold is defined. Can be `PERCENTAGE` OR `ABSOLUTE_VALUE`.
     * 
     */
    private final String thresholdType;

    @CustomType.Constructor
    private BudgetNotification(
        @CustomType.Parameter("comparisonOperator") String comparisonOperator,
        @CustomType.Parameter("notificationType") String notificationType,
        @CustomType.Parameter("subscriberEmailAddresses") @Nullable List<String> subscriberEmailAddresses,
        @CustomType.Parameter("subscriberSnsTopicArns") @Nullable List<String> subscriberSnsTopicArns,
        @CustomType.Parameter("threshold") Double threshold,
        @CustomType.Parameter("thresholdType") String thresholdType) {
        this.comparisonOperator = comparisonOperator;
        this.notificationType = notificationType;
        this.subscriberEmailAddresses = subscriberEmailAddresses;
        this.subscriberSnsTopicArns = subscriberSnsTopicArns;
        this.threshold = threshold;
        this.thresholdType = thresholdType;
    }

    /**
     * @return (Required) Comparison operator to use to evaluate the condition. Can be `LESS_THAN`, `EQUAL_TO` or `GREATER_THAN`.
     * 
     */
    public String comparisonOperator() {
        return this.comparisonOperator;
    }
    /**
     * @return (Required) What kind of budget value to notify on. Can be `ACTUAL` or `FORECASTED`
     * 
     */
    public String notificationType() {
        return this.notificationType;
    }
    /**
     * @return (Optional) E-Mail addresses to notify. Either this or `subscriber_sns_topic_arns` is required.
     * 
     */
    public List<String> subscriberEmailAddresses() {
        return this.subscriberEmailAddresses == null ? List.of() : this.subscriberEmailAddresses;
    }
    /**
     * @return (Optional) SNS topics to notify. Either this or `subscriber_email_addresses` is required.
     * 
     */
    public List<String> subscriberSnsTopicArns() {
        return this.subscriberSnsTopicArns == null ? List.of() : this.subscriberSnsTopicArns;
    }
    /**
     * @return (Required) Threshold when the notification should be sent.
     * 
     */
    public Double threshold() {
        return this.threshold;
    }
    /**
     * @return (Required) What kind of threshold is defined. Can be `PERCENTAGE` OR `ABSOLUTE_VALUE`.
     * 
     */
    public String thresholdType() {
        return this.thresholdType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BudgetNotification defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String comparisonOperator;
        private String notificationType;
        private @Nullable List<String> subscriberEmailAddresses;
        private @Nullable List<String> subscriberSnsTopicArns;
        private Double threshold;
        private String thresholdType;

        public Builder() {
    	      // Empty
        }

        public Builder(BudgetNotification defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.comparisonOperator = defaults.comparisonOperator;
    	      this.notificationType = defaults.notificationType;
    	      this.subscriberEmailAddresses = defaults.subscriberEmailAddresses;
    	      this.subscriberSnsTopicArns = defaults.subscriberSnsTopicArns;
    	      this.threshold = defaults.threshold;
    	      this.thresholdType = defaults.thresholdType;
        }

        public Builder comparisonOperator(String comparisonOperator) {
            this.comparisonOperator = Objects.requireNonNull(comparisonOperator);
            return this;
        }
        public Builder notificationType(String notificationType) {
            this.notificationType = Objects.requireNonNull(notificationType);
            return this;
        }
        public Builder subscriberEmailAddresses(@Nullable List<String> subscriberEmailAddresses) {
            this.subscriberEmailAddresses = subscriberEmailAddresses;
            return this;
        }
        public Builder subscriberEmailAddresses(String... subscriberEmailAddresses) {
            return subscriberEmailAddresses(List.of(subscriberEmailAddresses));
        }
        public Builder subscriberSnsTopicArns(@Nullable List<String> subscriberSnsTopicArns) {
            this.subscriberSnsTopicArns = subscriberSnsTopicArns;
            return this;
        }
        public Builder subscriberSnsTopicArns(String... subscriberSnsTopicArns) {
            return subscriberSnsTopicArns(List.of(subscriberSnsTopicArns));
        }
        public Builder threshold(Double threshold) {
            this.threshold = Objects.requireNonNull(threshold);
            return this;
        }
        public Builder thresholdType(String thresholdType) {
            this.thresholdType = Objects.requireNonNull(thresholdType);
            return this;
        }        public BudgetNotification build() {
            return new BudgetNotification(comparisonOperator, notificationType, subscriberEmailAddresses, subscriberSnsTopicArns, threshold, thresholdType);
        }
    }
}
