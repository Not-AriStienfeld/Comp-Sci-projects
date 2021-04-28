def extraction(casino_floor):
  # Your code here


if __name__ == '__main__':
  casino_floor_row = int(input())
  casino_floor_col = int(input())
  casino_floor = []
  for _ in range(casino_floor_row):
    casino_floor.append([])
    for _ in range(casino_floor_col):
      casino_floor[-1].append(input())

  function_call_result = extraction(casino_floor)
  for x in function_call_result:
    for y in x:
      print(y, end=' ')
    print()
