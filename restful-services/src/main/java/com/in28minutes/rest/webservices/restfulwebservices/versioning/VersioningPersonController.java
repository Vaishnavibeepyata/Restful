package com.in28minutes.rest.webservices.restfulwebservices.versioning;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class VersioningPersonController {

	@GetMapping("/v1/person")
	public PersonV1 getFirstVersrsionOfPerson() {
		return new PersonV1("Bob charlie");
	}
	@GetMapping("/v2/person")
	public PersonV2 getSecondVersrsionOfPerson() {
		return new PersonV2(new Name("Bob","Charlie"));
	}
	@GetMapping(path="/person" , params="version=1")
	public PersonV1 getFirstVersrsionOfPersonRequestParameter() {
		return new PersonV1("Bob charlie");
	}
	@GetMapping(path="/person" , params="version=2")
	public PersonV2 getSecondVersrsionOfPersonRequestParameter() {
		return new PersonV2(new Name("Bob","Charlie"));
	}
	@GetMapping(path="/person/header" , headers="X-API-VERSION=1")
			
	public PersonV1 getFirstVersrsionOfPersonHeader() {
		return new PersonV1("Bob charlie");
}
	@GetMapping(path="/person/header2" , headers="X-API-VERSION=2")
	public PersonV2 getSecondVersrsionOfPersonheaderr() {
		return new PersonV2(new Name("Bob","Charlie"));
	}
	@GetMapping(path="/person/accept" , produces="application/vnd.company.app-v1+json")
	
	public PersonV1 getFirstVersrsionOfPersonAcceptHeader() {
		return new PersonV1("Bob charlie");
}
@GetMapping(path="/person/accept" , produces="application/vnd.company.app-v2+json")
	
	public PersonV2 getFirstVersrsionOfPersonAcceptAcceptHeader() {
	return new PersonV2(new Name("Bob","Charlie"));
}
}
