package org.okcjug.site;

import io.quarkiverse.qute.web.asciidoc.runtime.AsciidocConverter;
import io.quarkus.qute.TemplateExtension;
import org.jsoup.Jsoup;

@TemplateExtension
public class Extensions {
    public static String convert(String rawText) {
        return new AsciidocConverter().apply(rawText);
    }

    public static String stripHtml(String rawText) {
        return Jsoup.parse(rawText).text();
    }
}
