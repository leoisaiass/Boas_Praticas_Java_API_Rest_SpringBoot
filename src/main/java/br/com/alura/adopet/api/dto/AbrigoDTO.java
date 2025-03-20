package br.com.alura.adopet.api.dto;

import br.com.alura.adopet.api.model.Abrigo;
import jakarta.validation.constraints.NotBlank;

public record AbrigoDTO(@NotBlank String nome, @NotBlank String telefone, @NotBlank String email) {

    public AbrigoDTO(Abrigo abrigo) {
        this(abrigo.getNome(), abrigo.getTelefone(), abrigo.getEmail());
    }
}
