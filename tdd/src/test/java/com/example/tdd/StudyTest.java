package com.example.tdd;

import org.junit.jupiter.api.*;

import java.time.Duration;

import static org.junit.jupiter.api.Assertions.*;

class StudyTest {


    @Test
    void create(){

        //TODO 이 코드가 조건 안의 시간보다 늦게 끝나면 예외를 발생시킴
        assertTimeout(Duration.ofMillis(100), ()-> {
            new Study(10);
            Thread.sleep(300);
        });
        // TODO ThreadLocal을 사용하는 로직이 있으면 assertTimeoutPreemptively를 사용하면 안 됨


//        // TODO 이 코드를 실행했을 때 예외가 발생하는지 확인할 수 있다.
//        IllegalArgumentException exception =
//                assertThrows(IllegalArgumentException.class, () -> new Study(-10));
//        assertEquals("limit은 0보다 커야 한다. ", exception.getMessage());

//        assertAll(
//                //TODO null인지 확인하는 테스트
//                () -> assertNotNull(study),
//                //TODO 1번째 : 기대하는 값, 2번째 : 실제 값, 바뀌어도 동작하는 데는 문제 없지만 그냥 잘 쓰자
//                () -> assertEquals(StudyStatus.DRAFT, study.getStatus(),
//                        () -> "스터디를 처음 만들면 " + StudyStatus.DRAFT + " 상태다."),
//                () -> assertTrue(study.getLimit() > 0, "스터디 최대 참석 가능 인원은 10명이다.")
//        );
//        System.out.println("create");
    }

    @Test
    void create1(){
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