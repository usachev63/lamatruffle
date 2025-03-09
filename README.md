graal version: `23.0.2-graalce` (sdkman)

Build
```sh
antlr4 -Dlanguage=Java -package ru.usachev63.lamatruffle.parser -no-listener \
  ./lamalanguage/src/main/java/ru/usachev63/lamatruffle/parser/LamaLanguage.g4 
mvn package -Dmaven.test.skip -Pnative
```

Lama native language launcher will be at `./standalone/target/slnative`

Regression tests:
```sh
cd regression
make
```

Performance test (lamac must be in path):
```shell
cd performance
make
```

my results:
```shell
Sort
lamac  Sort.lama && `which time` -f "Sort\t%U" ./Sort
Sort    1.11
`which time` -f "Sort\t%U" ../standalone/target/slnative Sort.lama
== running on org.graalvm.polyglot.Engine@5b323836
Sort    8.91
```

almost all time is spent in parsing stage (even before name resolving stage)