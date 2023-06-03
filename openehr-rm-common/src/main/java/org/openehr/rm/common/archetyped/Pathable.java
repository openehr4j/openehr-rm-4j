package org.openehr.rm.common.archetyped;

/**
 * The `PATHABLE` class defines the pathing capabilities used by nearly all classes in the openEHR reference model, mostly via inheritance of `LOCATABLE`. The defining characteristics of `PATHABLE` objects are that they can locate child objects using paths, and they know their parent object in a compositional hierarchy. The parent feature is defined as abstract in the model, and may be implemented in any way convenient.
 */
public interface Pathable extends Any {
  /**
   * Parent of this node in a compositional hierarchy.
   */
  void parent();

  /**
   * The item at a path (relative to this item); only valid for unique paths, i.e. paths that resolve to a single item.
   */
  void item_at_path();

  /**
   * List of items corresponding to a non-unique path.
   */
  void items_at_path();

  /**
   * True if the path exists in the data with respect to the current item.
   */
  void path_exists();

  /**
   * True if the path corresponds to a single item in the data.
   */
  void path_unique();

  /**
   * The path to an item relative to the root of this archetyped structure.
   */
  void path_of_item();
}
