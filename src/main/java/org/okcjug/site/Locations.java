package org.okcjug.site;

import java.util.List;

import io.quarkiverse.roq.data.runtime.annotations.DataMapping;

@DataMapping(value = "locations", parentArray = true)
public record Locations(List<Location> list) {
    public record Location(
            String id,
            String name,
            String address,
            String room,
            String gmaps,
            String notes) { }
    public Location get(String id) {
        return list.stream().filter(s -> s.id.equals(id)).findFirst().orElse(null);
    }
}
