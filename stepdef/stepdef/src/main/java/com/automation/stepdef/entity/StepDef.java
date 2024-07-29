package com.automation.stepdef.entity;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;
import org.springframework.data.mongodb.core.mapping.FieldType;
import org.springframework.data.mongodb.core.mapping.MongoId;

import com.automation.stepdef.embedded.Code;
import com.automation.stepdef.embedded.Config;
import com.automation.stepdef.embedded.ParamValues;
import com.automation.stepdef.embedded.Step;

import jakarta.persistence.Embedded;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Document(collection = "stepdefs")
@Data
@AllArgsConstructor
@RequiredArgsConstructor
public class StepDef {
	@MongoId(targetType = FieldType.OBJECT_ID)
	private String id; 
	
	private String internalId;
	private String version;
	@Indexed(unique = true)
	private String type;
	private String runType;
	private int returnType;
	@Indexed(unique = true)
	private String content;
	@Indexed(unique = true)
	private String tempContent;
	private String stepContent;
	private String dataContent;
	private String description;
	private String projectId;
	private String frameworkId;
	private String frameworkCode;
	@Embedded
	private Code code;
	
	@Embedded
	private Config config;
	private List<ParamValues> paramValues;
	
	private List<Object> scriptJson;
	private List<Object> gConfig;
	private List<Step> steps;
	@Indexed(unique = true)
	private String scope;
	private String status;
	@Indexed(unique = true)
	private String uCr;
	@CreatedDate
	private LocalDateTime dtCr;
	private String uMod;
	@LastModifiedDate
	private LocalDateTime dtMod;
	
}
