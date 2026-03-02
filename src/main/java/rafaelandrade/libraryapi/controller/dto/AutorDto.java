package rafaelandrade.libraryapi.controller.dto;

import rafaelandrade.libraryapi.model.Autor;

import java.time.LocalDate;

public record AutorDto(
        String nome,
        LocalDate dataNascimento,
        String nacionalidade
) {

    public Autor mapearParaAutor(){
        Autor autor = new Autor();
        autor.setNome(this.nome);
        autor.setDataNascimento(this.dataNascimento);
        autor.setNacionalidade(this.nacionalidade);
        return autor;
    }
}
