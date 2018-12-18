package org.st.framework.rest.controller;

import com.hazelcast.core.HazelcastInstance;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class BaseController {
    @Resource
    HttpServletRequest request;

    @Resource
    HttpServletResponse response;
    @Resource
    HttpSession session;
    @Resource
    HazelcastInstance hazelcastInstance;

}
