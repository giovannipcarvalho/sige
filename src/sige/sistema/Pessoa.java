package sige.sistema;

public abstract class Pessoa {

	private static int numeroPessoa = 0;

	public final int idPessoa;

	protected String nome;
	protected String cpf;
	protected String senha;
	protected String rg;
	protected String sexo;
	protected String estadoCivil;
	protected String dataNascimento;
	protected String email;
	protected String telefone;
	protected String celular;
	protected Endere�o endere�o;

	public Pessoa(String nome, String senha, String sexo, String estadoCivil,
			String dataNascimento, String email, String telefone,
			String celular, String rua, String bairro, String cidade,
			String uf, String complemento, String cep, String numero,
			String pais) {

		this.nome = nome;
		this.senha = senha;
		this.sexo = sexo;
		this.estadoCivil = estadoCivil;
		this.dataNascimento = dataNascimento;
		this.email = email;
		this.telefone = telefone;
		this.endere�o = new Endere�o(rua, bairro, cidade, uf, complemento, cep,
				numero, pais);

		this.idPessoa = Pessoa.numeroPessoa++;
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

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public String getEstadoCivil() {
		return estadoCivil;
	}

	public void setEstadoCivil(String estadoCivil) {
		this.estadoCivil = estadoCivil;
	}

	public String getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public Endere�o getEndere�o() {
		return endere�o;
	}

	public void setEndere�o(Endere�o endere�o) {
		this.endere�o = endere�o;
	}

	public int getIdPessoa() {
		return idPessoa;
	}
}