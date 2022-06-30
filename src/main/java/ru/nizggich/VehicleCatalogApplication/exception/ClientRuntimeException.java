package ru.nizggich.VehicleCatalogApplication.exception;

import ru.nizggich.VehicleCatalogApplication.utils.MessageUtils;

public class ClientRuntimeException extends RuntimeException{

    public ClientRuntimeException(String messageOrErrorCode) {
        super(MessageUtils.getMessage(messageOrErrorCode));
    }

}
