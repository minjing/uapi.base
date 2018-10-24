package uapi.exception.internal;

import uapi.IService;

public class MessageService implements IService {
    @Override
    public String getMessage() {
        return "Hello new world";
    }
}
