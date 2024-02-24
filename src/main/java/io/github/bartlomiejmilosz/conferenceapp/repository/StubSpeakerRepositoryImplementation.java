package io.github.bartlomiejmilosz.conferenceapp.repository;

import io.github.bartlomiejmilosz.conferenceapp.model.Speaker;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
@Repository("speakerRepository")
public class StubSpeakerRepositoryImplementation implements SpeakerRepository {
    @Override
    public List<Speaker> findAll() {
        List<Speaker> speakers = new ArrayList<>();
        Speaker speaker = new Speaker();

        speaker.setFirstName("Carol");
        speaker.setLastName("Racoon");

        speakers.add(speaker);

        return speakers;
    }
}
