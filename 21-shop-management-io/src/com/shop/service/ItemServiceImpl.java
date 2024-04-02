package com.shop.service;

import com.shop.dto.Item;
import com.shop.repo.ItemRepo;
import com.shop.repo.ItemRepoImpl;
import java.util.List;
public class ItemServiceImpl implements ItemService {
    private static ItemServiceImpl instance;
    private ItemRepo repo;
    private ItemServiceImpl() {
    	repo = ItemRepoImpl.getInstance(); 
    }
	public static ItemServiceImpl getInstance() {
		return instance = instance != null ? instance : new ItemServiceImpl();
	}
    @Override
    public void create(Item item) {
        System.out.println("Item Repo Created");
        repo.create(item);
    }

    @Override
    public void update(Item item) {
        repo.update(item);
    }

    @Override
    public Item findById(int id) {
        return repo.findById(id); // Placeholder, replace with actual implementation
    }

    @Override
    public List<Item> findAll() {
        return repo.findAll(); 
    }

    @Override
    public void delete(int id) {
        repo.delete(id);
    }
}
