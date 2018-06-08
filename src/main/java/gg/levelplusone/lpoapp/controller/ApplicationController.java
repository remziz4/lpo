package gg.levelplusone.lpoapp.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import gg.levelplusone.lpoapp.service.SearchCoachesService;
import gg.levelplusone.lpoapp.vo.CoachVO;

@RestController()
@RequestMapping("/")
public class ApplicationController {
	
	Logger logger = LoggerFactory.getLogger(ApplicationController.class);
	
	@Autowired
	SearchCoachesService searchService;

	@RequestMapping(value = "/searchCoaches")
	public List<CoachVO> searchCoaches (@RequestParam("searchCriteria") String searchCriteria){
		logger.debug("Entering ApplicationController.searchCoaches()");
		
		//TODO Error Handling
		List<CoachVO> coachList = searchService.searchCoaches(searchCriteria);
		
		logger.debug("Entering ApplicationController.searchCoaches()");
		return coachList;
	}
}
