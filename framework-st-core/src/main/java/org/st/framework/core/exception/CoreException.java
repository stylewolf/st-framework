package org.st.framework.core.exception;

/**
 * 框架异常基类，所有异常应继承此类
 */
public class CoreException extends RuntimeException {
    public CoreException(String message) {
        super(message);
    }

    public CoreException(String message, Throwable cause) {
        super(message, cause);
    }

    public CoreException(Throwable cause) {
        super(cause);
    }
}
