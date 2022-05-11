package com.example.vfcase.controller;

import com.example.vfcase.VfCaseApplication;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.http.*;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

/**
 * @author created by cengizhan on 11.05.2022
 */
@SpringBootTest(classes = VfCaseApplication.class, webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class CarControllerIntegrationTest {
    @LocalServerPort
    private int port;
    @Autowired
    private TestRestTemplate restTemplate;
    private HttpHeaders headers;

    @BeforeEach
    void init(){
        headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
    }

    @Test
    public void test_createSedanTypeCar(){
        HttpEntity<String> request = new HttpEntity<String>("\"SEDAN\"", headers);
        ResponseEntity<String> responseEntity = this.restTemplate
                .postForEntity("http://localhost:" + port + "/api/car", request, String.class);

        assertEquals(HttpStatus.OK, responseEntity.getStatusCode());
        assertNotNull(responseEntity.getBody());
        assertEquals("Sedan Car has produced.",responseEntity.getBody());
    }

    @Test
    public void test_createCabrioTypeCar(){
        HttpEntity<String> request = new HttpEntity<String>("\"CABRIO\"", headers);
        ResponseEntity<String> responseEntity = this.restTemplate
                .postForEntity("http://localhost:" + port + "/api/car", request, String.class);

        assertEquals(HttpStatus.OK, responseEntity.getStatusCode());
        assertNotNull(responseEntity.getBody());
        assertEquals("Cabrio Car has produced.",responseEntity.getBody());
    }

    @Test
    public void test_createOtherTypeCar(){
        HttpEntity<String> request = new HttpEntity<String>("\"HATCHBACK\"", headers);
        ResponseEntity<String> responseEntity = this.restTemplate
                .postForEntity("http://localhost:" + port + "/api/car", request, String.class);

        assertEquals(HttpStatus.BAD_REQUEST, responseEntity.getStatusCode());
    }
}
