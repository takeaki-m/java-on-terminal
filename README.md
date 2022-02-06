javaの動きを理解するために、以下のサイトの記事のサンプルコードを実行する

https://java.keicode.com/lang/how-to-compile.ph://java.keicode.com/lang/how-to-compile.php

## memo
### java実行時にクラスパスを指定する
- クラスパス
- 実行時に参照するクラスを、参照させるために指定するパス
- 指定がない場合には、カレントディレクトリをクラスパスとする
```sh
java -cp(or -classpath) .:./subdirectory Main.java
```

### javaのコンパイル

- javaのソースコードのツリーと成果物のツリーを分ける

- デフォルトの設定では、ソースファイルと同じディレクトリ内にクラスファイルが生成されるため、コンパイルの結果生成されるクラスファイルもあちこちに散らばってしまう

- デフォルトでは、ソースファイルと同じ階層に、クラスファイルも作成される

```bash
~/d/j/j/java-on-terminal ❯❯❯ javac -sourcepath src src/com/example/TestApp.java
~/d/j/j/java-on-terminal ❯❯❯ tree
.
├── HelloWorld.class
├── HelloWorld.java
├── README.md
├── TestApp.class
├── mypackage
│   └── Person.class
└── src
    └── com
        └── example
        ├── TestApp.class
        ├── TestApp.java
            └── models
                ├── Person.class
                └── Person.java
```

- `-d`オプションを使うと、クラスファイルを出力するディレクトリを指定できる

```bash
~/d/j/j/java-on-terminal ❯❯❯ javac -d out -sourcepath src src/com/example/TestApp.java
~/d/j/j/java-on-terminal ❯❯❯ tree
.
├── HelloWorld.class
├── HelloWorld.java
├── README.md
├── TestApp.class
├── mypackage
│   └── Person.class
├── out
│   ├── TestApp.class
│   └── com
│       └── example
│           └── models
│               └── Person.class
└── src
    └── com
        └── example
            ├── TestApp.java
            └── models
                └── Person.java
```

### クラスファイルの統合
