package rafaelandrade.libraryapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import rafaelandrade.libraryapi.model.Editora;

import java.util.UUID;

public interface EditoraRepository extends JpaRepository<Editora, UUID> {
}
