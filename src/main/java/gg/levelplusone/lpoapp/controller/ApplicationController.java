package gg.levelplusone.lpoapp.controller;

import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import gg.levelplusone.lpoapp.service.SearchCoachesService;
import gg.levelplusone.lpoapp.vo.CoachVO;

@RestController()
@RequestMapping("/")
public class ApplicationController {

	@RequestMapping(value = "/searchCoaches")
	public List<CoachVO> searchCoaches (@RequestParam("searchCriteria") String searchCriteria){
		
		//TODO Error Handling
		List<CoachVO> coachList = SearchCoachesService.searchCoaches(searchCriteria);
		
		return coachList;
	}
}
