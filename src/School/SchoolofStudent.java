package School;

public class SchoolofStudent {
    private String nameOfSchool;
    private int builderYearOfSchool;
    private int teachersOfSchool;

    public SchoolofStudent(String nameOfSchool, int builderYearOfSchool, int teachersOfSchool) {
        this.nameOfSchool = nameOfSchool;
        this.builderYearOfSchool = builderYearOfSchool;
        this.teachersOfSchool = teachersOfSchool;
    }

    public String getNameOfSchool() {
        return nameOfSchool;
    }

    public void setNameOfSchool(String nameOfSchool) {
        this.nameOfSchool = nameOfSchool;
    }

    public int getBuilderYearOfSchool() {
        return builderYearOfSchool;
    }

    public void setBuilderYearOfSchool(int builderYearOfSchool) {
        this.builderYearOfSchool = builderYearOfSchool;
    }

    public int getTeachersOfSchool() {
        return teachersOfSchool;
    }

    public void setTeachersOfSchool(int teachersOfSchool) {
        this.teachersOfSchool = teachersOfSchool;
    }

    @Override
    public String toString() {
        return "SchoolofStudent{" +
                "nameOfSchool='" + nameOfSchool + '\'' +
                ", builderYearOfSchool=" + builderYearOfSchool +
                ", teachersOfSchool=" + teachersOfSchool +
                '}';
    }
}
