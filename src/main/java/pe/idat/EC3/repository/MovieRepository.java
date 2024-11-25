package pe.idat.EC3.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pe.idat.EC3.model.Movie;

public interface MovieRepository extends JpaRepository<Movie, Long> {
}
