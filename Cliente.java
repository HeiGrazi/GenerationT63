package poo;

public class Cliente {
	
	private String nome;
    private String cpf;
    private String endereco;
    private String email;
    private int idade;
	
    public Cliente(String nome, String cpf, String endereco, String email, int idade) {
		this.nome = nome;
		this.cpf = cpf;
		this.endereco = endereco;
		this.email = email;
		this.idade = idade;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}
     
    public void visualizar() {
    	System.out.println("\nNome do cliente" +nome+ "Com o cpf" +cpf+ "Reside no endereco" +endereco+ "Email" +email+ "Idade" +idade);
    }

}

 
        
    
    