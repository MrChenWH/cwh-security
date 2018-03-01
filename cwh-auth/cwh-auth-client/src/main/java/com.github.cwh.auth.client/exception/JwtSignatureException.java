package com.github.cwh.auth.client.exception;

/**
 * @author cwh
 */
public class JwtSignatureException extends Exception {
    public JwtSignatureException(String s) {
        super(s);
    }
}
