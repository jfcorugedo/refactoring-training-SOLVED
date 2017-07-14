package narrowOrParallel.replaceType;

public class SqlVehicleMatcher {
    public int countVehicles(OldVehicleQuery query) {
        return countVehicles(new NewVehicleQuery(
                query.brandDescription.split(" ")[0],
                query.brandDescription.split(" ")[1]
        ));
    }

    public int countVehicles(NewVehicleQuery query) {
        return new VehicleRepository().find(query).size();
    }
}
