package simba.reflect.set.dto;

import java.time.LocalDateTime;

public record SetDto(
        Integer setId,
        String name,
        String description,
        LocalDateTime nextNotification,
        Integer notificationRepeatTimeHours
) {}
