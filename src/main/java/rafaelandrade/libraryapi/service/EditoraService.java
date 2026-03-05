package rafaelandrade.libraryapi.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import rafaelandrade.libraryapi.model.Editora;
import rafaelandrade.libraryapi.repository.EditoraRepository;

@Service
@RequiredArgsConstructor
public class EditoraService {

    private final EditoraRepository repository;

    public void salvar(Editora editora) {
        repository.save(editora);
    }
}
