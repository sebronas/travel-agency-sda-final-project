package com.sda.travelagency.dto;

import java.time.LocalDateTime;

public record ErrorResponse(
        LocalDateTime timeStamp,
        int status,
        String errorMessage,
        String path
) {
}
