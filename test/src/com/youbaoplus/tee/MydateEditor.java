package com.youbaoplus.tee;

import java.beans.PropertyEditorSupport;
import java.util.Date;

import org.springframework.beans.factory.config.CustomEditorConfigurer;

public class MydateEditor extends PropertyEditorSupport {

	@Override
	public void setAsText(String text) throws IllegalArgumentException {
		Date date=new Date(text);
		setValue(date);
	}
	
	
	

	
}
