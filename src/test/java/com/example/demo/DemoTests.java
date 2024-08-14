package com.example.demo;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.hamcrest.CoreMatchers;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultActions;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import java.util.Arrays;

import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;


@WebMvcTest(controllers = ReviewController.class)
@AutoConfigureMockMvc(addFilters = false)
public class DemoTests { // test suite
    @Autowired
    private MockMvc mockMvc;

    // Init data your data for test suite
    @BeforeEach
    public void init() {
        // init data for all test
//        pokemon = Pokemon.builder().name("pikachu").type("electric").build();
    }

    // Your test case here
    @Test
    public void ReviewController_GetReviewsByPokemonId_ReturnReviewDto() throws Exception {
        // your test code here
    }

    @AfterAll
    public static void done() {
        // Làm sạch một lần sau tất cả các bài kiểm thử
    }

    @Disabled
    public void testDisabled() {
        // Bài kiểm thử này sẽ bị bỏ qua
    }

    @ParameterizedTest
//    @ValueSource(strings = { "apple", "banana", "orange" })
    @CsvFileSource(resources = "")
    public void testWithParameters(String fruit) {
        // Bài kiểm thử sẽ chạy nhiều lần với mỗi giá trị trong ValueSource
    }



}
