#!/usr/bin/env bash
java -cp \
./server/target/plugin-server-1.jar:\
./plugin-api/target/plugin-api-1.jar:\
./plugins/testplugin/target/testplugin-1.jar\
 jz.Server
