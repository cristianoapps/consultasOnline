package br.com.marcacao.consultasOnline.resource.exception;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class StandardError {
	private Integer status;
	private String message;
	private Long timestamp;
}
