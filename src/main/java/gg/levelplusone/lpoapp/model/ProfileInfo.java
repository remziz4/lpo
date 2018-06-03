package gg.levelplusone.lpoapp.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the profile_info database table.
 * 
 */
@Entity
@Table(name="profile_info")
@NamedQuery(name="ProfileInfo.findAll", query="SELECT p FROM ProfileInfo p")
public class ProfileInfo implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="user_id")
	private int userId;

	@Column(name="avatar_uri")
	private String avatarUri;

	private String biography;

	private String discord;

	private String twitter;

	//bi-directional one-to-one association to User
	@OneToOne
	@JoinColumn(name="user_id")
	private User user;

	public ProfileInfo() {
	}

	public int getUserId() {
		return this.userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getAvatarUri() {
		return this.avatarUri;
	}

	public void setAvatarUri(String avatarUri) {
		this.avatarUri = avatarUri;
	}

	public String getBiography() {
		return this.biography;
	}

	public void setBiography(String biography) {
		this.biography = biography;
	}

	public String getDiscord() {
		return this.discord;
	}

	public void setDiscord(String discord) {
		this.discord = discord;
	}

	public String getTwitter() {
		return this.twitter;
	}

	public void setTwitter(String twitter) {
		this.twitter = twitter;
	}

	public User getUser() {
		return this.user;
	}

	public void setUser(User user) {
		this.user = user;
	}

}