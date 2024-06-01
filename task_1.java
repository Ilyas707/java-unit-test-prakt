@Test
public void checkIsAdultWhenAgeIsMoreThan18True() {
    Program program = new Program();
    boolean isAdult = program.checkIsAdult(19);
	assertEquals("Ошибка: checkIsAdult должен возвращать true для 19 лет", true, isAdult);
}
