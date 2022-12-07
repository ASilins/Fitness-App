package via.sep3.logicserver.repositories.logic;

import java.util.List;

import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;
import org.springframework.web.client.RestTemplate;

import via.sep3.logicserver.repositories.interfaces.WorkoutDAO;
import via.sep3.logicserver.shared.Workout;

@Repository
public class WorkoutDAOImpl implements WorkoutDAO {

    private final String URI = "https://localhost:7057/workout";
    private RestTemplate restTemplate;

    public WorkoutDAOImpl(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @Override
    public List<Workout> GetWorkouts() throws Exception {
        ResponseEntity<List<Workout>> responseEntity = restTemplate
                .exchange(URI + "s", HttpMethod.GET, null,
                        new ParameterizedTypeReference<List<Workout>>() {
                        });
        if (responseEntity.getStatusCode() != HttpStatus.OK) {
            throw new Exception("Data access server error with code: " + responseEntity.getStatusCode());
        }

        return responseEntity.getBody();
    }

}