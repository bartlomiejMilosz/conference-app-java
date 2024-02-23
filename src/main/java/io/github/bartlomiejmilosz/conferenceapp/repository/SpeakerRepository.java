package io.github.bartlomiejmilosz.conferenceapp.repository;

import io.github.bartlomiejmilosz.conferenceapp.model.Speaker;

import java.util.List;

public interface SpeakerRepository {
    List<Speaker> findAll();
}
