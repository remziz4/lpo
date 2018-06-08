package gg.levelplusone.lpoapp.service;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import gg.levelplusone.lpoapp.vo.CoachVO;

@Service
public class SearchCoachesService {
	
	Logger logger = LoggerFactory.getLogger(SearchCoachesService.class);

	public List<CoachVO> searchCoaches(String searchCriteria){
		logger.debug("Entering SearchCoachesService...");
		
		//TODO Input Validation
		
		//TODO Implement Search Logic
		
		logger.debug("Exiting SearchCoachesService...");
		return new ArrayList<CoachVO>();
	}
	
}
