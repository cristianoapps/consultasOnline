package br.com.marcacao.consultasOnline.resource.exception;

import javax.servlet.http.HttpServletRequest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import br.com.marcacao.consultasOnline.service.exxeptions.AplicacaoException;

@ControllerAdvice
public class ResourceExceptionHandler {
	@ExceptionHandler(AplicacaoException.class)
	public ResponseEntity<StandardError> objectNotFound(AplicacaoException e, HttpServletRequest httpRequest) {
		StandardError error = new StandardError(HttpStatus.NOT_FOUND.value(), e.getMessage(),
				System.currentTimeMillis());
		return ResponseEntity.status(HttpStatus.NOT_FOUND).body(error);
	}
}
