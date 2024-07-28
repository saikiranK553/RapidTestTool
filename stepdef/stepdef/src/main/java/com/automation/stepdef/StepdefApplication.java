package com.automation.stepdef;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.automation.stepdef.embedded.Config;
import com.automation.stepdef.embedded.ParamValues;
import com.automation.stepdef.entity.StepDef;
import com.automation.stepdef.repository.StepDefRepository;

@SpringBootApplication
public class StepdefApplication implements CommandLineRunner{
	
	@Autowired
    private StepDefRepository repository;


	public static void main(String[] args) {
		SpringApplication.run(StepdefApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		ParamValues param1 = new ParamValues(1, "key1", "hint1", "type1");
        ParamValues param2 = new ParamValues(2, "key2", "hint2", "type2");
        Config config = new Config(1, 200, true);
        StepDef stepDef = new StepDef("Sample StepDef123");
        stepDef.setConfig(config);
        stepDef.setParamValues(Arrays.asList(param1, param2));

        
        repository.save(stepDef);

	}

}
