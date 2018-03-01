package com.github.cwh.auth.client.exception;

/**
 * @author cwh
 */
public class JwtTokenExpiredException extends Exception {
    public JwtTokenExpiredException(String s) {
        super(s);
    }
}
