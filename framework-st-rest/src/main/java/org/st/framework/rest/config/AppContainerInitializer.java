package org.st.framework.rest.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.web.servlet.ServletContextInitializer;
import org.springframework.stereotype.Component;

import javax.servlet.*;
import java.util.EnumSet;
@Component
public class AppContainerInitializer implements ServletContextInitializer {

	private static final Logger LOGGER = LoggerFactory.getLogger(AppContainerInitializer.class);
	@Override
	public void onStartup(ServletContext servletContext)
			throws ServletException {
		if(LOGGER.isDebugEnabled()){
			LOGGER.debug("app init start!");
		}
		FilterRegistration.Dynamic encodingFilter = servletContext.addFilter("encodingFilter", org.springframework.web.filter.CharacterEncodingFilter.class);
		encodingFilter.setInitParameter("encoding", "UTF-8");
		encodingFilter.addMappingForUrlPatterns(  
                EnumSet.of(DispatcherType.REQUEST, DispatcherType.FORWARD, DispatcherType.INCLUDE), false, "/*");
		
		// 注册验证码
		ServletRegistration.Dynamic kaptchaDynamic = servletContext.addServlet(
				"Kaptcha", "com.google.code.kaptcha.servlet.KaptchaServlet");
		kaptchaDynamic.setInitParameter("kaptcha.border", "no");
		kaptchaDynamic.setInitParameter("kaptcha.textproducer.char.space", "4");
		kaptchaDynamic
				.setInitParameter("kaptcha.textproducer.char.length", "4");
		kaptchaDynamic.addMapping("/kaptcha");
	}
	
}
