package br.com.marcacao.consultasOnline.service.exceptions;

public class DataIntegrityException extends RuntimeException {

	private static final long serialVersionUID = 1527696271109874170L;

	public DataIntegrityException(String message) {
		super(message);
	}

	public DataIntegrityException(String message, Throwable cause) {
		super(message, cause);
	}

}
