package io.github.openehr4j.rm.ehr.entry;

/**
 * @see <a href="https://specifications.openehr.org/releases/RM/Release-1.1.0/ehr.html#_observation_class">specifications.openehr.org</a>
 */
public interface Observation extends CareEntry {

  Object getData();

  Object getState();
}
