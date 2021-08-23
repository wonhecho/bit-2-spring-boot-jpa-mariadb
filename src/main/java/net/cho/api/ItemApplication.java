package net.cho.api;

import net.cho.api.Item.domain.Item;
import net.cho.api.Item.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ItemApplication  {
	//@Autowired
	//ItemService itemService;

	public static void main(String[] args) {
		SpringApplication.run(ItemApplication.class, args);
	}

/*	@Override
	public void run(String... args) throws Exception{
//		itemService.deleteAll();
		itemService.save(new Item("삼성", "갤럭시 3", "흑색"));
		itemService.save(new Item("애플", "아이폰 3", "흰색"));
		itemService.save(new Item("샤오미", "홍미 3", "적색"));
		for(Item i : itemService.findAll())
		{
			System.out.println(i.toString());
		}

	}*/

}
