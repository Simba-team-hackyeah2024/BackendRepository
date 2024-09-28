package simba.reflect.set;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import simba.reflect.set.dto.SetDto;

import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class SetsService {
    private SetsRepo setsRepo;

    private final LinkUsersSetsRepository linkUsersSetsRepository;

    public List<SetDto> getAllSetsByUserId(Integer userId) {
        return linkUsersSetsRepository.findAllSetsByUserId(userId)
                .stream()
                .map(set -> new SetDto(
                        set.getSetID(),
                        set.getName(),
                        set.getDescription(),
                        set.getNextNotification(),
                        set.getNotificationRepeatTimeHours()
                ))
                .collect(Collectors.toList());
    }



    public String getUserSets() {
        return "yee";
    }
}
