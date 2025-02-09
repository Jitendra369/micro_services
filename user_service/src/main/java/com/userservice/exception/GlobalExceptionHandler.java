package com.userservice.exception;

import com.userservice.dto.APIResponseDto;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(ResourceNotFoundException.class)
    public ResponseEntity<APIResponseDto> resourceNotFound(ResourceNotFoundException exception){
        APIResponseDto apiResponseDto = new APIResponseDto(exception.getMessage(), HttpStatus.NOT_FOUND);
        return ResponseEntity.ok(apiResponseDto);
    }
}
