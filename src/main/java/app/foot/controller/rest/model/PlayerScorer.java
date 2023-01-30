package app.foot.controller.rest.model;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Builder(toBuilder = true)
@Getter
@EqualsAndHashCode
public class PlayerScorer {
  private Player player;
  private Integer scoreTime;
  private Boolean isOG;
}
