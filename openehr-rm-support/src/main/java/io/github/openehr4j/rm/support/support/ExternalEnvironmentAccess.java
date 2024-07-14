package io.github.openehr4j.rm.support.support;

import io.github.openehr4j.rm.support.measurement.MeasurementService;
import io.github.openehr4j.rm.support.terminology.TerminologyService;

/**
 * @see <a href="https://specifications.openehr.org/releases/RM/Release-1.1.0/support.html#_external_environment_access_class">specifications.openehr.org</a>
 */
public interface ExternalEnvironmentAccess extends TerminologyService, MeasurementService {
}
