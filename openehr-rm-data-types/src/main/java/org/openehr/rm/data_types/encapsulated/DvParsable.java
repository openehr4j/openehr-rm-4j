package org.openehr.rm.data_types.encapsulated;

public interface DvParsable extends DvEncapsulated {

  String getValue();

  String getFormalism();

  Integer size();
}
