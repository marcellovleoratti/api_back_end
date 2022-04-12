package br.com.dominio.api_back_end.Repositories;

import br.com.dominio.api_back_end.Model.ModelIncidentes;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RepositoryIncidentes extends JpaRepository<ModelIncidentes,Long> {
   List<ModelIncidentes> findByNome(String nome);

   }
