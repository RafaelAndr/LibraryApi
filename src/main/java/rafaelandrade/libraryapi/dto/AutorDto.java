package rafaelandrade.libraryapi.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Past;
import jakarta.validation.constraints.Size;
import rafaelandrade.libraryapi.model.Autor;

import java.time.LocalDate;
import java.util.UUID;

@Schema(name = "Autor")
public record AutorDto(

        UUID id,

        @NotBlank(message = "Campo obrigatório") //impede strings vazias
        @Size(min = 2, max = 100, message = "Tamanho fora do padrão")
        @Schema(name = "nome")
        String nome,

        @NotNull(message = "Campo obrigatório")
        @Past(message = "Data deve estar no passado")
        @Schema(name = "Data de nascimento")
        LocalDate dataNascimento,

        @NotBlank(message = "Campo obrigatório")
        @Size(min = 2, max = 100, message = "Tamanho fora do padrão")
        @Schema(name = "Nacionalidade")
        String nacionalidade
) {
}
