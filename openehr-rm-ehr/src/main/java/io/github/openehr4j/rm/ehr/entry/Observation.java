package io.github.openehr4j.rm.ehr.entry;

public interface Observation extends CareEntry {

  Object getData();

  Object getState();
}
