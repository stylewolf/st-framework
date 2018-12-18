package org.st.framework.rest.exception;

import org.st.framework.core.exception.CoreException;
import org.st.framework.core.exception.ExceptionCode;

public class PasswordIncorrectException extends CoreException {
    public PasswordIncorrectException(String message) {
        super(message);
        setCode(ExceptionCode.SYSTEM_USER_PASSWORD_ERROR);
    }

    public PasswordIncorrectException(String message, Throwable cause) {
        super(message, cause);
    }

    public PasswordIncorrectException(Throwable cause) {
        super(cause);
    }
}
