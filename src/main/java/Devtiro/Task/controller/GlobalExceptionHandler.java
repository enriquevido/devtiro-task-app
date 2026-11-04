package Devtiro.Task.controller;

import java.util.UUID;

import org.springframework.context.support.DefaultMessageSourceResolvable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;

import Devtiro.Exception.TaskNotFoundException;
import Devtiro.Task.domain.dto.ErrorDto;

@ControllerAdvice
public class GlobalExceptionHandler {
    public ResponseEntity<ErrorDto> handleValidationExceptions(MethodArgumentNotValidException ex) {
        String errorMessage = ex.getBindingResult().getFieldErrors().stream()
                .findFirst()
                .map(DefaultMessageSourceResolvable::getDefaultMessage)
                .orElse("Validation Failed");

        ErrorDto errorDto = new ErrorDto(errorMessage);
        return new ResponseEntity<>(errorDto, HttpStatus.BAD_REQUEST);
    }

    public ResponseEntity<ErrorDto> handleTaskNotFoundException(TaskNotFoundException ex) {
        UUID taskNotFoundId = ex.getId();
        String errorMessage = String.format("Task with ID '%s' not found", taskNotFoundId);
        ErrorDto errorDto = new ErrorDto(errorMessage);
        return new ResponseEntity<>(errorDto, HttpStatus.BAD_REQUEST);
    }
}
