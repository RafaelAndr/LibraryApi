package rafaelandrade.libraryapi.service;

import org.springframework.stereotype.Service;
import rafaelandrade.libraryapi.model.Autor;
import rafaelandrade.libraryapi.repository.AutorRepository;

@Service
public class AutorService {

    private final AutorRepository repository;

    public AutorService(AutorRepository repository){
        this.repository = repository;
    }

    public Autor salvar(Autor autor){
        return repository.save(autor);
    }
}
