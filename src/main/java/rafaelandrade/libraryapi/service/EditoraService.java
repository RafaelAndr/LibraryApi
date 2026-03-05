package rafaelandrade.libraryapi.service;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import rafaelandrade.libraryapi.controller.dto.EditoraDto;
import rafaelandrade.libraryapi.model.Editora;
import rafaelandrade.libraryapi.repository.EditoraRepository;

import javax.swing.text.html.Option;
import java.util.Optional;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class EditoraService {

    private final EditoraRepository repository;

    public void salvar(Editora editora) {
        repository.save(editora);
    }

    public Optional<Editora> obterPorId(UUID id) {
        return repository.findById(id);
    }
}
