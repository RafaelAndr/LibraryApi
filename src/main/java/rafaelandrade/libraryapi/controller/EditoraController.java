package rafaelandrade.libraryapi.controller;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.function.EntityResponse;
import rafaelandrade.libraryapi.controller.dto.EditoraDto;
import rafaelandrade.libraryapi.controller.mappers.EditoraMapper;
import rafaelandrade.libraryapi.model.Editora;
import rafaelandrade.libraryapi.service.EditoraService;

import java.net.URI;

@RestController
@RequiredArgsConstructor
@RequestMapping("/editoras")
public class EditoraController implements GenericController {

    private final EditoraMapper mapper;
    private final EditoraService service;

    @PostMapping
    public ResponseEntity<Void> salvar(@RequestBody @Valid EditoraDto dto){
        Editora editora = mapper.toEntity(dto);

        service.salvar(editora);
        URI location = gerarHeaderLocation(editora.getId());

        return ResponseEntity.created(location).build();
    }
 }
