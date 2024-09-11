board_game = []
# [
#     [1,2,3],
#     [4,5,6],
#     [7,8,9]
# ]

counter = 1

for i in range(3):
    row = []
    for j in range(3):
        row.append(counter)
        counter += 1
    # print(row)
    board_game.append(row)

print(board_game)
