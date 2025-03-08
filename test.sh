/home/danila/.sdkman/candidates/java/current/bin/native-image \
 -p \
 /home/danila/SPbU/year4/VM/simplelanguage/standalone/target/classes:/home/danila/SPbU/year4/VM/simplelanguage/launcher/target/launcher-23.1.6.jar:/home/danila/.m2/repository/org/graalvm/polyglot/polyglot/23.1.6/polyglot-23.1.6.jar:/home/danila/.m2/repository/org/graalvm/sdk/collections/23.1.6/collections-23.1.6.jar:/home/danila/.m2/repository/org/graalvm/sdk/nativeimage/23.1.6/nativeimage-23.1.6.jar:/home/danila/.m2/repository/org/graalvm/sdk/word/23.1.6/word-23.1.6.jar:/home/danila/SPbU/year4/VM/simplelanguage/lamalanguage/target/lama.jar:/home/danila/.m2/repository/org/graalvm/truffle/truffle-api/23.1.6/truffle-api-23.1.6.jar:/home/danila/.m2/repository/org/graalvm/truffle/truffle-runtime/23.1.6/truffle-runtime-23.1.6.jar:/home/danila/.m2/repository/org/graalvm/sdk/jniutils/23.1.6/jniutils-23.1.6.jar:/home/danila/.m2/repository/org/graalvm/truffle/truffle-compiler/23.1.6/truffle-compiler-23.1.6.jar:/home/danila/.m2/repository/org/antlr/antlr4-runtime/4.13.2/antlr4-runtime-4.13.2.jar \
 -H:+ReportExceptionStackTraces \
 -m \
 org.graalvm.sl.launcher/ru.usachev63.lamatruffle.launcher.LamaMain \
 --report-unsupported-elements-at-runtime \
 -Dgraal.DetailedAsserts=true \
 -o \
 /home/danila/SPbU/year4/VM/simplelanguage/standalone/target/slnative