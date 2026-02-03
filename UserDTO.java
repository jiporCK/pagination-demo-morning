package new_features.pagination;

import java.time.LocalDateTime;

// by default: all arguments constructor, getters, toString
public record UserDTO(
        String fullName,
        String username,
        LocalDateTime createdAt
) {
}
