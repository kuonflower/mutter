package model;

public class SiteEVLogic {

	public SiteEVLogic() {
		// TODO 自動生成されたコンストラクター・スタブ
	}

	public void like(SiteEV siteEV){

		int count = siteEV.getLike();
		siteEV.setLike(count + 1);
	}

	public void dislike(SiteEV siteEV){

		int count = siteEV.getDislike();
		siteEV.setDislike(count + 1);

	}

}
