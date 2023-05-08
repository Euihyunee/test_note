package com.example.tdd;

import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;
import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assumptions.assumeTrue;

class Study2Test {


    @DisplayName("스터디 만들기")
    @RepeatedTest(value = 10, name = "{displayName} {currentRepetition}/{totalRepetitions}" )
    void repeatTest(RepetitionInfo repetitionInfo) {
        System.out.println("test " + repetitionInfo.getCurrentRepetition() + "/" +
                repetitionInfo.getTotalRepetitions());
    }

    @DisplayName("스터디만들기")
    @ParameterizedTest(name ="{index} {displayName} message={0}")
    @ValueSource(strings = {"날씨가", "많이", "추워지고", "있네요."})
    void parameterizedTest(String message){
        System.out.println(message);
    }

//    @Test
//    @Tag("fast")
//    @DisplayName("스터디 만들기 😀")
//    void create_new_study(){
//        String test_env = System.getenv("TEST_ENV");
//        System.out.println(test_env);
//        assumeTrue("LOCAL".equalsIgnoreCase(test_env));
//
//        Study2 actual = new Study2(10);
//        assertThat(actual.getLimit()).isGreaterThan(0);
//    }

    @Test
    @Tag("slow")
    void create1() {
        System.out.println("create1");
    }

    @BeforeAll
    static void beforeAll() {
        System.out.println("before all");
    }

    @AfterAll
    static void afterAll() {
        System.out.println("after all");
    }

    @BeforeEach
    void beforeEach() {
        System.out.println("Before each");
    }

    @AfterEach
    void afterEach() {
        System.out.println("after each");
    }

}