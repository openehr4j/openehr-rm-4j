package io.github.openehr4j.rm.data_types.text;

/**
 * @see <a href="https://specifications.openehr.org/releases/RM/Release-1.1.0/data_types.html#_term_mapping_class">specifications.openehr.org</a>
 */
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
