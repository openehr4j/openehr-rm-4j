package org.openehr.rm.ehr_extract.common;

/**
 * Specification of what versions should be included in an Extract. By default, only latest versions are included in the Extract, in which case this part of the Extract specification is not needed at all. The attributes `_include_all_versions_` and `_commit_time_interval_` are used to modify this; the former forces all versions to be included; the latter limits the versions to be those latest versions committed in the time interval, or if `_include_all_versions_` is `True`, all versions committed in the time interval.
 */
public interface ExtractVersionSpec {
  /**
   * True if all versions of each item in the Extract are included.
   */
  Boolean getIncludeAllVersions();

  /**
   * Specifies commit time interval of items to source repository to include in Extract. By default, only latest versions whose commit times fall in the range are included. If include_all_versions is True, then the range includes all versions committed within the interval.
   */
  DvINTERVAL<DVDateTIME> getCommitTimeInterval();

  /**
   * True if revision histories of the items in the Extract are included. If included, it is always the full revision history.
   */
  Boolean getIncludeRevisionHistory();

  /**
   * `True` if the data of items matched by the content spec should be included. This is the default. If `False`, only revision history is included in serialised versions. Turning this option on in openEHR systems causes `X_VERSIONED_OBJECTs` to have `_revision_history_` set, but versions Void. Useful for interrogating a server without having to look at any content data. In other systems it may or may not have a sensible meaning.
   */
  Boolean getIncludeData();
}
