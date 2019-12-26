package com.example.FileUD;
import com.example.FileUD.property.FileStorageProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties({
    FileStorageProperties.class
})
public class FileUdApplication {

	public static void main(String[] args) {
		SpringApplication.run(FileUdApplication.class, args);
	}

}
