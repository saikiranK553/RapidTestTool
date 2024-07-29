package com.automation.stepdef;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.automation.stepdef.embedded.Code;
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
		// Create instances of embedded classes
        Code code = new Code("Header content", "Body content", "Footer content");
        Config config = new Config(1, 0, false);

        // Create a list of ParamValues
        List<ParamValues> paramValues = List.of(
            new ParamValues(1, "key1", "hint1", "type1"),
            new ParamValues(2, "key2", "hint2", "type2")
        );

        // Create an instance of StepDef
        StepDef stepDef = new StepDef(
            null, // id is generated automatically
            "internalId123",
            "v1.0",
            "typeA",
            "runTypeX",
            1,
            "content123",
            "tempContent456",
            "stepContent789",
            "dataContent012",
            "description about the step",
            "projectId123",
            "frameworkId456",
            "frameworkCode789",
            code,
            config,
            paramValues,
            List.of(), // scriptJson
            List.of(), // gConfig
            List.of(), // steps
            "scopeA",
            "statusB",
            "uCrValue",
            LocalDateTime.now(), // dtCr is set to current time
            "uModValue",
            LocalDateTime.now()  // dtMod is set to current time
        );

        // Save the StepDef instance to MongoDB
        repository.save(stepDef);

        // Optionally print to confirm insertion
        System.out.println("StepDef inserted: " + stepDef);

	}

}
