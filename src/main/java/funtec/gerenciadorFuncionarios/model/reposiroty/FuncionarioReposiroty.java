package funtec.gerenciadorFuncionarios.model.reposiroty;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import funtec.gerenciadorFuncionarios.model.Funcionario;
import funtec.gerenciadorFuncionarios.model.FuncionarioSetor;


public interface FuncionarioReposiroty extends JpaRepository<Funcionario, Integer> {

	List<Funcionario> findBySetor (FuncionarioSetor setor);
	
	
}
