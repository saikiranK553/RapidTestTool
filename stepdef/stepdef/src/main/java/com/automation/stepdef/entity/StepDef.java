package com.automation.stepdef.entity;

import java.util.List;

import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.FieldType;
import org.springframework.data.mongodb.core.mapping.MongoId;

import com.automation.stepdef.embedded.Config;
import com.automation.stepdef.embedded.ParamValues;

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
	@Indexed(unique = true)
	private String stepDefName;
	
	private Config config;
	
	private List<ParamValues> paramValues;
	
	public StepDef(String stepDefName) {
        this.stepDefName = stepDefName;
    }
}
