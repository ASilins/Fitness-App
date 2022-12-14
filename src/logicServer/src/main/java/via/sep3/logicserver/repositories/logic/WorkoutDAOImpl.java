package via.sep3.logicserver.repositories.logic;

import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;
import via.sep3.logicserver.repositories.interfaces.WorkoutDAO;
import via.sep3.logicserver.shared.FollowWorkoutDTO;
import via.sep3.logicserver.shared.WorkoutDTO;
import via.sep3.logicserver.shared.Exceptions.DAOException;
import via.sep3.logicserver.shared.Logger.Logger;

import java.util.List;

@Repository
public class WorkoutDAOImpl implements WorkoutDAO {

    private final String URI = "https://localhost:7057/workout";
    private RestTemplate restTemplate;

    public WorkoutDAOImpl(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @Override
    public WorkoutDTO getWorkout(int id) throws Exception {
        Logger.writeLog("Sending request to DAO Server", "info");
        String uri = UriComponentsBuilder.fromHttpUrl(URI).queryParam("w", id).encode().toUriString();
        ResponseEntity<WorkoutDTO> responseEntity = restTemplate.getForEntity(uri, WorkoutDTO.class);

        if (responseEntity.getStatusCode() != HttpStatus.OK) {
            throw new DAOException("Data access server error with code: " + responseEntity.getStatusCodeValue());
        }

        return responseEntity.getBody();
    }

    @Override
    public List<WorkoutDTO> GetWorkouts() throws Exception {
        Logger.writeLog("Sending request to DAO Server", "info");
        ResponseEntity<List<WorkoutDTO>> responseEntity = restTemplate
                .exchange(URI + "s", HttpMethod.GET, null,
                        new ParameterizedTypeReference<List<WorkoutDTO>>() {
                        });
        if (responseEntity.getStatusCode() != HttpStatus.OK) {
            throw new DAOException("Data access server error with code: " + responseEntity.getStatusCodeValue());
        }

        return responseEntity.getBody();
    }

    @Override
    public FollowWorkoutDTO assignWorkout(FollowWorkoutDTO dto) throws Exception {
        Logger.writeLog("Sending request to DAO Server", "info");
        ResponseEntity<FollowWorkoutDTO> responseEntity = restTemplate
                .postForEntity(URI + "/assign", dto, FollowWorkoutDTO.class);

        if (responseEntity.getStatusCode() != HttpStatus.CREATED) {
            throw new DAOException("Data access server error with code: " + responseEntity.getStatusCodeValue());
        }

        return responseEntity.getBody();
    }

    @Override
    public WorkoutDTO editWorkout(WorkoutDTO workout) throws Exception {
        Logger.writeLog("Sending request to DAO Server", "info");
        // return restTemplate
        // .patchForObject(URI, workout, Workout.class);

        final HttpEntity<WorkoutDTO> requestEntity = new HttpEntity<>(workout);

        ResponseEntity<WorkoutDTO> responseEntity = restTemplate
                .exchange(URI, HttpMethod.PUT, requestEntity, new ParameterizedTypeReference<WorkoutDTO>() {
                });

        if (responseEntity.getStatusCode() != HttpStatus.OK) {
            throw new DAOException("DAO error code: " + responseEntity.getStatusCodeValue());
        }

        return responseEntity.getBody();
    }

    @Override
    public void deleteWorkout(int id) throws Exception {
        Logger.writeLog("Sending request to DAO Server", "info");
        String uri = UriComponentsBuilder.fromHttpUrl(URI).queryParam("id", id).encode().toUriString();
        restTemplate.delete(uri);
    }

    @Override
    public WorkoutDTO createWorkout(WorkoutDTO workoutDTO) throws Exception {

        ResponseEntity<WorkoutDTO> responseEntity = restTemplate.postForEntity(URI + "/create", workoutDTO,
                WorkoutDTO.class);

        if (responseEntity.getStatusCode() != HttpStatus.CREATED) {
            throw new Exception("Data access server error with code " + responseEntity.getStatusCodeValue());
        }

        return responseEntity.getBody();
    }
}
