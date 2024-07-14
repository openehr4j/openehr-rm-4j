package org.openehr.rm.data_structures.item_structure;

import java.util.List;

import org.openehr.rm.data_structures.representation.Cluster;
import org.openehr.rm.data_structures.representation.Element;

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
