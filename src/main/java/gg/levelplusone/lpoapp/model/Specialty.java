package gg.levelplusone.lpoapp.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the specialty database table.
 * 
 */
@Entity
@NamedQuery(name="Specialty.findAll", query="SELECT s FROM Specialty s")
public class Specialty implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="specialty_id")
	private int specialtyId;

	private String character;

	//bi-directional many-to-one association to CoachGameInfo
	@ManyToOne
	@JoinColumn(name="coach_game_id")
	private CoachGameInfo coachGameInfo;

	public Specialty() {
	}

	public int getSpecialtyId() {
		return this.specialtyId;
	}

	public void setSpecialtyId(int specialtyId) {
		this.specialtyId = specialtyId;
	}

	public String getCharacter() {
		return this.character;
	}

	public void setCharacter(String character) {
		this.character = character;
	}

	public CoachGameInfo getCoachGameInfo() {
		return this.coachGameInfo;
	}

	public void setCoachGameInfo(CoachGameInfo coachGameInfo) {
		this.coachGameInfo = coachGameInfo;
	}

}