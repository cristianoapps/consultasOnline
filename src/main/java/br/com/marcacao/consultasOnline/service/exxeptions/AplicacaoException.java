package br.com.marcacao.consultasOnline.service.exxeptions;

public class AplicacaoException extends RuntimeException {

	private static final long serialVersionUID = 1527696271109874170L;

	public AplicacaoException(String message) {
		super(message);
	}

	public AplicacaoException(String message, Throwable cause) {
		super(message, cause);
	}

}
