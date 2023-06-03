package org.openehr.rm.data_structures.history;

import org.openehr.rm.data_structures.item_structure.ItemStructure;

import com.sun.jdi.Locatable;

/**
 * Defines the abstract notion of a single event in a series. This class is generic, allowing types to be generated which are locked to particular spatial types, such as `EVENT<ITEM_LIST>`. Subtypes express point or intveral data.
 */
public interface Event extends Locatable {
  /**
   * Time of this event. If the width is non-zero, it is the time point of the trailing edge of the event.
   */
  DvDateTime getTime();

  /**
   * Optional state data for this event.
   */
  ItemStructure getState();

  /**
   * The data of this event.
   */
  T getData();

  /**
   * Offset of this event from origin, computed as time.diff(parent.origin).
   */
  void offset();
}
