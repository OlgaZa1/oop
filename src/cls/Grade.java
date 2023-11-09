package cls;
public class Grade {
    private Profession profession;

    private int score;

    public Grade(int score, Profession profession) {
        setScore(score);
        this.profession = profession;
    }

    public Profession getProfession() {
        return profession;
    }

    public void setProfession(Profession profession) {
        this.profession = profession;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        if (score < 40) {
            score = 40;
        } else if (score > 100) {
            score = 100;

        }
        this.score = score;


    }

    @Override
    public String toString() {
        return "Grade{" +
                "profession=" + profession +
                ", score=" + score +
                '}';
    }
}
