package io.github.openehr4j.rm.ehr_extract.message;

import java.util.List;

/**
 * @see <a href="https://specifications.openehr.org/releases/RM/Release-1.1.0/ehr_extract.html#_addressed_message_class">specifications.openehr.org</a>
 */
public interface AddressedMessage {

  String getSender();

  String getSenderReference();

  List getAddressees();

  Integer getUrgency();

  Message getMessage();
}
