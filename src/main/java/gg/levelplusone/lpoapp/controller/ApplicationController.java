package gg.levelplusone.lpoapp.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import gg.levelplusone.lpoapp.vo.CoachVO;

@RestController()
@RequestMapping("/")
public class ApplicationController {

	@RequestMapping(value = "/searchCoaches")
	public List<CoachVO> searchCoaches (@RequestParam("searchString") String searchString){
		List<CoachVO> coachList = new ArrayList<CoachVO>();
		
		//TODO Call Service to search for coaches and return list
		
		return coachList;
	}
}
