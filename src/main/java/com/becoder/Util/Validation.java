package com.becoder.Util;

import java.util.LinkedHashMap;
import java.util.Map;

import org.springframework.util.ObjectUtils;

import com.becoder.dto.CategoryDto;

public class Validation {

	
	public void CategotyValidation(CategoryDto categoryDto) {
		
		
		Map<String, Object> error = new LinkedHashMap<>();
		
		if(ObjectUtils.isEmpty(categoryDto)) {
			
			
			throw new IllegalArgumentException("category object/Json shoudn't be null or empty");
		}else {
			
			// validation name field
			
			if(ObjectUtils.isEmpty(categoryDto.getName())) {
				
				error.put("name", "name field is empty or null");
			}else {
				
				if(categoryDto.getName().length()<10) {
					
					error.put("name", "name lenght min 10");
				}
				
                     if(categoryDto.getName().length()>100) {
					
					error.put("name", "name lenght max 100");
				}
			}
		}
		
	}
	
}
