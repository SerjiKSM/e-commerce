package com.ksm.payment.request;

import com.ksm.payment.enumeration.PaymentMethod;
import com.ksm.payment.record.Customer;

import java.math.BigDecimal;

public record PaymentRequest(
        Integer id,
        BigDecimal amount,
        PaymentMethod paymentMethod,
        Integer orderId,
        String orderReference,
        Customer customer
) {
}
