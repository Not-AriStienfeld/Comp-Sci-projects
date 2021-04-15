def new_wave_holdem(hand, community_cards):
  # Your code here


if __name__ == '__main__':
  hand_length = int(input())
  hand = []
  for _ in range(hand_length):
    hand.append(input())
  community_cards_length = int(input())
  community_cards = []
  for _ in range(community_cards_length):
    community_cards.append(input())

  function_call_result = new_wave_holdem(hand, community_cards)
  print(function_call_result)
