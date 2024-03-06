package me.amiralles;

import dev.langchain4j.service.UserMessage;
import io.quarkiverse.langchain4j.RegisterAiService;

@RegisterAiService
public interface AIChatService {

    public String chat(@UserMessage String text);

}
