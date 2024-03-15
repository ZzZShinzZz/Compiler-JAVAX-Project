# compiler-proj

```bash
export PROJECT_ROOT="~/Projects/compiler-proj"
export ANTLR_JAR="$PROJECT_ROOT/src/antlr4/antlr-4.13.1-complete.jar"
export CLASSPATH="$CLASSPATH:$ANTLR_JAR"
alias antlr4="java -jar $ANTLR_JAR -visitor -no-listener"
alias grun='java org.antlr.v4.gui.TestRig'
```