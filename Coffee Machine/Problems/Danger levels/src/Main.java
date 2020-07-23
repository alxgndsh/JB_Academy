enum DangerLevel {
    HIGH (3),
    MEDIUM (2),
    LOW (1);

    private final int lvl;

    DangerLevel(int lvl) {
        this.lvl = lvl;
    }

    int getLevel () {
        return (lvl);
    }
}
