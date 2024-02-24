package io.github.bartlomiejmilosz.conferenceapp.service;

import io.github.bartlomiejmilosz.conferenceapp.model.Speaker;
import io.github.bartlomiejmilosz.conferenceapp.repository.SpeakerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("speakerService")
@Scope(value = BeanDefinition.SCOPE_SINGLETON)
public class SpeakerServiceImplementation implements SpeakerService {
    private SpeakerRepository speakerRepository;

    public SpeakerServiceImplementation() {
        System.out.println("SpeakerServiceImplementation no args constructor");
    }

    @Autowired
    public SpeakerServiceImplementation(SpeakerRepository speakerRepository) {
        System.out.println("SpeakerServiceImplementation repository constructor");
        this.speakerRepository = speakerRepository;
    }

    @Override
    public List<Speaker> findAll() {
        return speakerRepository.findAll();
    }

    //@Autowired
    public void setSpeakerRepository(SpeakerRepository speakerRepository) {
        System.out.println("SpeakerServiceImplementation setter");
        this.speakerRepository = speakerRepository;
    }
}
