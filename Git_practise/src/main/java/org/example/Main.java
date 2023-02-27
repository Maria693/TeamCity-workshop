package org.example;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class) // Напиши аннотацию для параметризованных тестов
public class CheckIsAdultTest {


    private final int age;
    private final boolean result;


    public CheckIsAdultTest(int age, boolean result) {
        this.age = age; // Инициализируй поля класса в конструкторе
        this.result = result;
    }


    @Parameterized.Parameters // Пометь метод аннотацией для параметров
    public static Object[][] getTextData() {
        return new Object[][] {
                {16, false},
                {18, true},
                {19, true},
                {21, true},// Заполни массив тестовыми данными и ожидаемым результатом
        };
    }


    @Test
    public void checkIsAdultWhenAgeThenResult() {
        Program program = new Program();
        boolean isAdult = program.checkIsAdult(age);
        assertEquals("Значение true должно быть при возрасте 18 или больше", result, isAdult);
    }
}
