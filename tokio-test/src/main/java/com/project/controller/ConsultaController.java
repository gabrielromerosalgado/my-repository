package com.project.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.google.gson.Gson;

import entity.ClienteEntity;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

@Controller
@RequestMapping(value="/consulta")
public class ConsultaController {
	
	@RequestMapping(method = RequestMethod.GET)
	public String consultaClientes(HttpServletRequest request, Model model) throws IOException{
		
		OkHttpClient client = new OkHttpClient();

        Request apiRequest = new Request.Builder()
                .header("Content-Type", "text/xml")
                .url("http://locahost:9090/customers")
                .get()
                .build();

        Response response = client.newCall(apiRequest).execute();
        String jsonResponse = response.body().string();
        
        Gson gson = new Gson();
        
        ClienteEntity[] clienteEntity = gson.fromJson(jsonResponse, ClienteEntity[].class);
        
        if(clienteEntity != null){
        	List<ClienteEntity> clientes = new ArrayList<ClienteEntity>();	
        	
        	for(ClienteEntity cliente : clienteEntity){
        		clientes.add(cliente);
        	}
        	
        	model.addAttribute("clientes", clientes);
        }
        
		
		return null;
	}
}
