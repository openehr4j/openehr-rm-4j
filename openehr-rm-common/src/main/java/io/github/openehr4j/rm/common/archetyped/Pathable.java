package io.github.openehr4j.rm.common.archetyped;

import java.lang.Boolean;
import java.lang.Object;
import java.lang.String;
import java.util.List;

public interface Pathable {

  Pathable parent();

  Object itemAtPath(Object aPath);

  List itemsAtPath(Object aPath);

  Boolean pathExists(Object aPath);

  Boolean pathUnique(Object aPath);

  String pathOfItem(Object aLoc);
}
