package zoo.basis;

public abstract class Tier {
    private String name;
    protected int alter;
    public String art;

    public Tier(String name, int alter, String art) {
        this.name = name;
        this.alter = alter;
        this.art = art;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String toString(){
        return name + ", " + alter + ", " + art;
    }

    public abstract void gibLaut();
}