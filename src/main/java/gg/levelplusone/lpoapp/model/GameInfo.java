package gg.levelplusone.lpoapp.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the game_info database table.
 * 
 */
@Entity
@Table(name="game_info")
@NamedQuery(name="GameInfo.findAll", query="SELECT g FROM GameInfo g")
public class GameInfo implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="game_id")
	private int gameId;

	@Column(name="competing_since")
	private String competingSince;

	private String game;

	//bi-directional many-to-one association to User
	@ManyToOne
	@JoinColumn(name="user_id")
	private User user;

	//bi-directional many-to-one association to Main
	@OneToMany(mappedBy="gameInfo")
	private List<Main> mains;

	public GameInfo() {
	}

	public int getGameId() {
		return this.gameId;
	}

	public void setGameId(int gameId) {
		this.gameId = gameId;
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

	public List<Main> getMains() {
		return this.mains;
	}

	public void setMains(List<Main> mains) {
		this.mains = mains;
	}

	public Main addMain(Main main) {
		getMains().add(main);
		main.setGameInfo(this);

		return main;
	}

	public Main removeMain(Main main) {
		getMains().remove(main);
		main.setGameInfo(null);

		return main;
	}

}