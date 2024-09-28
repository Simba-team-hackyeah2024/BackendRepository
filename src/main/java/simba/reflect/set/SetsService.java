package simba.reflect.set;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class SetsService {
    private SetsRepo setsRepo;

    public String getAllSets() {

        return setsRepo.findAll().toString();
    }
}
