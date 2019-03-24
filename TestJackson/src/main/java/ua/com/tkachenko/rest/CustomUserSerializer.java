package ua.com.tkachenko.rest;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;
import ua.com.tkachenko.model.Skill;
import ua.com.tkachenko.model.User;

import java.io.IOException;

public class CustomUserSerializer extends StdSerializer<User>{

    public CustomUserSerializer() {
        this(null);
    }

    protected CustomUserSerializer(Class<User> t) {
        super(t);
    }

    @Override
    public void serialize(User user, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) throws IOException {

        jsonGenerator.writeStartObject();

        jsonGenerator.writeStringField("id", ""+user.getId());
        jsonGenerator.writeStringField("name", user.getName());

        jsonGenerator.writeArrayFieldStart("skills");

//        for (Skill skill : user.getSkills()) {
//            jsonGenerator.writeStartObject();
//
//            jsonGenerator.writeStringField("id",""+skill.getId());
//            jsonGenerator.writeStringField("name", skill.getName());
//
//            jsonGenerator.writeEndObject();
//        }

        jsonGenerator.writeEndArray();

        jsonGenerator.writeEndObject();
    }
}
