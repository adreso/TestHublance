package com.hublance.application.controllers.rest;

import com.hublance.prices.domain.model.PricesRequestDTO;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;

import java.sql.Timestamp;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class PricesControllerTest {

    private PricesRequestDTO test1;
    private PricesRequestDTO test2;
    private PricesRequestDTO test3;
    private PricesRequestDTO test4;
    private PricesRequestDTO test5;


    private TestRestTemplate restTemplate;

    @Autowired
    PricesControllerTest(TestRestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }


    @BeforeEach
    void setUp(){
        test1 = PricesRequestDTO.builder()
                .dateApplication(Timestamp.valueOf("2020-06-14 16:00:00"))
                .productId(35455)
                .brandId(1)
                .build();
        test2 = PricesRequestDTO.builder()
                .dateApplication(Timestamp.valueOf("2020-06-14 16:00:00"))
                .productId(35455)
                .brandId(1)
                .build();
        test3 = PricesRequestDTO.builder()
                .dateApplication(Timestamp.valueOf("2020-06-14 21:00:00"))
                .productId(35455)
                .brandId(1)
                .build();
        test4 = PricesRequestDTO.builder()
                .dateApplication(Timestamp.valueOf("2020-06-15 10:00:00"))
                .productId(35455)
                .brandId(1)
                .build();
        test5 = PricesRequestDTO.builder()
                .dateApplication(Timestamp.valueOf("2020-06-16 21:00:00"))
                .productId(35455)
                .brandId(1)
                .build();
    }

    @Test
    @DisplayName("Test 1")
    void test1() throws Exception {
            ResponseEntity<List> response =
                restTemplate.postForEntity("/api/prices", test1, List.class);
        assertEquals(HttpStatus.OK, response.getStatusCode());
        assertEquals(MediaType.APPLICATION_JSON, response.getHeaders().getContentType());
        assertNotNull(response.getBody());
        assertEquals(2, response.getBody().size());
    }

    @Test
    @DisplayName("Test 2")
    void test2() throws Exception {
        ResponseEntity<List> response =
                restTemplate.postForEntity("/api/prices", test2, List.class);
        assertEquals(HttpStatus.OK, response.getStatusCode());
        assertEquals(MediaType.APPLICATION_JSON, response.getHeaders().getContentType());
        assertNotNull(response.getBody());
        assertEquals(2, response.getBody().size());
    }

    @Test
    @DisplayName("Test 3")
    void test3() throws Exception {
        ResponseEntity<List> response =
                restTemplate.postForEntity("/api/prices", test3, List.class);
        assertEquals(HttpStatus.OK, response.getStatusCode());
        assertEquals(MediaType.APPLICATION_JSON, response.getHeaders().getContentType());
        assertNotNull(response.getBody());
        assertEquals(1, response.getBody().size());
    }

    @Test
    @DisplayName("Test 4")
    void test4() throws Exception {
        ResponseEntity<List> response =
                restTemplate.postForEntity("/api/prices", test4, List.class);
        assertEquals(HttpStatus.OK, response.getStatusCode());
        assertEquals(MediaType.APPLICATION_JSON, response.getHeaders().getContentType());
        assertNotNull(response.getBody());
        assertEquals(2, response.getBody().size());
    }

    @Test
    @DisplayName("Test 5")
    void test5() throws Exception {
        ResponseEntity<List> response =
                restTemplate.postForEntity("/api/prices", test5, List.class);
        assertEquals(HttpStatus.OK, response.getStatusCode());
        assertEquals(MediaType.APPLICATION_JSON, response.getHeaders().getContentType());
        assertNotNull(response.getBody());
        assertEquals(2, response.getBody().size());
    }


}