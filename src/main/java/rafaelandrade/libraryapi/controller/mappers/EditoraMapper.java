package rafaelandrade.libraryapi.controller.mappers;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.springframework.beans.factory.annotation.Autowired;
import rafaelandrade.libraryapi.controller.dto.EditoraDto;
import rafaelandrade.libraryapi.model.Editora;
import rafaelandrade.libraryapi.repository.AutorRepository;
import rafaelandrade.libraryapi.repository.LivroRepository;

@Mapper(componentModel = "spring", uses = AutorMapper.class)
public interface EditoraMapper {

    Editora toEntity(EditoraDto dto);

    EditoraDto toDto(Editora editora);
}
