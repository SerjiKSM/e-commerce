package com.ksm.order.request;

import com.ksm.order.enumeration.PaymentMethod;
import com.ksm.order.response.CustomerResponse;

import java.math.BigDecimal;

public record PaymentRequest(
        BigDecimal amount,
        PaymentMethod paymentMethod,
        Integer orderId,
        String orderReference,
        CustomerResponse customer
) {
}