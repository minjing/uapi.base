module uapi.service.apt {
    requires java.compiler;

    requires uapi.common;
    requires uapi.exception;
    requires uapi.codegen;
    requires uapi.service;

    requires auto.common;
    requires auto.service;
    requires freemarker;

    exports uapi.service.annotation;
}