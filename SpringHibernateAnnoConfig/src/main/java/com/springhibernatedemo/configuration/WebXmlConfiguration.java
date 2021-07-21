package com.springhibernatedemo.configuration;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class WebXmlConfiguration extends AbstractAnnotationConfigDispatcherServletInitializer{

	protected Class<?>[] getRootConfigClasses() {
		return null;
	}

protected Class<?>[] getServletConfigClasses() {
        
        return new Class[]{DataBaseInternalResourceConfiguration.class};
    }

    protected String[] getServletMappings() {
        
        return new String[]{"/"};
    }

}
