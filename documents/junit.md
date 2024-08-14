```java
@WebMvcTest(controllers = ReviewController.class)
@AutoConfigureMockMvc(addFilters = false)
public class DemoTests { // test suite
    @Autowired
    private MockMvc mockMvc;

    // Init data your data for test suite
    @BeforeEach
    public void init() {
        // init data for all test
        pokemon = Pokemon.builder().name("pikachu").type("electric").build();
    }

    // Your test case here
    @Test
    public void ReviewController_GetReviewsByPokemonId_ReturnReviewDto() throws Exception {
        // your test code here
    }
}

```