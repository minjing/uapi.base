package uapi.test;

import uapi.IService;
import uapi.common.StringHelper;

import java.util.ServiceLoader;

public class Main {

    public static void main(String[] args) {
        String str = StringHelper.makeString("Welcome to the new world!");
        System.out.println(str);

        ServiceLoader<IService> services = ServiceLoader.load(IService.class);
        for (IService service : services) {
            System.out.println(service.getMessage());
        }
    }
}
