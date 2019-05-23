package sample.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import sample.config.SampleProperties;

import java.util.HashMap;
import java.util.Map;

/**
 * @author frank
 * @date 2019-04-13 10:45
 */
@RestController
public class SampleController {

    private final SampleProperties sampleProperties;

    @Autowired
    public SampleController(SampleProperties sampleProperties) {
        this.sampleProperties = sampleProperties;
    }

    @RequestMapping(value = "/properties")
    Object getProperties() {
        Map<String, Object> result = new HashMap<>(2);
        result.put("parent", sampleProperties.getName());
        result.put("second", sampleProperties.getSecond().getName());
        return result;
    }
}
