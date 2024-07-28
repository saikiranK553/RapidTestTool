package com.automation.stepdef.embedded;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Config {
	private int lock;
	private int codeStatus;
	private boolean scriptLess;
}
