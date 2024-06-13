package com.ksm.order.handlerException;

import java.util.Map;

public record ErrorResponse(Map<String, String> errors) {
}
