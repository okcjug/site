package org.okcjug.site;

import java.util.List;

import io.quarkiverse.roq.data.runtime.annotations.DataMapping;

@DataMapping(value = "speakers", parentArray = true)
public record Speakers(List<Speaker> list) {

    public record Speaker(String id, String name, String bio, String image) {}

    public Speaker get(String id) {
        return list.stream().filter(s -> s.id.equals(id)).findFirst()
            .orElse(new Speaker("", "No speaker", "No Speaker", "logo-notext.png"));
    }
}
