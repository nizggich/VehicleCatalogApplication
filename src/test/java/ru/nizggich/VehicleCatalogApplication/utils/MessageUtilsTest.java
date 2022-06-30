package ru.nizggich.VehicleCatalogApplication.utils;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import ru.nizggich.VehicleCatalogApplication.validation.Error;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MessageUtilsTest {

    @Test
    public void getMessageUtils() {
        String actualMessage = MessageUtils.getMessage(Error.ENTITY_ID_IS_NULL);
        String expectedMessage = "Entity id is null";
        assertEquals(actualMessage, expectedMessage);

        Exception exception = assertThrows(RuntimeException.class, () -> MessageUtils.getMessage("?"));
        String expectedExceptionMessage = "Message '?' does not exist";
        String actualExceptionMessage = exception.getMessage();
        assertEquals(actualExceptionMessage, expectedExceptionMessage);
    }
}
