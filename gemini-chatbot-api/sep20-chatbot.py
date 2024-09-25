import os
import google.generativeai as ai
from dotenv import load_dotenv
import PIL.Image

load_dotenv()
ai.configure(api_key=os.getenv('API_KEY')) # Protect the API KEY using env file

model = ai.GenerativeModel('gemini-1.5-flash') # constructor

# chat_history = [] # list of dictionaries

# role: "user" | "model"
# parts: "str"

# chat context

# chat_history.append({ "role": "user", "parts": "what is 1 + 1?" })
# chat_history.append({ "role": "model", "parts": "1 + 1 equals 2." })

# start a fresh session
chat_session = model.start_chat()

print('Welcome to Jack\'s Gemini Chatbot!')
while True:
    prompt = input('\n> You: ')
    res = chat_session.send_message(prompt, stream=True)

    print('> Bot: ', end="")
    for chunk in res:
        print(chunk.text, end="")
        
    # print('current history:', chat_session.history)
