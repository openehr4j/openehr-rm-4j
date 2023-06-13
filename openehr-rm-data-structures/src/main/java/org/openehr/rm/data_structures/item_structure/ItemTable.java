package org.openehr.rm.data_structures.item_structure;

import java.util.List;

import org.openehr.base_foundation_types.primitive_types.Integer;
import org.openehr.rm.data_structures.representation.Cluster;
import org.openehr.rm.data_structures.representation.Element;

/**
 * Logical relational database style table data structure, in which columns are named and ordered with respect to each other. Implemented using Cluster-per-row encoding. Each row Cluster must have an identical number of Elements, each of which in turn must have identical names and value types in the corresponding positions in each row.
 */
public interface ItemTable extends ItemStructure {
  /**
   * Physical representation of the table as a list of `CLUSTERs`, each containing the data of one row of the table.
   */
  List getRows();

  /**
   * Number of rows in the table.
   */
  Integer rowCount();

  /**
   * Return number of columns in the table.
   */
  Integer columnCount();

  /**
   * Return set of row names.
   */
  List rowNames();

  /**
   * Return set of column names.
   */
  List columnNames();

  /**
   * Return i-th row.
   */
  Cluster ithRow(Object i);

  /**
   * Return `True` if there is a column with name = `_a_key_`.
   */
  Boolean hasRowWithName(Object aKey);

  /**
   * Return `True` if there is a column with name = `_a_key_`.
   */
  Boolean hasColumnWithName(Object aKey);

  /**
   * Return row with name = `_a_key_`.
   */
  Cluster namedRow(Object aKey);

  /**
   * Return `True` if there is a row with key `_keys_`.
   */
  Boolean hasRowWithKey(Object keys);

  /**
   * Return rows with particular keys.
   */
  Cluster rowWithKey(Object keys);

  /**
   * Return cell at a particular location.
   */
  Element elementAtCellIj(Object i, Object j);

  /**
   * Generate a CEN EN13606-compatible hierarchy consisting of a single `CLUSTER` containing the `CLUSTERs` representing the columns of this table.
   */
  Cluster asHierarchy();
}
