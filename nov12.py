import os
import time
import random

numbers = []
game_running = True

while game_running:
    rand_num = random.randint(0, 9)
    numbers.append(rand_num)

    print(numbers)
    # for num in numbers:
    #     print(num, end=' ')

    time.sleep(1)
    os.system('clear')

    user_numbers = input('\nEnter list of numbers that you saw: ') # str e.g. "3 5 1 2"

    user_number_list = user_numbers.split(' ') # str -> list

    for i in range(len(user_number_list)):
        user_number_list[i] = int(user_number_list[i]) # list of str -> list of int


    # print(user_number_list)

    for i in range(len(numbers)):
        # print(user_number_list[i], numbers[i])
        # if user_number_list != numbers => still works
        if user_number_list[i] != numbers[i]:
            game_running = False
            break


print(numbers)
print('Game over!')