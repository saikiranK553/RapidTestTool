package com.automation.stepdef.embedded;

import java.util.List;

import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@Embeddable
@AllArgsConstructor
@NoArgsConstructor
public class Step {
	private String stepDefId;
	private List<ParamValues> paramValues;
}
