import narrowOrParallel.replaceType.OldVehicleQuery;
import narrowOrParallel.replaceType.SqlVehicleMatcher;
import narrowOrParallel.replaceType.VehicleMatcher;
import org.junit.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class SqlVehicleMatcherShould {
    @Test
    public void find_vehicles() throws Exception {
        SqlVehicleMatcher matcher = new SqlVehicleMatcher();
        OldVehicleQuery query = new OldVehicleQuery();
        query.brandDescription = "VW Polo";

        assertThat(matcher.countVehicles(query)).isEqualTo(1);
    }

    @Test
    public void find_vehicles_using_interface() throws Exception {
        VehicleMatcher matcher = new SqlVehicleMatcher();
        OldVehicleQuery query = new OldVehicleQuery();
        query.brandDescription = "VW Polo";

        assertThat(matcher.countVehicles(query)).isEqualTo(1);
    }
}
