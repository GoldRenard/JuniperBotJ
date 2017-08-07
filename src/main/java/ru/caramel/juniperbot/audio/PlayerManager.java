package ru.caramel.juniperbot.audio;

import com.sedmelluq.discord.lavaplayer.player.DefaultAudioPlayerManager;
import com.sedmelluq.discord.lavaplayer.source.AudioSourceManagers;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;

@Service
public class PlayerManager extends DefaultAudioPlayerManager {

    @PostConstruct
    public void init() {
        AudioSourceManagers.registerRemoteSources(this);
        AudioSourceManagers.registerLocalSource(this);
    }
}
