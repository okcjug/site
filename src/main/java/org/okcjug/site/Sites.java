package org.okcjug.site;

import java.util.List;

import io.quarkiverse.roq.data.runtime.annotations.DataMapping;

@DataMapping(value = "sites", parentArray = true)
public record Sites(List<Site> list) {
    public record Site(String name, String url, String icon) { }
}
