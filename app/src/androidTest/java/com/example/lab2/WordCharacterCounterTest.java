package com.example.lab2;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import java.lang.reflect.Method;

public class WordCharacterCounterTest {

    @Test
    public void testCountWords() throws Exception {
        Class<?> wordCharacterCounterClass = Class.forName("com.example.lab2.WordCharacterCounter");
        Method countWordsMethod = wordCharacterCounterClass.getDeclaredMethod("countWords", String.class);
        countWordsMethod.setAccessible(true);

        WordCharacterCounter instance = new WordCharacterCounter();
        int result = (int) countWordsMethod.invoke(instance, "Hello World Java");

        assertEquals(3, result);
    }
}
