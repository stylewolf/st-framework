package org.st.framework.rest.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
public class BaseController {
    @Resource
    HttpServletRequest request;

    @Resource
    HttpServletResponse response;

}
