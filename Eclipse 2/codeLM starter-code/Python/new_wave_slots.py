def new_wave_slots(given_slot):
  # Your code here


if __name__ == '__main__':
  given_slot_row = int(input())
  given_slot_col = int(input())
  given_slot = []
  for _ in range(given_slot_row):
    given_slot.append([])
    for _ in range(given_slot_col):
      given_slot[-1].append(input())

  function_call_result = new_wave_slots(given_slot)
  for x in function_call_result:
    for y in x:
      print(y, end=' ')
    print()
