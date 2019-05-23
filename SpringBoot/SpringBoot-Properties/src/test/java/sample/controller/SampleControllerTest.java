package sample.controller;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import sample.config.SampleProperties;

import java.util.HashMap;
import java.util.Map;

import static org.mockito.MockitoAnnotations.initMocks;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

/**
 * @author frank
 * @date 2019-04-13 10:55
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class SampleControllerTest {

    @InjectMocks
    private SampleController sampleController;

    @Mock
    private SampleProperties sampleProperties;

    private MockMvc mockMvc;

    @Before
    public void setup() {
        initMocks(this);
        this.mockMvc = MockMvcBuilders.standaloneSetup(sampleController).build();
    }

    @Test
    public void shouldGetProperties() throws Exception {

        Map<String, Object> result = new HashMap<>(2);
        result.put("parent", sampleProperties.getName());
        result.put("second", sampleProperties.getSecond().getName());

        //when(sampleProperties.getName()).thenReturn(value);

        mockMvc.perform(get("/properties"))
                .andExpect(status().isOk());

    }

}
