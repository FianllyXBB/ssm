package com.xbbsmile.ssm.po;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class BaseEntity {

	@Override
	public String toString() {
		
		Field[] fields = this.getClass().getDeclaredFields();
		StringBuffer sb = new StringBuffer();
		sb.append("[");
		String methodName;
		Method method;
		for (Field field : fields) {
			methodName = "get" + field.getName().substring(0,1).toUpperCase() + field.getName().substring(1);
			try {
				method = this.getClass().getMethod(methodName, new Class[]{});
				Object value = method.invoke(this, new Object[]{});
				sb.append(methodName + ":" + value + " ");
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		sb.append("]");
		return sb.toString();
	}
	
}
