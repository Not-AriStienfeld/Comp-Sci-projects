def poker_table_traversal(tables):
  # Your code here


if __name__ == '__main__':
  tables_length = int(input())
  tables = []
  for _ in range(tables_length):
    tables.append(input())

  function_call_result = poker_table_traversal(tables)
  print(function_call_result)
