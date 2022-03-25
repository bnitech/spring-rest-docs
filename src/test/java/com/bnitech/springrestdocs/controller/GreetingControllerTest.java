package com.bnitech.springrestdocs.controller;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;

@SpringBootTest
@AutoConfigureMockMvc
class GreetingControllerTest {

  @Autowired
  private MockMvc mockMvc;

  @Test
  void 샘플_테스트() throws Exception {
    // region given
    String name = "Dongbin";
    // endregion

    // region when
    final MvcResult result = mockMvc.perform(
        get("/greeting").queryParam("name", name)
    ).andReturn();
    // endregion

    // region then
    assertEquals(name, result.getResponse().getContentAsString());
    // endregion
  }
}
