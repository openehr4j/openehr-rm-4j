package io.github.openehr4j.rm.data_types.text;

public interface TermMapping {

  Object getMatch();

  DvCodedText getPurpose();

  CodePhrase getTarget();

  Boolean narrower();

  Boolean broader();

  Boolean equivalent();

  Boolean unknown();

  Boolean isValidMatchCode(Object c);
}
