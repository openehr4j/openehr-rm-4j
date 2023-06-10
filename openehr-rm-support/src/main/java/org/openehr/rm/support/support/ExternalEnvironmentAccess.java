package org.openehr.rm.support.support;

import org.openehr.rm_support.measurement.MeasurementService;
import org.openehr.rm_support.terminology.TerminologyService;

/**
 * A mixin class providing access to services in the external environment.
 */
public interface ExternalEnvironmentAccess extends TerminologyService, MeasurementService {
}
