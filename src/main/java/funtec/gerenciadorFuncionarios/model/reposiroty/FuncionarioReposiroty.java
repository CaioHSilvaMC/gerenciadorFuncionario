package funtec.gerenciadorFuncionarios.model.reposiroty;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import funtec.gerenciadorFuncionarios.model.Funcionario;
import funtec.gerenciadorFuncionarios.model.FuncionarioSetor;

@Repository
public interface FuncionarioReposiroty extends JpaRepository<Funcionario, Integer> {

	List<Funcionario> findbySetor (FuncionarioSetor funcionarioSetor);
}
