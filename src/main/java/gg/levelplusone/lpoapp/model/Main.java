package gg.levelplusone.lpoapp.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the main database table.
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

	private String character;

	//bi-directional many-to-one association to GameInfo
	@ManyToOne
	@JoinColumn(name="game_id")
	private GameInfo gameInfo;

	public Main() {
	}

	public int getMainId() {
		return this.mainId;
	}

	public void setMainId(int mainId) {
		this.mainId = mainId;
	}

	public String getCharacter() {
		return this.character;
	}

	public void setCharacter(String character) {
		this.character = character;
	}

	public GameInfo getGameInfo() {
		return this.gameInfo;
	}

	public void setGameInfo(GameInfo gameInfo) {
		this.gameInfo = gameInfo;
	}

}