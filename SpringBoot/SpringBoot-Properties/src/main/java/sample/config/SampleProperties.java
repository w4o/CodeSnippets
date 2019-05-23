package sample.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.NotBlank;

/**
 * @author frank
 * @date 2019-04-13 10:41
 */
@ConfigurationProperties(prefix = "sample")
@Validated
@Data
public class SampleProperties {

    @NotBlank
    private String name;

    private Second second;

    @Data
    public static class Second {
        private String name;
    }
}
