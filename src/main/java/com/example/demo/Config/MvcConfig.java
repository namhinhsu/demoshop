package com.example.demo.Config;

import java.nio.file.Path;
import java.nio.file.Paths;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class MvcConfig implements WebMvcConfigurer {

	@Override
	public void addResourceHandlers(ResourceHandlerRegistry registry) {
		Path productUploadDir = Paths.get("./product-image");
		String productUploadPath = productUploadDir.toFile().getAbsolutePath();
		
		registry.addResourceHandler("/product-image/**").addResourceLocations("file:/" + productUploadPath + "/");
	}

	
}
