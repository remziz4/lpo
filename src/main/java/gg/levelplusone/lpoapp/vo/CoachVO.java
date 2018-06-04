package gg.levelplusone.lpoapp.vo;

import java.util.List;

public class CoachVO {

	private String username;
	private Double rating;
	private List<String> specialties;
	private String tagLine;
	private Double rate;
	private RateType rateType;
	
	/**
	 * @return the username
	 */
	public String getUsername() {
		return username;
	}
	/**
	 * @param username the username to set
	 */
	public void setUsername(String username) {
		this.username = username;
	}
	/**
	 * @return the rating
	 */
	public Double getRating() {
		return rating;
	}
	/**
	 * @param rating the rating to set
	 */
	public void setRating(Double rating) {
		this.rating = rating;
	}
	/**
	 * @return the specialties
	 */
	public List<String> getSpecialties() {
		return specialties;
	}
	/**
	 * @param specialties the specialties to set
	 */
	public void setSpecialties(List<String> specialties) {
		this.specialties = specialties;
	}
	/**
	 * @return the tagLine
	 */
	public String getTagLine() {
		return tagLine;
	}
	/**
	 * @param tagLine the tagLine to set
	 */
	public void setTagLine(String tagLine) {
		this.tagLine = tagLine;
	}
	/**
	 * @return the rate
	 */
	public Double getRate() {
		return rate;
	}
	/**
	 * @param rate the rate to set
	 */
	public void setRate(Double rate) {
		this.rate = rate;
	}
	/**
	 * @return the rateType
	 */
	public RateType getRateType() {
		return rateType;
	}
	/**
	 * @param rateType the rateType to set
	 */
	public void setRateType(RateType rateType) {
		this.rateType = rateType;
	}
	
	
}
