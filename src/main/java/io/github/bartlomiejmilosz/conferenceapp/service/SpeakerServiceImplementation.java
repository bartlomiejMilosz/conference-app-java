package io.github.bartlomiejmilosz.conferenceapp.service;

import io.github.bartlomiejmilosz.conferenceapp.model.Speaker;
import io.github.bartlomiejmilosz.conferenceapp.repository.SpeakerRepository;

import java.util.List;

public class SpeakerServiceImplementation implements SpeakerService {
    private SpeakerRepository speakerRepository;

    public SpeakerServiceImplementation(SpeakerRepository speakerRepository) {
        this.speakerRepository = speakerRepository;
    }

    @Override
    public List<Speaker> findAll() {
        return speakerRepository.findAll();
    }

    public void setSpeakerRepository(SpeakerRepository speakerRepository) {
        this.speakerRepository = speakerRepository;
    }
}
