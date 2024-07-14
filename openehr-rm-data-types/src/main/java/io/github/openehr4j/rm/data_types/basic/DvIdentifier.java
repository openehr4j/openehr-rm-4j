package io.github.openehr4j.rm.data_types.basic;

/**
 * @see <a href="https://specifications.openehr.org/releases/RM/Release-1.1.0/data_types.html#_dv_identifier_class">specifications.openehr.org</a>
 */
public interface DvIdentifier extends DataValue {

  String getIssuer();

  String getAssigner();

  String getId();

  String getType();
}
