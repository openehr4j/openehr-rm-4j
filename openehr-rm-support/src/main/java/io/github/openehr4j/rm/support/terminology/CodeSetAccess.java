package io.github.openehr4j.rm.support.terminology;

import java.lang.Boolean;
import java.lang.Object;
import java.lang.String;
import java.util.List;

public interface CodeSetAccess {

  String id();

  List allCodes();

  Boolean hasLang(Object aLang);

  Boolean hasCode(Object aCode);
}
