package entity;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ClienteEntity {
	@SerializedName("id")
    @Expose
    private int id;
	
	@SerializedName("nome")
    @Expose
    private String nome;
	
	@SerializedName("email")
	@Expose
	private String email;

	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}




    @Override
    public String toString() {
    	
        return "{" +
                "  \"id\" : \"" + id + "\"," +
                "  \"nome\" : \"" + nome + "\"," +
                "  \"email\" : \"" + email + "\"" +
                "}";
    }
    
}
