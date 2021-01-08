package com.example.jeyamani.Service;

import com.example.jeyamani.ModelUser.UserTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.*;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;

@Service
public class TemplateService {

    @Autowired
    RestTemplate restTemplate;


    public void createUser(UserTemplate template)
    {
        HttpHeaders headers = new HttpHeaders();

        headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
        HttpEntity<UserTemplate> entity = new HttpEntity<UserTemplate>(template, headers);

        ResponseEntity<UserTemplate> responseEntity =  restTemplate
                .exchange("http://localhost:7000/user", HttpMethod.POST, entity, UserTemplate.class);

    }

    public UserTemplate retreiveUserById( int id)
    {
        HttpHeaders headers = new HttpHeaders();
        headers.set("template","123");
        headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
        HttpEntity<String> entity = new HttpEntity<String>(headers);

        ResponseEntity<UserTemplate> responseEntity = restTemplate
                .exchange("http://localhost:7000/user/"+id, HttpMethod.GET, entity, UserTemplate.class);

        return responseEntity.getBody();
    }

    public List<UserTemplate> retreiveAllUsers(){
        HttpHeaders headers = new HttpHeaders();
        headers.set("template","123");
        headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
        HttpEntity<String> entity = new HttpEntity<String>(headers);

        ResponseEntity<List> responseEntity = restTemplate
                .exchange("http://localhost:7000/user", HttpMethod.GET, entity, List.class);
        return (List<UserTemplate>) responseEntity.getBody();
    }

}
