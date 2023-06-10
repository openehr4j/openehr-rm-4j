package org.openehr.rm.common.archetyped;

import org.openehr.base_foundation_types.primitive_types.Boolean;
import org.openehr.base_foundation_types.primitive_types.String;

/**
 * The `PATHABLE` class defines the pathing capabilities used by nearly all classes in the openEHR reference model, mostly via inheritance of `LOCATABLE`. The defining characteristics of `PATHABLE` objects are that they can locate child objects using paths, and they know their parent object in a compositional hierarchy. The parent feature is defined as abstract in the model, and may be implemented in any way convenient.
 */
public interface Pathable extends Any {
  /**
   * Parent of this node in a compositional hierarchy.
   */
  org.openehr.rm_common.archetyped.Pathable parent();

  /**
   * The item at a path (relative to this item); only valid for unique paths, i.e. paths that resolve to a single item.
   */
  Any itemAtPath(Object aPath);

  /**
   * List of items corresponding to a non-unique path.
   */
  List<Any> itemsAtPath(Object aPath);

  /**
   * True if the path exists in the data with respect to the current item.
   */
  Boolean pathExists(Object aPath);

  /**
   * True if the path corresponds to a single item in the data.
   */
  Boolean pathUnique(Object aPath);

  /**
   * The path to an item relative to the root of this archetyped structure.
   */
  String pathOfItem(Object aLoc);
}
