package com.becoder.dto;

import java.sql.Date;

import com.becoder.entity.Category;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class NotesDto {

	private Integer id;
	private String title;
	private String description;

	private CategoryDto category;

	private Boolean isActive;
	private Integer createdBy;
	private Date CreatedOn;
	private Integer updatedBy;
	private Date updatedOn;
	
	
	@AllArgsConstructor
	@NoArgsConstructor
	@Getter
	@Setter
	public static class CategoryDto {
		
		private Integer id;

		private String name;

		
	}

}
