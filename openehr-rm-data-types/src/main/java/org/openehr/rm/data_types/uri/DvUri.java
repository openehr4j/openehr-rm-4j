package org.openehr.rm.data_types.uri;

import org.openehr.rm.data_types.basic.DataValue;

public interface DvUri extends DataValue {

  String getValue();

  String scheme();

  String path();

  String fragmentId();

  String query();
}
