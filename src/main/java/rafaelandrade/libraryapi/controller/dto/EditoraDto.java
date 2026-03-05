package rafaelandrade.libraryapi.controller.dto;


import java.util.UUID;

public record EditoraDto(
    UUID id,
    String nome,
    String cnpj,
    String email
) {
}
