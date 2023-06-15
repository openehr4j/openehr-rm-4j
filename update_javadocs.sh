#!/bin/bash

SCRIPT_DIR=$( cd -- "$( dirname -- "${BASH_SOURCE[0]}" )" &> /dev/null && pwd )
GH_PAGES_DIR=$(mktemp -d)

git clone -b gh-pages --single-branch git@github.com:openehr-java-api/openehr-rm-java.git ${GH_PAGES_DIR}

# Remove old javadocs
if [[ -d $GH_PAGES_DIR/javadocs ]]; then
  rm -r $GH_PAGES_DIR/javadocs
fi
mkdir $GH_PAGES_DIR/javadocs

# Copy new javadocs
cd ${SCRIPT_DIR}
find . -name "*javadoc.jar" | while read FILE
do
  SPECIFICATION=$(echo "${FILE}" | perl -pe 's/.{2}([a-z-]+).*/$1/')
  unzip "${FILE}" -d "${GH_PAGES_DIR}/javadocs/${SPECIFICATION}"
done

# Commit
cd $GH_PAGES_DIR
git add .
git commit -m "Update javadocs"
git push
