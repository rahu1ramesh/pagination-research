package com.research.pagination.backend.advice;

import com.research.pagination.backend.dto.ErrorResponse;
import lombok.NonNull;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.servlet.NoHandlerFoundException;

import java.time.LocalDateTime;

import static org.springframework.http.HttpStatus.NOT_FOUND;

@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(NoHandlerFoundException.class)
    public ResponseEntity<@NonNull ErrorResponse> handleNoHandlerFoundException(NoHandlerFoundException exception) {
        ErrorResponse errorResponse = new ErrorResponse();
        errorResponse.setTitle("Requested Resource Not Found");
        errorResponse.setTimestamp(LocalDateTime.now());
        errorResponse.setStatusCode(exception.getStatusCode());
        errorResponse.setMessage(exception.getMessage());
        return ResponseEntity.status(NOT_FOUND).body(errorResponse);
    }
}
