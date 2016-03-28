package com.db.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class DbMarkerController {

	private static final String GOOGLE_KEY_URL = "https://maps.googleapis.com/maps/api/js?key=AIzaSyDS4e7YKcom39GQYJ0QmH6hOsV0A2w8_XM&callback=initMap";

	private Double latitute = 44.4801497;
	
	private Double longitude = 26.113618;
	
	@RequestMapping(value = "/dbMarker", method = RequestMethod.GET)
	public ModelAndView getdata() {
		ModelAndView model = new ModelAndView("aseView");
		
		model.addObject("googleKeyUrl", getGoogleKeyUrl());
		model.addObject("latitude", getLatitude());
		model.addObject("longitude", getLongitude());

		return model;
	}

	public static String getGoogleKeyUrl() {
		return GOOGLE_KEY_URL;
	}

	public Double getLatitude() {
		return latitute;
	}

	public Double getLongitude() {
		return longitude;
	}

}