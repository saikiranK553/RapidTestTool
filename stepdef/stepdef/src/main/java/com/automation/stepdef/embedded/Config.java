package com.automation.stepdef.embedded;

import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Embeddable
public class Config {
	private int lock;
	private int codeStatus;
	private boolean scriptLess;
}
