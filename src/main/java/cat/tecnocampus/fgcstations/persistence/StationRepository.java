package cat.tecnocampus.fgcstations.persistence;

import cat.tecnocampus.fgcstations.application.DTOs.StationDTO;
import cat.tecnocampus.fgcstations.application.DTOs.StationTopFavoriteJourney;
import cat.tecnocampus.fgcstations.domain.Station;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Optional;

public interface StationRepository extends JpaRepository<Station, String> {
    @Query("SELECT a FROM Station a")
    List<StationDTO> findAllDTO();

    Optional<Station> findByName(String name);

    @Query("SELECT s FROM Station s WHERE s.name =:name")
    Optional<StationDTO> findDTObyName(String name);
}
