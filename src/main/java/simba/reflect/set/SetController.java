package simba.reflect.set;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import simba.reflect.set.dto.SetDto;

import java.util.List;

@RestController
@RequestMapping("/sets")
@AllArgsConstructor
public class SetController {
    private final SetsService setService;

    @GetMapping("/user/{userId}")
    public List<SetDto> getAllSetsByUserId(@PathVariable Integer userId) {
        return setService.getAllSetsByUserId(userId);
    }
}
