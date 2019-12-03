package com.example.GetSaucedApp;

import com.example.GetSaucedApp.models.HotSauce;
import com.example.GetSaucedApp.models.data.HotSauceDao;
import com.example.GetSaucedApp.models.data.HotSauceDaoImpl;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GetSaucedAppApplication {

	public static void main(String[] args) {

		SpringApplication.run(GetSaucedAppApplication.class, args);

		HotSauceDao hotSauceDao = new HotSauceDaoImpl();

	}

}
