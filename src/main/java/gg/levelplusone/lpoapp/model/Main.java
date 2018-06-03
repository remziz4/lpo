package gg.levelplusone.lpoapp.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the session database table.
 * 
 */
@Entity
@NamedQuery(name="Main.findAll", query="SELECT m FROM Main m")
public class Main implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="main_id")
	private int mainId;
	
	//bi-directional many-to-one association to User
	@ManyToOne
	@JoinColumn(name="game_id")
	private GameInfo gameInfo;
	
	private String character;

	public int getMainId() {
		return mainId;
	}

	public void setMainId(int mainId) {
		this.mainId = mainId;
	}

	public GameInfo getGameInfo() {
		return gameInfo;
	}

	public void setGameInfo(GameInfo gameInfo) {
		this.gameInfo = gameInfo;
	}

	public String getCharacter() {
		return character;
	}

	public void setCharacter(String character) {
		this.character = character;
	}



}