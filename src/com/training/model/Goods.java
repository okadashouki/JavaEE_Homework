package com.training.model;
import java.math.BigDecimal;
public class Goods {
	private String goodsID;
	private String goodsName;
	private int goodsPrice;
	private int goodsQuantity;
	private String goodsImageName;
	private String status;
	private String DESCRIPTIO;
	
	@Override
	public String toString() {
		return "Goods [goodsID=" + goodsID + ", goodsName=" + goodsName
				+ ", goodsPrice=" + goodsPrice + ", goodsQuantity="
				+ goodsQuantity + ", goodsImageName=" + goodsImageName
				+ ", status=" + status + "]";
	}

	public String getGoodsID() {
		return goodsID;
	}

	public void setGoodsID(String goodsID) {
		this.goodsID = goodsID;
	}

	public String getGoodsName() {
		return goodsName;
	}

	public void setGoodsName(String goodsName) {
		this.goodsName = goodsName;
	}

	public int getGoodsPrice() {
		return goodsPrice;
	}

	public void setGoodsPrice(int goodsPrice) {
		this.goodsPrice = goodsPrice;
	}

	public int getGoodsQuantity() {
		return goodsQuantity;
	}

	public void setGoodsQuantity(int goodsQuantity) {
		this.goodsQuantity = goodsQuantity;
	}

	public String getGoodsImageName() {
		return goodsImageName;
	}

	public void setGoodsImageName(String goodsImageName) {
		this.goodsImageName = goodsImageName;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getDESCRIPTIO() {
		return DESCRIPTIO;
	}

	public void setDESCRIPTIO(String dESCRIPTIO) {
		DESCRIPTIO = dESCRIPTIO;
	}

//	public static void add(Goods good) {
//		// TODO Auto-generated method stub
//		
//	}
//	
}
