package org.st.framework.rest.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.st.framework.core.exception.CoreException;
import org.st.framework.core.exception.ExceptionCode;
import org.st.framework.core.exception.NotFoundException;
import org.st.framework.core.utils.SimpleData;
import org.st.framework.rest.exception.PasswordIncorrectException;
import org.st.framework.rest.exception.UserNotFoundException;
import org.st.framework.utils.FailureData;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@ControllerAdvice
@ResponseBody
public class GlobalExceptionHandler{
    private static final Logger LOGGER = LoggerFactory.getLogger(GlobalExceptionHandler.class);

    @Resource
    HttpServletRequest request;

    @Resource
    HttpServletResponse response;

    @ExceptionHandler({PasswordIncorrectException.class,UserNotFoundException.class,NotFoundException.class})
    SimpleData<String> handleUserException(CoreException e){
        FailureData<String> rs = new FailureData<String>();
        rs.setMessage(e.getMessage());
        rs.setCode(e.getCode());
        rs.setData(e.getClass().getSimpleName());
        response.setStatus(e.getCode());
        return rs;
    }

    /**
     * 处理所有不可知的异常
     * @param e
     * @return
     */
    @ExceptionHandler(Exception.class)
    SimpleData<String> handleException(Exception e){
        FailureData<String> rs = new FailureData<String>();
        rs.setMessage("系统内部异常！");
        rs.setData(e.getClass().getSimpleName());
        rs.setCode(ExceptionCode.SERVER_FETAL);
        response.setStatus(ExceptionCode.SERVER_FETAL);
        return rs;
    }
}
