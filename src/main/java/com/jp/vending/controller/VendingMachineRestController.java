package com.jp.vending.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.jp.vending.dto.APIdata;
import com.jp.vending.dto.ResponseData;

@RestController
public class VendingMachineRestController {
	@PostMapping("/api")
	public ResponseData purchaseItem(@RequestBody List<APIdata> requestItems) {
		ResponseData responseData = new ResponseData();
		int total = 0;
		for (APIdata api : requestItems) {
			total = total + api.getPrice();
		}
		if (requestItems.size() > 0) {
			APIdata data = requestItems.get(0);
			if (data.getAmount() != null ) {
				System.out.println(total<data.getAmount());
				data.setChange(data.getAmount() - total);
				responseData.setApiData(data);
				responseData.setStatusCode(200);
				responseData.setStatus(HttpStatus.OK);
				responseData.setMessage("OK");
				if(data.getAmount()<total) {
					data.setChange(null);
					responseData.setApiData(data);
					responseData.setStatusCode(206);
					responseData.setStatus(HttpStatus.NO_CONTENT);
					responseData.setMessage("量が足りない");
				}
			} else if (data.getAmount() == null) {
				data.setChange(null);
				responseData.setApiData(data);
				responseData.setStatusCode(204);
				responseData.setStatus(HttpStatus.NO_CONTENT);
				responseData.setMessage("入力金額は必須です！");
			}
		} else {
			APIdata data = new APIdata();
			data.setChange(null);
			responseData.setApiData(data);
			responseData.setStatusCode(205);
			responseData.setStatus(HttpStatus.NO_CONTENT);
			responseData.setMessage("項目を選択してください");
		}

		return responseData;
	}
}
