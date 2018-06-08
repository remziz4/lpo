package gg.levelplusone.lpoapp.model;

import java.io.Serializable;
import javax.persistence.*;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.util.Date;
import java.util.List;


/**
 * The persistent class for the user database table.
 * 
 */
@Entity
@EntityListeners(AuditingEntityListener.class)
@NamedQuery(name="User.findAll", query="SELECT u FROM User u")
public class User implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="user_id")
	private int userId;

	private String email;

	private boolean enabled;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="last_login")
	private Date lastLogin;

	@LastModifiedDate
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="last_modified_date")
	private Date lastModifiedDate;

	private String password;

	@CreatedDate
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="registration_date")
	private Date registrationDate;

	private String username;

	//bi-directional many-to-one association to GameInfo
	@OneToMany(mappedBy="user")
	private List<GameInfo> gameInfos;

	//bi-directional many-to-one association to Session
	@OneToMany(mappedBy="user1")
	private List<Session> sessions1;

	//bi-directional many-to-one association to Session
	@OneToMany(mappedBy="user2")
	private List<Session> sessions2;

	//bi-directional one-to-one association to UserProfile
	@OneToOne(mappedBy="user", cascade = CascadeType.PERSIST)
	private UserProfile userProfile;

	//bi-directional many-to-one association to UserRole
	@OneToMany(mappedBy="user", cascade = CascadeType.PERSIST)
	private List<UserRole> userRoles;

	//bi-directional many-to-one association to CoachGameInfo
	@OneToMany(mappedBy="user")
	private List<CoachGameInfo> coachGameInfos;

	//bi-directional one-to-one association to CoachRating
	@OneToOne(mappedBy="user1")
	private CoachRating coachRating;

	//bi-directional many-to-one association to CoachRating
	@OneToMany(mappedBy="user2")
	private List<CoachRating> coachRatings;

	//bi-directional one-to-one association to UserCoachingInfo
	@OneToOne(mappedBy="user")
	private UserCoachingInfo userCoachingInfo;

	public User() {
	}

	public int getUserId() {
		return this.userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public boolean getEnabled() {
		return this.enabled;
	}

	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}

	public Date getLastLogin() {
		return this.lastLogin;
	}

	public void setLastLogin(Date lastLogin) {
		this.lastLogin = lastLogin;
	}

	public Date getLastModifiedDate() {
		return this.lastModifiedDate;
	}

	public void setLastModifiedDate(Date lastModifiedDate) {
		this.lastModifiedDate = lastModifiedDate;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Date getRegistrationDate() {
		return this.registrationDate;
	}

	public void setRegistrationDate(Date registrationDate) {
		this.registrationDate = registrationDate;
	}

	public String getUsername() {
		return this.username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public List<GameInfo> getGameInfos() {
		return this.gameInfos;
	}

	public void setGameInfos(List<GameInfo> gameInfos) {
		this.gameInfos = gameInfos;
	}

	public GameInfo addGameInfo(GameInfo gameInfo) {
		getGameInfos().add(gameInfo);
		gameInfo.setUser(this);

		return gameInfo;
	}

	public GameInfo removeGameInfo(GameInfo gameInfo) {
		getGameInfos().remove(gameInfo);
		gameInfo.setUser(null);

		return gameInfo;
	}

	public List<Session> getSessions1() {
		return this.sessions1;
	}

	public void setSessions1(List<Session> sessions1) {
		this.sessions1 = sessions1;
	}

	public Session addSessions1(Session sessions1) {
		getSessions1().add(sessions1);
		sessions1.setUser1(this);

		return sessions1;
	}

	public Session removeSessions1(Session sessions1) {
		getSessions1().remove(sessions1);
		sessions1.setUser1(null);

		return sessions1;
	}

	public List<Session> getSessions2() {
		return this.sessions2;
	}

	public void setSessions2(List<Session> sessions2) {
		this.sessions2 = sessions2;
	}

	public Session addSessions2(Session sessions2) {
		getSessions2().add(sessions2);
		sessions2.setUser2(this);

		return sessions2;
	}

	public Session removeSessions2(Session sessions2) {
		getSessions2().remove(sessions2);
		sessions2.setUser2(null);

		return sessions2;
	}

	public UserProfile getUserProfile() {
		return this.userProfile;
	}

	public void setUserProfile(UserProfile userProfile) {
		this.userProfile = userProfile;
	}

	public List<UserRole> getUserRoles() {
		return this.userRoles;
	}

	public void setUserRoles(List<UserRole> userRoles) {
		this.userRoles = userRoles;
	}

	public UserRole addUserRole(UserRole userRole) {
		getUserRoles().add(userRole);
		userRole.setUser(this);

		return userRole;
	}

	public UserRole removeUserRole(UserRole userRole) {
		getUserRoles().remove(userRole);
		userRole.setUser(null);

		return userRole;
	}

	public List<CoachGameInfo> getCoachGameInfos() {
		return this.coachGameInfos;
	}

	public void setCoachGameInfos(List<CoachGameInfo> coachGameInfos) {
		this.coachGameInfos = coachGameInfos;
	}

	public CoachGameInfo addCoachGameInfo(CoachGameInfo coachGameInfo) {
		getCoachGameInfos().add(coachGameInfo);
		coachGameInfo.setUser(this);

		return coachGameInfo;
	}

	public CoachGameInfo removeCoachGameInfo(CoachGameInfo coachGameInfo) {
		getCoachGameInfos().remove(coachGameInfo);
		coachGameInfo.setUser(null);

		return coachGameInfo;
	}

	public CoachRating getCoachRating() {
		return this.coachRating;
	}

	public void setCoachRating(CoachRating coachRating) {
		this.coachRating = coachRating;
	}

	public List<CoachRating> getCoachRatings() {
		return this.coachRatings;
	}

	public void setCoachRatings(List<CoachRating> coachRatings) {
		this.coachRatings = coachRatings;
	}

	public CoachRating addCoachRating(CoachRating coachRating) {
		getCoachRatings().add(coachRating);
		coachRating.setUser2(this);

		return coachRating;
	}

	public CoachRating removeCoachRating(CoachRating coachRating) {
		getCoachRatings().remove(coachRating);
		coachRating.setUser2(null);

		return coachRating;
	}

	public UserCoachingInfo getUserCoachingInfo() {
		return this.userCoachingInfo;
	}

	public void setUserCoachingInfo(UserCoachingInfo userCoachingInfo) {
		this.userCoachingInfo = userCoachingInfo;
	}

}