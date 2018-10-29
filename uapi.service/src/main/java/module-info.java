module uapi.service {
    requires java.compiler;

    requires uapi.common;
    requires uapi.exception;
    requires uapi.codegen;

    exports uapi.service;
}