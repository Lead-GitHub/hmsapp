package com.test.hmsApp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AppointmentController {

	@RequestMapping("/startCheckIn")
	public String showCheckIn() {
		return "startCheckIn";
	}
}
