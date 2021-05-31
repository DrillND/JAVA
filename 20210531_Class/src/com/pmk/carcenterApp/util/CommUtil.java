package com.pmk.carcenterApp.util;

import java.text.DecimalFormat;

public class CommUtil {
	public static String getKorMoney(int money) {
		
		DecimalFormat dc = 
				new DecimalFormat("###,###,###,###");
		//System.out.println("화폐단위: ￦"+dc.format(money)+"원");
		return "￦" + dc.format(money)+"원";
	}
}
