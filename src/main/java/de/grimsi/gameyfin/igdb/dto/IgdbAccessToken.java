package de.grimsi.gameyfin.igdb;

import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
public class IgdbAccessToken {
    private String accessToken;
    private Long expiresIn;
    private String tokenType;
}
