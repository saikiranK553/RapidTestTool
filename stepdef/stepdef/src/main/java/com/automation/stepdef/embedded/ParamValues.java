package com.automation.stepdef.embedded;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ParamValues {
	private int id;
	private String key;
	private String hint;
	private String type;
}
