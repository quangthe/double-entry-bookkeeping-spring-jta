package com.project.springjta.doubleentry;

/**
 * Business exception thrown if a monetary transaction request legs are unbalanced,
 * e.g. the sum of all leg amounts does not equal zero (double-entry principle).
 *
 * @author yanimetaxas
 * @since 14-Nov-14
 */
public class UnbalancedLegsException extends BusinessException {
    private static final long serialVersionUID = 1L;

	public UnbalancedLegsException(String message) {
        super(message);
    }
}
