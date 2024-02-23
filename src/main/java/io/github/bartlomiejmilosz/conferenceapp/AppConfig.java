package io.github.bartlomiejmilosz.conferenceapp;

import io.github.bartlomiejmilosz.conferenceapp.repository.SpeakerRepository;
import io.github.bartlomiejmilosz.conferenceapp.repository.StubSpeakerRepositoryImplementation;
import io.github.bartlomiejmilosz.conferenceapp.service.SpeakerService;
import io.github.bartlomiejmilosz.conferenceapp.service.SpeakerServiceImplementation;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class AppConfig {
    @Bean(name = "speakerService")
    @Scope(value = BeanDefinition.SCOPE_SINGLETON)
    public SpeakerService getSpeakerService() {
        var service = new SpeakerServiceImplementation(getSpeakerRepository());
        //service.setSpeakerRepository(getSpeakerRepository());
        return service;
    }

    @Bean(name = "speakerRepository")
    public SpeakerRepository getSpeakerRepository() {
        return new StubSpeakerRepositoryImplementation();
    }
}
