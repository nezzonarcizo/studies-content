class Funcionario{
	private String nome;
	private String cpf;
	private int idade;
	
	public Funcionario(String nome){
		this.nome = nome;
	}
	
	public Funcionario(){
	}
	
	public String getNome(){
		return this.nome;
	}
	
	public void setNome(String nome){
		this.nome = nome;
	}
	
	public String getCpf(){
		return this.cpf;
	}
	
	public void setCpf(String cpf){
		this.cpf = cpf;
	}
	
	public int getIdade(){
		return this.idade;
	}
	
	public void setIdade(int idade){
		this.idade = idade;
	}
}