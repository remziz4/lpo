package gg.levelplusone.lpoapp.model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the user_coaching_info database table.
 * 
 */
@Entity
@Table(name="user_coaching_info")
@NamedQuery(name="UserCoachingInfo.findAll", query="SELECT u FROM UserCoachingInfo u")
public class UserCoachingInfo implements Serializable {
	private static final long serialVersionUID = 1L;

	private BigDecimal rate;

	@Column(name="rate_type")
	private String rateType;

	private String tagline;

	//bi-directional one-to-one association to User
	@Id
	@OneToOne
	@JoinColumn(name="user_id")
	private User user;

	public UserCoachingInfo() {
	}


	public BigDecimal getRate() {
		return this.rate;
	}

	public void setRate(BigDecimal rate) {
		this.rate = rate;
	}

	public String getRateType() {
		return this.rateType;
	}

	public void setRateType(String rateType) {
		this.rateType = rateType;
	}

	public String getTagline() {
		return this.tagline;
	}

	public void setTagline(String tagline) {
		this.tagline = tagline;
	}

	public User getUser() {
		return this.user;
	}

	public void setUser(User user) {
		this.user = user;
	}

}