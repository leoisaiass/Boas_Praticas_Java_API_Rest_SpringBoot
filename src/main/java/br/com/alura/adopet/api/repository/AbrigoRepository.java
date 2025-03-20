package br.com.alura.adopet.api.repository;

import br.com.alura.adopet.api.model.Abrigo;
import jakarta.validation.constraints.NotBlank;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface AbrigoRepository extends JpaRepository<Abrigo, Long> {

    Abrigo findByNome(String nome);

    boolean existsByNomeOrTelefoneOrEmail(String nome, String telefone, String email);

}
