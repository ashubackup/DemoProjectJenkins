package com;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin("*")
public class Testing 
{

	@GetMapping("/test")
	public ResponseEntity<?> getRq()
	{
		try
		{
			return ResponseEntity.ok("Get Your Request");
		}
		catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return ResponseEntity.internalServerError().body("Not Working");
		}
	}
	
	@PostMapping("/Demo")
	public ResponseEntity<?> getPostRq(@RequestBody String ani)
	{
		try
		{
			System.out.println("ani"+ani);
			return ResponseEntity.ok("Get Your Request");
		}
		catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return ResponseEntity.internalServerError().body("Not Working");
		}
	}
}
