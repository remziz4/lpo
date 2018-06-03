package gg.levelplusone.lpoapp.model;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the game_info database table.
 * 
 */
@Embeddable
public class GameInfoPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="game_id")
	private int gameId;

	@Column(name="user_id", insertable=false, updatable=false)
	private int userId;

	public GameInfoPK() {
	}
	public int getGameId() {
		return this.gameId;
	}
	public void setGameId(int gameId) {
		this.gameId = gameId;
	}
	public int getUserId() {
		return this.userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof GameInfoPK)) {
			return false;
		}
		GameInfoPK castOther = (GameInfoPK)other;
		return 
			(this.gameId == castOther.gameId)
			&& (this.userId == castOther.userId);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.gameId;
		hash = hash * prime + this.userId;
		
		return hash;
	}
}