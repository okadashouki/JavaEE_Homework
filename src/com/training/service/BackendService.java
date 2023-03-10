package com.training.service;

import java.util.List;
import java.util.Set;

import com.training.dao.BackendDao;
import com.training.model.Goods;
import com.training.model.SalesReport;
import com.training.model.Select;


public class BackendService {
	
	private static BackendService backendService = new BackendService();

	private BackendService(){ }	
	
	public static BackendService getInstance(){
		return backendService;
	}
	
	private BackendDao bankDao = BackendDao.getInstance();

	public boolean updateGoods(Goods goods) {
		Goods goodsInDB = bankDao.shohinsagasu(goods.getGoodsID());
//		Goods goodsInDB = oracleDatas.get(0);
		goodsInDB.setGoodsQuantity(goods.getGoodsQuantity()+goodsInDB.getGoodsQuantity());
		goodsInDB.setGoodsPrice(goods.getGoodsPrice());
		goodsInDB.setStatus(goods.getStatus());

		boolean updateSuccess = bankDao.updateGoods(goodsInDB);

		return updateSuccess;
	}

	public int createGoods(Goods goods) {//ok
		
		int goodsID = bankDao.createGoods(goods);
		return goodsID;
		
	}

	public Set<SalesReport> queryOrderBetweenDate(String startdate,//ok
			String enddate) {
		while (startdate.indexOf("-")!=-1){
			startdate=startdate.replace("-", "/");
		}
		while (enddate.contains("-")){
			enddate=enddate.replace("-", "/");
		}
	
		Set<SalesReport> queryOrderBetweenDate=bankDao.queryOrderBetweenDate(startdate,
				enddate);
		
		return queryOrderBetweenDate;
	}
	//尋找條件內全部商品
	public List<Goods> getselectall(Select select) {//ok
		List<Goods> oracleDatas = bankDao.selectGoods(select,0,0);
		return oracleDatas;
	}
	//尋找條件內全部商品 10筆指定資料(透過頁數指定)
	public List<Goods> getselect(Select select) {//ok
		int x = select.getPageNo();
		if(x==0){
			x=1;
		}
		int made = x * 10 + 1;
		int kara = made - 10;
		List<Goods> oracleDatas = bankDao.selectGoods(select,made,kara);
		
		return oracleDatas;
	}
     //進入更新商品頁前要先取的所有商品資訊
	public List<Goods> getallgoods() {
		
		return bankDao.AllGoods();
	}

	public Goods getIDgoods(String id) {
		
	 return bankDao.shohinsagasu(id);
	}


}
