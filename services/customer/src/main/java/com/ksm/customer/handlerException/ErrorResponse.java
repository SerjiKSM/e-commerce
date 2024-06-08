package com.ksm.customer.handlerException;

import java.util.Map;

public record ErrorResponse(Map<String, String> errors) {
}
