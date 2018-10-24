rm -rf dist

jlink --module-path uapi.common/build/libs:uapi.exception/build/libs:uapi.test/build/libs \
      --add-modules uapi.common,uapi.exception,uapi.test \
      --launcher uapiDemo=uapi.test/uapi.test.Main \
      --output dist
