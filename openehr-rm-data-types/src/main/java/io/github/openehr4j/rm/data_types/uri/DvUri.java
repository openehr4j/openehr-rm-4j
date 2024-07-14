package io.github.openehr4j.rm.data_types.uri;

import io.github.openehr4j.rm.data_types.basic.DataValue;

public interface DvUri extends DataValue {

  String getValue();

  String scheme();

  String path();

  String fragmentId();

  String query();
}
