## Why
This is a learning exercise for me to understand how programming languages are built and how compilers work. There are lots of good components to this project like understanding how lexers work, constructing a custom parser, building abstract syntax trees, evaluating expressions, designing custom data structures, and many more.

I'm following the book: [Crafting Interpreters](https://craftinginterpreters.com/contents.html) in order to implement this. In order to get the most value I can out of this, I will try to add my own refactorings, optimizations, and other modifications to really understand how compilers and programming languages work.

*NOTE: I also might follow up on Pytorch ([1](https://jott.live/markdown/Writing%20a%20Toy%20Backend%20Compiler%20for%20PyTorch) and [2](https://minitorch.github.io/module0/module0/#task-04-modules)) and [neural network compilers](https://bernsteinbear.com/blog/compiling-ml-models/) and [C compilers](https://norasandler.com/2017/11/29/Write-a-Compiler.html) to really internalize and understand this knowledge.*

## Compile Java classes
```
javac -d . lox/*.java
```

## Run REPL
```
java com.craftinginterpreters.lox.Lox
```
