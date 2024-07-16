package io.github.openehr4j.rm.data_structures.item_structure;

import java.util.List;

import io.github.openehr4j.rm.data_structures.representation.Cluster;
import io.github.openehr4j.rm.data_structures.representation.Element;

/**
 * @see <a href="https://specifications.openehr.org/releases/RM/Release-1.1.0/data_structures.html#_item_table_class">specifications.openehr.org</a>
 */
public interface ItemTable extends ItemStructure {

  List getRows();

  Integer rowCount();

  Integer columnCount();

  List rowNames();

  List columnNames();

  Cluster ithRow(Object i);

  Boolean hasRowWithName(Object aKey);

  Boolean hasColumnWithName(Object aKey);

  Cluster namedRow(Object aKey);

  Boolean hasRowWithKey(Object keys);

  Cluster rowWithKey(Object keys);

  Element elementAtCellIj(Object i, Object j);

  Cluster asHierarchy();
}
