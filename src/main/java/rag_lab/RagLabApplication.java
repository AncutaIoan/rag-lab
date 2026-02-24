package rag_lab;

import org.springframework.ai.model.postgresml.autoconfigure.PostgresMlEmbeddingAutoConfiguration;
import org.springframework.ai.vectorstore.pgvector.autoconfigure.PgVectorStoreAutoConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.jdbc.autoconfigure.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class, PostgresMlEmbeddingAutoConfiguration.class, PgVectorStoreAutoConfiguration.class })

public class RagLabApplication {

	static void main(String[] args) {
		SpringApplication.run(RagLabApplication.class, args);
	}

}
