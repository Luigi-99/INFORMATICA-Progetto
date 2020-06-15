package com.esame.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.esame.demo.database.DatabaseClass;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		DatabaseClass.getDataset("https://graph.instagram.com/api/media?fields=id,media_type,media_url&access_token=IGQVJXcDIwV0l5dWpoNEVDZAnQwUXNNUXR5dHpDX29MQnVnSUVIQktUR3M2NFBST0syN3drVVNaR2UxbDRoZAVZAXbWQ3UlRWeTBGT1FuNDIzdFp2ZAkhZASzF4UUE1V2NPTHRKWjQzaHREbHRPUThncEcxMAZDZD");
		SpringApplication.run(DemoApplication.class, args);
	}

}
