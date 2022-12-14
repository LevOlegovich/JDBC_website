package entity;

public class Mark {
    private int id;
    private int mark;
    private Student steudent;
    private Term term;
    private Discipline discipline;

    public Mark() {
    }

    public Mark(int id, int mark, Student steudent, Term term, Discipline discipline) {
        this.id = id;
        this.mark = mark;
        this.steudent = steudent;
        this.term = term;
        this.discipline = discipline;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getMark() {
        return mark;
    }

    public void setMark(int mark) {
        this.mark = mark;
    }

    public Student getSteudent() {
        return steudent;
    }

    public void setSteudent(Student steudent) {
        this.steudent = steudent;
    }

    public Term getTerm() {
        return term;
    }

    public void setTerm(Term term) {
        this.term = term;
    }

    public Discipline getDiscipline() {
        return discipline;
    }

    public void setDiscipline(Discipline discipline) {
        this.discipline = discipline;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Mark mark1 = (Mark) o;

        if (id != mark1.id) return false;
        if (mark != mark1.mark) return false;
        if (steudent != null ? !steudent.equals(mark1.steudent) : mark1.steudent != null) return false;
        if (term != null ? !term.equals(mark1.term) : mark1.term != null) return false;
        return discipline != null ? discipline.equals(mark1.discipline) : mark1.discipline == null;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + mark;
        result = 31 * result + (steudent != null ? steudent.hashCode() : 0);
        result = 31 * result + (term != null ? term.hashCode() : 0);
        result = 31 * result + (discipline != null ? discipline.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Mark{" +
                "id=" + id +
                ", mark=" + mark +
                ", steudent=" + steudent +
                ", term=" + term +
                ", discipline=" + discipline +
                '}';
    }
}
