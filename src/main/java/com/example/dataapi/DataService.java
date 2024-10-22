import org.springframework.stereotype.Service;
import java.util.Arrays;
import java.util.List;

@Service
public class DataService {
    public List<DataModel> obtenerDatos() {
        return Arrays.asList(
            new DataModel("1", "Juan", 30),
            new DataModel("2", "María", 25),
            new DataModel("3", "Carlos", 35)
        );
    }
}
