package simba.reflect.set;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(("/sets"))
@AllArgsConstructor
public class SetController {
    private SetsService setsService;

    @GetMapping("/all")
    public String getAll() {
        return setsService.getAllSets();
    }

}
