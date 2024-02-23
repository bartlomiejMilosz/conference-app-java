package io.github.bartlomiejmilosz.conferenceapp.service;

import io.github.bartlomiejmilosz.conferenceapp.model.Speaker;

import java.util.List;

public interface SpeakerService {
    List<Speaker> findAll();
}
