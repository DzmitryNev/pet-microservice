package com.shop.controllers;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.shop.entity.Good;
import com.shop.entity.ObjectShop;

@RestController
@RequestMapping("/shop")
public class MainController {

	@RequestMapping("/")
	public ObjectShop getShopList() {
		ObjectShop objectShop = new ObjectShop();
		objectShop.setName("Name1");
		objectShop.setAddress("Address1");

		Good good1 = new Good();
		good1.setName("Good1");
		good1.setPrice(22D);
		good1.setDescription("Super good");
		List<Good> goods = Arrays.asList(good1);

		objectShop.setGoods(goods);
		return objectShop;
	}

}
