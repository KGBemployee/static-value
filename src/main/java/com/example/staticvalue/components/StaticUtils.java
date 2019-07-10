package com.example.staticvalue.components;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class StaticUtils {

    public static String url;

    public static String path;

    @Value("${salesforce-service.url}")
    public void setUrl(String url) {
        log.info("setting url to: {}", url);
        StaticUtils.url = url;
    }

    @Value("${salesforce-service.path}")
    public void setPath(String path) {
        log.info("setting path to: {}", path);
        StaticUtils.path = path;
    }
}
