package com.ksm.order.producer;

import com.ksm.order.enumeration.PaymentMethod;
import com.ksm.order.response.CustomerResponse;
import com.ksm.order.response.PurchaseResponse;

import java.math.BigDecimal;
import java.util.List;

public record OrderConfirmation (
        String orderReference,
        BigDecimal totalAmount,
        PaymentMethod paymentMethod,
        CustomerResponse customer,
        List<PurchaseResponse> products
) {
}