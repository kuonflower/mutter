package model;

import java.io.Serializable;

public class SiteEV implements Serializable {

	private int like;
	private int dislike;

	public SiteEV() {

		this.like = 0;
		this.dislike = 0;
		// TODO 自動生成されたコンストラクター・スタブ
	}

	public int getLike() {
		return like;
	}

	public void setLike(int like) {
		this.like = like;
	}

	public int getDislike() {
		return dislike;
	}

	public void setDislike(int dislike) {
		this.dislike = dislike;
	}







}
