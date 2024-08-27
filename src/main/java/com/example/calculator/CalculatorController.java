package com.example.calculator;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.ResponseEntity;

@RestController
@CrossOrigin(origins ={"https://techmahindra588-dev-ed.develop.lightning.force.com" , "http://localhost:3333"})
public class CalculatorController {

	@GetMapping("/api/add")
	public ResponseEntity<Integer> add(@RequestParam(name = "a") int a, @RequestParam(name = "b") int b) {
	    return ResponseEntity.ok(a + b);
	}

	@GetMapping("/api/subtract")
	public ResponseEntity<Integer> subtract(@RequestParam(name = "a") int a, @RequestParam(name = "b") int b) {
	    return ResponseEntity.ok(a - b);
	}

	@GetMapping("/api/multiply")
	public ResponseEntity<Integer> multiply(@RequestParam(name = "a") int a, @RequestParam(name = "b") int b) {
	    return ResponseEntity.ok(a * b);
	}

	@GetMapping("/api/divide")
	public ResponseEntity<?> divide(@RequestParam(name = "a") int a, @RequestParam(name = "b") int b) {
	    if (b == 0) {
	        return ResponseEntity.badRequest().body("Error: Division by zero");
	    }
	    return ResponseEntity.ok(a / b);
	}
}