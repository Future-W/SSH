package com.woniu.demo;

import static org.junit.Assert.*;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.woniu.pojo.Dept;

public class test {
	@Test
	public void test() throws Exception {
		ApplicationContext context = //
				new ClassPathXmlApplicationContext("applicationContext.xml");
		SessionFactory s=(SessionFactory) context.getBean("sf");
		Session sf=s.openSession();
		
		sf.beginTransaction();
		///////////////////////////////////
		Dept d=new Dept();
		d.setDname("lisi");
		sf.save(d);
		//////////////////////////////////////
		sf.getTransaction().commit();
		sf.close();
	}
}
