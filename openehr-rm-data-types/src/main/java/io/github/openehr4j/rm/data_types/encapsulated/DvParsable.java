package io.github.openehr4j.rm.data_types.encapsulated;

/**
 * @see <a href="https://specifications.openehr.org/releases/RM/Release-1.1.0/data_types.html#_dv_parsable_class">specifications.openehr.org</a>
 */
public interface DvParsable extends DvEncapsulated {

  String getValue();

  String getFormalism();

  Integer size();
}
