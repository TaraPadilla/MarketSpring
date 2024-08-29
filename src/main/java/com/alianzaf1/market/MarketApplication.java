package com.alianzaf1.market;

import com.alianzaf1.market.persistence.repository.EmpresaCrudRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MarketApplication implements CommandLineRunner {

	@Autowired
    private EmpresaCrudRepository empresa;

	public static void main(String[] args) {
		SpringApplication.run(MarketApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		empresa.findAll().forEach(p ->
			System.out.println("Nombre: " + p.getNombre())
		);
	}

}
