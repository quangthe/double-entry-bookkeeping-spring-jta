package com.project.springjta.doubleentry.validation;

import com.project.springjta.doubleentry.BusinessException;

/**
 * Business exception thrown if a transfer validation is illegal.
 *
 * @author yanimetaxas
 * @since 14-Nov-14
 */
public class TransferValidationException extends BusinessException {
	private static final long serialVersionUID = -6114850538235916873L;

	public TransferValidationException(String message) {
        super(message);
    }
}
