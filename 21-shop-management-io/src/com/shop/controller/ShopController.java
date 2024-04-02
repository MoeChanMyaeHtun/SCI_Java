package com.shop.controller;

import com.shop.service.ItemServiceImpl;
import com.shop.util.ShopUtil;
import com.shop.dto.ItemOperation;
import java.util.Arrays;
import java.util.List;

import com.shop.service.ItemService;

public class ShopController {
	private ItemService service;
	public ShopController() {
		service = ItemServiceImpl.getInstance();
	}
	public void open() {
		int menu =showMenu();
		doOperation(ItemOperation.values()[menu - 1]);
	}
	private void doOperation(ItemOperation opt) {
		switch (opt) {
		case ShowAll: {
			showAll();
			break;
		}
		case Create: {
			create();
			break;
		}
		case Update: {
			create();
			break;
		}
		case Delete: {
			create();
			break;
		}
		case Search: {
			create();
			break;
		}
		default:
			throw new IllegalArgumentException("unexpected value: " + opt);
		}
	}
	private void showAll() {
		System.out.println("show all");
		
	}
	private void create() {
		System.out.println("create");
		
	}
	private int showMenu() {
		Arrays.asList(ItemOperation.values()).forEach(System.out::println);
		return ShopUtil.getInt("Select Menu :");
	}
}
