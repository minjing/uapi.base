module uapi.codegen {
    requires java.compiler;
    requires uapi.common;
    requires uapi.exception;
    requires freemarker;

    exports uapi.codegen;

    provides javax.annotation.processing.Processor with uapi.codegen.internal.AnnotationProcessor;
}