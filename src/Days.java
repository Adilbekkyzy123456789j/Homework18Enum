public enum Days {
    MONDAY( "Бугун англиский сабагы "),
    TUESDAY( "Бугун кыргыз тил сабагы"),
    WEDNESDAY( "Бугун орус тил сабагы "),
    THURSDAY( "Англис тил сабагы "),
    FRIDAY( " Бугун жаны тема "),
    SATURDAY( "Enum темасы боюнча практика "),
    SUNDAY( "Бугун выходной");
    private String lesson;

    Days(String lesson) {
        this.lesson = lesson;
    }

    public String getLesson() {
        return lesson;
    }

    public void setLesson(String lesson) {
        this.lesson = lesson;
    }

    @Override
    public String toString() {
        return "Days{" +
                "lesson='" + lesson + '\'' +
                '}';
    }
}
