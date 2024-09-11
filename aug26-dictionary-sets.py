# Main Data structures


# List
gamesList = ['valorant', 'league', 'valorant']
gamesList[1] = 'league of legends'
gamesList.append('wukong black myth')
print(gamesList)


# Set: 
# - no duplicated values, 
# - values have no order
game_set = set()
game_set.add('valorant')
game_set.add('league of legends')
game_set.add('valorant') # this wont be added
# game_set.pop()
# game_set.remove('valorant')

print(game_set)

game_set2 = {'wukong', 'valorant', 'league', 'wukong'}
print(game_set2)

# arr1 = []
# arr2 = []


# Tuple: immutable list
cities = ('ho chi minh', 'hanoi', 'danang')
# cities[2] = 'nha trang' # error
print(cities[2])


# Dictionary
# - key-value pairs
# - adv: lookup time of O(1)

# name = 'Brian'
# year = 1995 
# hobbies = ['piano', 'basketball', 'gaming']

jack = {
    'name': 'Huy Duc',
    'hobbies': ['basketball', 'gaming', 'football'],
    'birth_year': 2008,
    1: 'one'
}

# accessing the values with .get() => prevent errors
print(jack.get('hobbies')[1])
print(jack.get('food'))

# direct access
# print(jack['food'])  # error
print(jack['name'])

try:
   print(jack['food']) 
except:
    print('key food missing')


if jack.get('food') is not None:
    print(jack.get('food')[1])
else:
    print('food is not a valid key')

# checking if a key is inside a dictionary first
if 'birth_year' in jack.keys():
    print(jack['birth_year'])

if 'birth_year' in jack:
    print(jack['birth_year'])


# re-assign values inside a dictionary
if 'name' in jack:
    jack['name'] = 'Huy Duc Nguyen' # can only change values with direct access
    # jack.get('name') = 'Huy Duc Nguyen' # => error


# add a new pair:
jack.update({ 'food': 'phở' })
jack['games'] = ['valorant', 'toc chien']


# deleting a key-value pair
jack.pop(1)
# del jack[1]

print(jack)







# // TODO: time complexity + big O notation




