package cn.wkiki.util;

import javax.servlet.ServletContext;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.web.context.WebApplicationContext;

public class ContextUtils implements ApplicationContextAware
{

	private ApplicationContext rootApplicationContext = null;

	/**
	 * 获取当前IOC容器的根容器
	 * 
	 * @return
	 */
	public ApplicationContext getRootApplicationContext()
	{
		return rootApplicationContext;
	}

	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException
	{
		// TODO Auto-generated method stub
		rootApplicationContext = applicationContext;
	}

}
