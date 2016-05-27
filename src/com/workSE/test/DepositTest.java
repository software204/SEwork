package com.workSE.test;

import com.workSE.service.DepositService;

public class DepositTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DepositService  depositService = new DepositService();
		System.out.println(depositService.updatePrincipal("621114", "200"));
	}

}
