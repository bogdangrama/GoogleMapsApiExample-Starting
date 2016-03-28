package com.db.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class AseToDbMapController {
	private static final String GOOGLE_KEY_URL = "https://maps.googleapis.com/maps/api/js?key=AIzaSyDS4e7YKcom39GQYJ0QmH6hOsV0A2w8_XM&callback=initMap";

	private Double aseLatitude = 44.4474265;
	
	private Double aseLongitude = 26.0984039;

	private Double dbLatitude = 44.4801497;
	
	private Double dbLongitude = 26.113618;


	@RequestMapping(value = "/aseToDb", method = RequestMethod.GET)
	public ModelAndView getdata() {
		ModelAndView model = new ModelAndView("aseToDbView");
		
		model.addObject("googleKeyUrl", getGoogleKeyUrl());
		
		model.addObject("aseLatitude", getAseLatitude());
		model.addObject("aseLongitude", getAseLongitude());
		
		model.addObject("dbLatitude", getDbLatitude());
		model.addObject("dbLongitude", getDbLongitude());
		
		return model;
	}

	public static String getGoogleKeyUrl() {
		return GOOGLE_KEY_URL;
	}

	public Double getAseLatitude() {
		return aseLatitude;
	}

	public Double getAseLongitude() {
		return aseLongitude;
	}

	public Double getDbLatitude() {
		return dbLatitude;
	}

	public Double getDbLongitude() {
		return dbLongitude;
	}

}
