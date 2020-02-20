package com.project.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import entity.ClienteEntity;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;

@Controller
@RequestMapping(value="/cadastro")
public class CadastroController {
	
	@RequestMapping(method = RequestMethod.POST)
	public String cadastrar(ClienteEntity clienteEntity, HttpServletRequest request) throws IOException{
		
		OkHttpClient client = new OkHttpClient();
		
		RequestBody body = RequestBody.create(okhttp3.MediaType.parse("application/json; charset=utf-8"), 
			clienteEntity.toString());
		
		Request apiRequest = new Request.Builder()
            .header("Content-Type", "application/json")
            .url("http://localhost:9090/customers/add")
            .post(body)
            .build();
		
		Response response = client.newCall(apiRequest).execute();
		
		if(response.code() == 202){
			//OK
		}
		
		return null;
	}
}
