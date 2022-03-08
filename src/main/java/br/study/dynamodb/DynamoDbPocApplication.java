package br.study.dynamodb;

import br.study.dynamodb.repository.DynamoDbTransacaoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DynamoDbPocApplication {



	public static void main(String[] args) {
		SpringApplication.run(DynamoDbPocApplication.class, args);
	}

}
