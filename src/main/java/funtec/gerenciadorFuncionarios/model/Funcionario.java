package funtec.gerenciadorFuncionarios.model;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Funcionario {

	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private int id;
	private String nome;
	private String email;
	private String cargo;
	private BigDecimal salario;
	private LocalDateTime dataContratacao = LocalDateTime.now();
	
	@Enumerated (EnumType.STRING)
	private FuncionarioSetor setor;
	
	public void setSetor(FuncionarioSetor setor) {
		this.setor = setor;
	}

}
