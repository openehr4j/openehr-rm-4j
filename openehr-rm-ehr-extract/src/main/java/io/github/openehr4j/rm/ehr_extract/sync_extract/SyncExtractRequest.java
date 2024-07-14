package io.github.openehr4j.rm.ehr_extract.sync_extract;

/**
 * @see <a href="https://specifications.openehr.org/releases/RM/Release-1.1.0/ehr_extract.html#_sync_extract_request_class">specifications.openehr.org</a>
 */
public interface SyncExtractRequest {

  SyncExtractSpec getSpecification();
}
