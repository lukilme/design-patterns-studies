### Commands to remmber

#### Run Java code

```sh
javac -d bin NullObjectPattern/Main.java
java -cp bin NullObjectPattern.Main
```

#### Run Rust and Java together
```sh
cargo build --release --lib
javac Example.java
work_path=$(pwd)
java -Djava.library.path=$work_path/target/release Example
```

#### Run C++ and Java together
```sh
javac -h . Examplo.java
g++ -I"$JAVA_HOME/include" -I"$JAVA_HOME/include/linux" -shared -fPIC -o libminhabiblioteca.so main.cpp
work_path=$(pwd)
java -Djava.library.path=$work_path Examplo
```

#### All together
```sh
cd Cooperative/rust-lib
cargo build --release --lib
cd ../..
work_path=$(pwd)
javac -d bin Cooperative/*.java
echo $work_path
java -cp bin -Djava.library.path=$work_path/Cooperative/rust-lib/target/release Cooperative.Main
```