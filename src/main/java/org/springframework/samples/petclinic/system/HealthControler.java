package org.springframework.samples.petclinic.system;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class HealthControler {

	@GetMapping("health")
	public ResponseEntity<String> liveness() {
		return ResponseEntity.ok("I'm alive!");
	}

}
