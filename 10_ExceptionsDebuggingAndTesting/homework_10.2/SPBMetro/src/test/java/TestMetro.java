import core.Line;
import core.Station;
import junit.framework.TestCase;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;


public class TestMetro extends TestCase {

    StationIndex stIndex;

    @Override
    protected void setUp() throws Exception {
        super.setUp();

        ArrayList<Line> lines = new ArrayList<>();
        lines.add(new Line(1, "Первая"));
        lines.add(new Line(2, "Вторая"));
        lines.add(new Line(3, "Третья"));

        stIndex = new StationIndex();
        lines.stream()
                .forEach(line -> stIndex.addLine(line));

        addNewStationToMap(stIndex, lines, "Какая-то 1 станция", 0);
        addNewStationToMap(stIndex, lines, "Какая-то 2 станция", 0);
        addNewStationToMap(stIndex, lines, "Какая-то 3 станция", 0);
        addNewStationToMap(stIndex, lines, "Какая-то 4 станция", 1);
        addNewStationToMap(stIndex, lines, "Какая-то 5 станция", 1);
        addNewStationToMap(stIndex, lines, "Какая-то 6 станция", 1);
        addNewStationToMap(stIndex, lines, "Какая-то 7 станция", 2);
        addNewStationToMap(stIndex, lines, "Какая-то 8 станция", 2);
        addNewStationToMap(stIndex, lines, "Какая-то 9 станция", 2);


        List<Station> connection1 = new ArrayList<>();
        connection1.add(stIndex.getStation("Какая-то 2 станция"));
        connection1.add(stIndex.getStation("Какая-то 7 станция"));

        List<Station> connection2 = new ArrayList<>();
        connection2.add((stIndex.getStation("Какая-то 5 станция")));
        connection2.add((stIndex.getStation("Какая-то 9 станция")));

        stIndex.addConnection(connection1);
        stIndex.addConnection(connection2);
    }

    private void addNewStationToMap(StationIndex sti, ArrayList<Line> lines, String name, int lineIndex) {
        sti.addStation(new Station(name, lines.get(lineIndex)));
        lines.get(lineIndex).addStation(sti.getStation(name));
    }


    public void testCalculateDuration() {
        assertEquals(8.5, RouteCalculator.calculateDuration(makeRoute("Какая-то 1 станция -> Какая-то 2 станция -> Какая-то 7 станция -> Какая-то 9 станция")));
    }


    public void testGetShortestRouteOnTheLine() {
        RouteCalculator routeCalculator = new RouteCalculator(stIndex);
        assertEquals("On the Line: ", makeRoute("Какая-то 4 станция -> Какая-то 5 станция -> Какая-то 6 станция"),
                routeCalculator.getShortestRoute(stIndex.getStation("Какая-то 4 станция"), stIndex.getStation("Какая-то 6 станция")));
    }

    public void testGetShortestRouteWithOneConnection() {
        RouteCalculator routeCalculator = new RouteCalculator(stIndex);
        assertEquals("With one connection: ", makeRoute("Какая-то 1 станция -> Какая-то 2 станция -> Какая-то 7 станция -> Какая-то 8 станция -> Какая-то 9 станция"),
                routeCalculator.getShortestRoute(stIndex.getStation("Какая-то 1 станция"), stIndex.getStation("Какая-то 9 станция")));
    }

    public void testGetShortestRouteWithTwoConnection() {
        RouteCalculator routeCalculator = new RouteCalculator(stIndex);
        assertEquals("With two connection: ", makeRoute("Какая-то 1 станция -> Какая-то 2 станция -> Какая-то 7 станция -> Какая-то 8 станция -> Какая-то 9 станция -> Какая-то 5 станция -> Какая-то 6 станция"),
                routeCalculator.getShortestRoute(stIndex.getStation("Какая-то 1 станция"), stIndex.getStation("Какая-то 6 станция")));
    }


    public void testGetRouteViaConnectedLine()
            throws InvocationTargetException, IllegalAccessException, NoSuchMethodException {
        RouteCalculator routeCalculator = new RouteCalculator(stIndex);
        Method method = RouteCalculator.class.getDeclaredMethod
                ("getRouteViaConnectedLine", Station.class, Station.class);
        method.setAccessible(true);
        assertEquals(makeRoute("Какая-то 7 станция -> Какая-то 8 станция -> Какая-то 9 станция"), method.invoke(routeCalculator,
                stIndex.getStation("Какая-то 2 станция"), stIndex.getStation("Какая-то 5 станция")));
    }

    List<Station> makeRoute(String routeStr) {
        List<Station> route = new ArrayList<>();

        for (String stationStr : routeStr.split(" -> ")) {
            route.add(stIndex.getStation(stationStr));
        }
        return route;
    }

    @Override
    protected void tearDown() throws Exception {
        super.tearDown();
    }
}