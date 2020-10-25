package ru.patrakov.IWantUnderstandU.springweb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//@SpringBootApplication
public class SpringwebApplication {

	public static void main(String[] args) {

//		SpringApplication.run(SpringwebApplication.class, args);


		//AccountRepository.insert(new Account(5,"Somebody", "1234", "e@gmail.com", "20.10.2012", true));

		Account account = AccountRepository.get(5);
		System.out.println(account.getPassword());

		//ProductRepository.insert(new Product(0, "ПО для дома", "FamousCreator", "05.02.2016", 2000, "При нажатии на мой компьютер начинает его мыть"));
		//System.out.println(ProductRepository.get(0).getCreator());
	}

}
