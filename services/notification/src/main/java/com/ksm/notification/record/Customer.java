package com.ksm.notification.record;

public record Customer(
        String id,
        String firstname,
        String lastname,
        String email
) {
}
