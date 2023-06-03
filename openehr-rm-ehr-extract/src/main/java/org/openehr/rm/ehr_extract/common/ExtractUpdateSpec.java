package org.openehr.rm.ehr_extract.common;

/**
 * Specification of the how the request should be processed by server. The request can be persisted in the server, meaning that a) it can be re-activated by the requesting system simply by indicating Request id, and b) that a changes-only pattern of Extract updates can be set up. To achieve this, the server has to remember what was sent in the previous response.
 */
public interface ExtractUpdateSpec {
  /**
   * If True, this Request is persisted in the server until further notice.
   */
  Boolean getPersistInServer();

  /**
   * Period for resending update Extracts in response to original Request.
   */
  DvDuration getRepeatPeriod();

  /**
   * Set of Event names that will cause sending of update Extracts. Event types include:
   */
  List<DVCodedTEXT> getTriggerEvents();

  /**
   * Indicate mode of update. Can be: send only items that are changed (including logical deletions) or new since last send. For `_persist_in_server_` Requests only.
   */
  CodePhrase getUpdateMethod();
}
