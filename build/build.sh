#!/bin/bash
./mill-release --no-server __.compile
sed -i 's/0/1/g' app/src/main/scala/models/TestModel1.scala
./mill-release --no-server __.compile
