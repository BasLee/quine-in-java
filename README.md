# Quine in Java

> A quine is a computer program which takes no input and produces a copy of its own source code as its only output.

-- [Wikipedia](https://en.wikipedia.org/wiki/Quine_(computing))

## Run
```
javac Quine.java && java Quine
```

## Test
No difference should be found:
```
java Quine | diff Quine.java -
```
