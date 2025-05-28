package com.becoder.entity;

import java.sql.Date;

import jakarta.persistence.MappedSuperclass;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@MappedSuperclass
public class BaseModel {

	private Boolean isActive;
	private Boolean isDeleted;
	private Integer createdBy;
	private Date CreatedOn;
	private Integer updatedBy;
	private Date updatedOn;

}
