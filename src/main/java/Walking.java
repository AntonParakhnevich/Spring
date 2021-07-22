import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * Created by .
 */

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Walking {
    private Walk walk;

    public void anyWalk(){
        walk.walking();
    }
}
