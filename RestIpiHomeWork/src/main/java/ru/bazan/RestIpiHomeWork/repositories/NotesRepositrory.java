package ru.bazan.RestIpiHomeWork.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.bazan.RestIpiHomeWork.models.Notes;

public interface NotesRepositrory extends JpaRepository<Notes,Integer> {
}
