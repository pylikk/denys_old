package ua.com.tkachenko.rest;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;
import ua.com.tkachenko.model.Skill;
import ua.com.tkachenko.model.User;

import java.io.IOException;

public class CustomSkillSerializer extends StdSerializer<Skill> {

    public CustomSkillSerializer () {
        this(null);
    }

    protected CustomSkillSerializer(Class<Skill> t) {
        super(t);
    }

    @Override
    public void serialize(Skill skill, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) throws IOException {

        jsonGenerator.writeStartObject();

        jsonGenerator.writeStringField("id", ""+skill.getId());
        jsonGenerator.writeStringField("name", skill.getName());

        jsonGenerator.writeArrayFieldStart("users");
        for (User user : skill.getUsers()) {
            jsonGenerator.writeStartObject();

            jsonGenerator.writeStringField("id", ""+user.getId());
            jsonGenerator.writeStringField("name", user.getName());

            jsonGenerator.writeEndObject();
        }
        jsonGenerator.writeEndArray();

        jsonGenerator.writeEndObject();
    }
}
