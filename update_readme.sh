#!/bin/bash

set -e

SCRIPT_DIR=$( cd -- "$( dirname -- "${BASH_SOURCE[0]}" )" &> /dev/null && pwd )

NEW_VERSION=$1

NEW_VERSION_GRADLE="ext['openehrRmVersion'] = '$NEW_VERSION'"

perl -pi -e "s/ext\[.*openehrRmVersion.*/$NEW_VERSION_GRADLE/g" $SCRIPT_DIR/README.md
