package funtec.gerenciadorFuncionarios.model;

public enum FuncionarioSetor {

	TECNOLOGIA ("Tecnologia"),
	RH ("RH"),
	DIRETORIA ("Direotria");
	
	private String value;
	
	private FuncionarioSetor(String value) {
		this.value = value;
	}
	
	public String getSetor() {
		return value;
	}
}
