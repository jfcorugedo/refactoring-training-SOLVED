package narrowOrParallel.replaceType;

public class SqlVehicleMatcher implements VehicleMatcher {
    @Override
    public int countVehicles(OldVehicleQuery query) {
        return countVehicles(new NewVehicleQuery(
                query.brandDescription.split(" ")[0],
                query.brandDescription.split(" ")[1]
        ));
    }

    @Override
    public int countVehicles(NewVehicleQuery query) {
        return new VehicleRepository().find(query).size();
    }
}
