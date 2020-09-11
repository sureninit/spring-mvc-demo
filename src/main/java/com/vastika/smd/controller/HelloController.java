package com.vastika.smd.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {
	
	@RequestMapping(value="greet1", method = RequestMethod.GET)
	public ModelAndView greet1() {
		ModelAndView view = new ModelAndView("greeting");
		view.addObject("msg","Hello !!!");
		return view;
	}
	
	@RequestMapping(value="he", method = RequestMethod.GET)
	public ModelAndView hello() {
		ModelAndView hello = new ModelAndView("hello");
		return hello;
		
	}
	
	@RequestMapping(value="/greet2/{first_name}/{last_name}", method = RequestMethod.GET)
	public ModelAndView greet2(@PathVariable("first_name") String firstname, @PathVariable ("last_name") String lastname) {
		ModelAndView view1 = new ModelAndView("greeting");
		view1.addObject("msg","Hello !!! "+firstname+" "+ lastname);
		return view1;
	}
	
	@RequestMapping(value="/greet3/{first_name}/{last_name}", method = RequestMethod.GET)
	public ModelAndView greet3(@PathVariable Map<String,String> info) {
		ModelAndView view1 = new ModelAndView("greeting");
		view1.addObject("msg","Hello !!! "+info.get("first_name")+" "+ info.get("last_name"));
		return view1;

}
	@RequestMapping(value="greet4", method = RequestMethod.GET)
	public ModelAndView greet3(@RequestParam String firstname, @RequestParam String lastname) {
		ModelAndView view1 = new ModelAndView("greeting");
		view1.addObject("msg","Hello !!! "+firstname+" "+lastname);
		return view1;

}
	@RequestMapping(value="greet5", method = RequestMethod.GET)
	public ModelAndView greet5(@RequestParam HashMap<String, String> info) {
		ModelAndView view1 = new ModelAndView("greeting");
		view1.addObject("msg","Hello !!! "+info.get("firstname")+" "+info.get("lastname"));
		return view1;

}
	@ModelAttribute
	public Model addCommonObject(Model model) {
		model.addAttribute("greet", "Good Morning");
		return model;
	}
	
	
}
