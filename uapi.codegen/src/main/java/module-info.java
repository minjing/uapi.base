module uapi.codegen {
    requires java.compiler;
    requires uapi.common;
    requires uapi.exception;
    requires freemarker;
    requires auto.common;
    requires auto.service;

    exports uapi.codegen;

    uses uapi.codegen.IAnnotationsHandler;

    provides javax.annotation.processing.Processor with uapi.codegen.internal.AnnotationProcessor;
}