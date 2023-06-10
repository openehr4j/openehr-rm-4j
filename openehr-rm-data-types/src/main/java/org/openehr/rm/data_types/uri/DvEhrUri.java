package org.openehr.rm.data_types.uri;

import org.openehr.rm_data_types.uri.DvUri;

/**
 * A `DV_EHR_URI` is a `DV_URI` which has the scheme name 'ehr', and which can only reference items in EHRs.
 */
public interface DvEhrUri extends DvUri {
}
