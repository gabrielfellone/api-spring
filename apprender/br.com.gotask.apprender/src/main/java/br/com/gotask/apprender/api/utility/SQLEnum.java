package br.com.gotask.apprender.api.utility;

public enum SQLEnum {

// Enum de Querys para SQL
// * Não é valido trocar por uma letra
// O nome da tabela é o nome da CLASSE!
	
	BUSCA_TODOS_USUARIO("select u from Usuario u"),
	INSERIR_USUARIO("INSERT INTO Usuario (nome_usuario, responsavel, email) VALUES (?,?,?)");

	private String query;

	private SQLEnum(String query) {
		this.query = query;

	}

	public String getQuery() {
		return query;
	}

}
