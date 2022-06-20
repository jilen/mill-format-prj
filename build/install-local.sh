#!/bin/bash

git clone https://github.com/com-lihaoyi/mill.git /tmp/mill
cd /tmp/mill
sed -i 's/sbt\.util\.Level\.Info/sbt.util.Level.Debug/g' ./scalalib/worker/src/mill/scalalib/worker/ZincWorkerImpl.scala
./mill installLocal
