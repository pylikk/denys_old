package ua.com.tkachenko.rest;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;
import ua.com.tkachenko.model.User;

import java.io.IOException;

public class CustomUserDeserializer extends StdDeserializer<User> {

    protected CustomUserDeserializer(Class<?> vc) {
        super(vc);
    }

    public CustomUserDeserializer () {
        this(null);
    }


    @Override
    public User deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException, JsonProcessingException {

        ObjectMapper mapper = new ObjectMapper();

        JsonNode node = jsonParser.getCodec().readTree(jsonParser);
//        JsonNode skillsNode = node.get("skills");



        int id = node.get("id").asInt();

        String name = node.get("name").asText();

        System.out.println(id+name);

        User user = new User();
        user.setId(id);
        user.setName(name);

        System.out.println("ok");

        return user;
    }
}
