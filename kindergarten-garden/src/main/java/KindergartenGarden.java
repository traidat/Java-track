import java.util.ArrayList;
import java.util.List;

class KindergartenGarden {

    private String[] rows;

    KindergartenGarden(String garden) {
        this.rows = garden.split("\n");
    }

    List<Plant> getPlantsOfStudent(String student) {
        List<String> students = new ArrayList();
        students.add("Alice");
        students.add("Bob");
        students.add("Charlie");
        students.add("David");
        students.add("Eve");
        students.add("Fred");
        students.add("Ginny");
        students.add("Harriet");
        students.add("Ileana");
        students.add("Joseph");
        students.add("Kincaid");
        students.add("Larry");

        int index = students.indexOf(student) * 2;
        List<Plant> result = new ArrayList<>();
        result.add(Plant.getPlant(rows[0].charAt(index)));
        result.add(Plant.getPlant(rows[0].charAt(index + 1)));
        result.add(Plant.getPlant(rows[1].charAt(index)));
        result.add(Plant.getPlant(rows[1].charAt(index + 1)));
        return result;
    }
}
