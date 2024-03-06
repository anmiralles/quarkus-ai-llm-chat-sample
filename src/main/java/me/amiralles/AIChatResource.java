package me.amiralles;

import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;


@Path("/chat")
public class AIChatResource {

    @Inject
    AIChatService aiChatService;

    @POST
    @Consumes(MediaType.TEXT_PLAIN)
    @Produces(MediaType.TEXT_PLAIN)
    public String chat(String text) {
        return aiChatService.chat(text);
    }
}
