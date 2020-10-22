package model;

import java.io.Serializable;

public class Fruit2 implements Serializable {

	private String name;
	private int price;

	public Fruit2() {
		// TODO 自動生成されたコンストラクター・スタブ
	}

	public Fruit2(String name, int price) {
		super();
		this.name = name;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}



}
