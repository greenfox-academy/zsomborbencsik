package com.greenfox.json;

        import com.fasterxml.jackson.annotation.JsonInclude;
        import com.fasterxml.jackson.core.JsonProcessingException;
        import com.fasterxml.jackson.databind.ObjectMapper;
        import org.junit.Before;
        import org.junit.Test;
        import org.junit.runner.RunWith;
        import org.springframework.beans.factory.annotation.Autowired;
        import org.springframework.boot.test.context.SpringBootTest;
        import org.springframework.http.MediaType;
        import org.springframework.test.context.junit4.SpringRunner;
        import org.springframework.test.context.web.WebAppConfiguration;
        import org.springframework.test.web.servlet.MockMvc;
        import org.springframework.test.web.servlet.MockMvcBuilder;
        import org.springframework.test.web.servlet.setup.MockMvcBuilders;
        import org.springframework.web.bind.annotation.ExceptionHandler;
        import org.springframework.web.context.WebApplicationContext;
        import org.springframework.web.servlet.config.annotation.EnableWebMvc;

        import java.nio.charset.Charset;

        import static org.hamcrest.core.Is.is;
        import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
        import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;
        import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.*;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = JsonApplication.class)
@WebAppConfiguration
@EnableWebMvc
public class JsonTester {
    private MediaType contentType = new MediaType(MediaType.APPLICATION_JSON.getType(),
            MediaType.APPLICATION_JSON.getSubtype(),
            Charset.forName("utf8"));

    private MockMvc mockMvc;

    @Autowired
    private WebApplicationContext webApplicationContext;

    @Before
    public void setup() throws Exception {
        this.mockMvc = MockMvcBuilders.webAppContextSetup(webApplicationContext).build();
    }

    @Test
    public void testDoubling() throws Exception {
        mockMvc.perform(get("/doubling?input=4"))
                .andExpect(status().isOk())
                .andExpect(content().contentType(contentType))
                .andExpect(jsonPath("$.result", is(8)));
    }
    @Test
    public void testDoublingError() throws Exception {
        mockMvc.perform(get("/doubling"))
                .andExpect(status().isOk())
                .andExpect(content().contentType(contentType))
                .andExpect(jsonPath("$.error", is("Please provide an input!")));
    }
    @Test
    public void greeterTest() throws Exception {
        mockMvc.perform(get("/greeter?name=jani&title=god"))
                .andExpect(status().isOk())
                .andExpect(content().contentType(contentType))
                .andExpect(jsonPath("$.welcome_message", is("Oh, hi there jani, my dear god!")));
    }
    @Test
    public void greeterTestError() throws Exception {
        mockMvc.perform(get("/greeter?title=szar"))
                .andExpect(status().isOk())
                .andExpect(content().contentType(contentType))
                .andExpect(jsonPath("$.error", is("Please provide a name!")));
    }
    @Test
    public void appendATest() throws Exception {
        mockMvc.perform(get("/appenda/kak"))
                .andExpect(status().isOk())
                .andExpect(content().contentType(contentType))
                .andExpect(jsonPath("$.appended", is("kaka")));
    }

    @Test
    public void testDoUntil() throws Exception {
        mockMvc.perform(post("/dountil/factor")
                .contentType(MediaType.APPLICATION_JSON)
                .content("{\"until\": \"4\"}"))
                .andExpect(status().isOk())
                .andExpect(content().contentType(contentType))
                .andExpect(jsonPath("$.result", is(24)));
    }
    @Test
    public void arraysTest() throws Exception {
        mockMvc.perform(post("/arrays")
                .contentType(MediaType.APPLICATION_JSON)
                .content("{\n" +
                        "  \"what\": \"sum\",\n" +
                        "  \"numbers\": [1, 2, 5, 10]\n" +
                        "}"))
                .andExpect(status().isOk())
                .andExpect(content().contentType(contentType))
                .andExpect(jsonPath("$.result", is(18)));
    }
    @Test
    public void arraysTestError() throws Exception {
        mockMvc.perform(post("/arrays")
                .contentType(MediaType.APPLICATION_JSON)
                .content("{\"numbers\": [1, 2, 5, 10]}"))
                .andExpect(status().isOk())
                .andExpect(content().contentType(contentType))
                .andExpect(jsonPath("$.error", is("Please provide what to do with the numbers!")));
    }

}
