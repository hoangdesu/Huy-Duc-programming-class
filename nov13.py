# a = [1,2,3]
# b = [1,3,2]

# if a == b:
#     print('the same')
# else:
#     print('different')

# same = True
# for i in range(len(a)):
#     if a[i] != b[i]:
#         same = False
#         break

# print(same)

# a feature in python, you can compare 2 lists directly with ==

# 2D list, nested list

phone_screen = [
    [1, 2, 3],
    [4, 5, 6],
    [7, 8, 9]
]

# print(phone_screen[1][0]) # 4

# Tic tac toe

board_game = [
    [],
    [],
    []
]

counter = 1
for i in range(len(board_game)):
    for j in range(3):
        board_game[i].append(counter)
        counter += 1

def display(board_game):
    # x 2 x
    # o x x
    # 7 o 9
    for i in range(len(board_game)):
        for j in range(len(board_game[i])):
            print(board_game[i][j], end=' | ')
        print()


def replace(number, move):
    # number = 5 
    # => i = ? j = ?
    # board_game[i][j] = move

    # method 1: loop thru the board game, search for the number to get i and j
    for i in range(len(board_game)):
        for j in range(len(board_game[i])):
            if board_game[i][j] == number:
                board_game[i][j] = move

    # print('inside:', board_game)

    # return board_game


    # method 2: calculate the i and j based on the given number



# display(board_game)

# replace(board_game, 4, 'x')
# 1 2 3 
# x 5 6 
# 7 8 9

def check_win_conditions(board_game):
    if board_game[0][0] == board_game[0][1] == board_game[0][2]:
        return True


xMove = True
game_playing = True

# Game loop
while game_playing:
    display(board_game)

    if xMove:
        move = 'x'
    else:
        move = 'o'

    number = int(input(f'\nEnter {move} move: '))
    # move = xMove ? 'x' : 'o'


    # before we can call replace, check if the move is available

    replace(number, move)
    
    xMove = not xMove

    # Check for the win conditions
    is_win = check_win_conditions(board_game)

    if (is_win):
        print(f'Winner is {move}!')
        display(board_game)
        game_playing = False

    print()