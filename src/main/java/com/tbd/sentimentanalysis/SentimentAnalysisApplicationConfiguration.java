package com.tbd.sentimentanalysis;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SentimentAnalysisApplicationConfiguration {
	@Bean
	public Classifier classifier() {
		return new Classifier();
	}
}
