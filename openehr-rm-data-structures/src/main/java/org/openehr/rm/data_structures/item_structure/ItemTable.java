package org.openehr.rm.data_structures.item_structure;

/**
 * Logical relational database style table data structure, in which columns are named and ordered with respect to each other. Implemented using Cluster-per-row encoding. Each row Cluster must have an identical number of Elements, each of which in turn must have identical names and value types in the corresponding positions in each row.
 */
public interface ItemTable extends ItemStructure {
  /**
   * Physical representation of the table as a list of `CLUSTERs`, each containing the data of one row of the table.
   */
  List<CLUSTER> getRows();

  /**
   * Number of rows in the table.
   */
  void row_count();

  /**
   * Return number of columns in the table.
   */
  void column_count();

  /**
   * Return set of row names.
   */
  void row_names();

  /**
   * Return set of column names.
   */
  void column_names();

  /**
   * Return i-th row.
   */
  void ith_row();

  /**
   * Return `True` if there is a column with name = `_a_key_`.
   */
  void has_row_with_name();

  /**
   * Return `True` if there is a column with name = `_a_key_`.
   */
  void has_column_with_name();

  /**
   * Return row with name = `_a_key_`.
   */
  void named_row();

  /**
   * Return `True` if there is a row with key `_keys_`.
   */
  void has_row_with_key();

  /**
   * Return rows with particular keys.
   */
  void row_with_key();

  /**
   * Return cell at a particular location.
   */
  void element_at_cell_ij();

  /**
   * Generate a CEN EN13606-compatible hierarchy consisting of a single `CLUSTER` containing the `CLUSTERs` representing the columns of this table.
   */
  void as_hierarchy();
}
