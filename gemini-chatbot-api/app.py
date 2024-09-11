# print('hi')

# create an empty for project
# - create a virtual env: "python3 -m venv ."
# - activate the venv: "source ./bin/activate"
# install dependencies

API_KEY = 'AIzaSyCPBayoBQ7YYYZcZzCmGiFqWhB73vHEx14'

# curl \
#   -H 'Content-Type: application/json' \
#   -d '{"contents":[{"parts":[{"text":"Explain how AI works"}]}]}' \
#   -X POST 'https://generativelanguage.googleapis.com/v1beta/models/gemini-1.5-flash-latest:generateContent?key=YOUR_API_KEY'

import requests
import json
# from markdown import markdown
# from rich.


URL = f'https://generativelanguage.googleapis.com/v1beta/models/gemini-1.5-flash-latest:generateContent?key={API_KEY}'

while True:
    user_input = input('User: ')
    if user_input == 'quit':
        break
    
    response = requests.post(URL, json={"contents":[{"parts":[{"text":user_input}]}]}, headers={'Content-Type': 'application/json'})
    # print(response)
    data = response.json()
    # print(data)

    # parsed_json = json.dumps(data, indent=4)
    # print(parsed_json)

    text = data['candidates'][0]['content']['parts'][0]['text']

    print('\nBot:', text)


