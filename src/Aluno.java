import java.util.Date;

public class Aluno {
	private String nome, endereco, email, telefone, matricula;
	private Date data;
	private int idade;
	private Boletim boletim;
	private Turma turma;
	
	public Aluno(String nome, String endereco, String email, String telefone, int idade) {
		this.nome = nome;
		this.endereco = endereco;
		this.email = email;
		this.telefone = telefone;
		this.idade = idade;
		this.data = null;
		this.boletim = null;
		this.turma = null;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
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

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public Boletim getBoletim() {
		return boletim;
	}

	public void setBoletim(Boletim boletim) {
		this.boletim = boletim;
	}

	public Turma getTurma() {
		return turma;
	}

	public void setTurma(Turma turma) {
		this.turma = turma;
	}

	public String toString() {
		return "Aluno [nome=" + nome + ", endereco=" + endereco + ", email=" + email + ", telefone=" + telefone
				+ ", matricula=" + matricula + ", data=" + data + ", idade=" + idade + ", boletim=" + boletim
				+ ", turma=" + turma + "]";
	}
}
