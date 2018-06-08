package gg.levelplusone.lpoapp.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the coach_game_info database table.
 * 
 */
@Entity
@Table(name="coach_game_info")
@NamedQuery(name="CoachGameInfo.findAll", query="SELECT c FROM CoachGameInfo c")
public class CoachGameInfo implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="coach_game_id")
	private int coachGameId;

	@Column(name="competing_since")
	private String competingSince;

	private String game;

	//bi-directional many-to-one association to User
	@ManyToOne
	@JoinColumn(name="user_id")
	private User user;

	//bi-directional many-to-one association to Specialty
	@OneToMany(mappedBy="coachGameInfo")
	private List<Specialty> specialties;

	public CoachGameInfo() {
	}

	public int getCoachGameId() {
		return this.coachGameId;
	}

	public void setCoachGameId(int coachGameId) {
		this.coachGameId = coachGameId;
	}

	public String getCompetingSince() {
		return this.competingSince;
	}

	public void setCompetingSince(String competingSince) {
		this.competingSince = competingSince;
	}

	public String getGame() {
		return this.game;
	}

	public void setGame(String game) {
		this.game = game;
	}

	public User getUser() {
		return this.user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public List<Specialty> getSpecialties() {
		return this.specialties;
	}

	public void setSpecialties(List<Specialty> specialties) {
		this.specialties = specialties;
	}

	public Specialty addSpecialty(Specialty specialty) {
		getSpecialties().add(specialty);
		specialty.setCoachGameInfo(this);

		return specialty;
	}

	public Specialty removeSpecialty(Specialty specialty) {
		getSpecialties().remove(specialty);
		specialty.setCoachGameInfo(null);

		return specialty;
	}

}