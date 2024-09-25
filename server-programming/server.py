# print('hello from server')
# next step: connect gemini API into this server


from fastapi import FastAPI

app = FastAPI()

# endpoint
@app.get("/")
def read_root():
    return {"message": "Hello World"}

    
@app.get('/hello/{name}')
def say_hello_to_name(name: str):
    return {"message": f"Hello {name.capitalize()}"}


@app.get('/calculate/{a}/{operator}/{b}')
def calculate(a: int, operator: str, b: int):
    # operator: + - * :
    result = 0
    if operator == '+':
        result = a + b
    elif operator == '-':
        result = a - b
    elif operator == 'x':
        result = a * b
    elif operator == ':':
        result = a / b
    else:
        return {"message": "Invalid operator"}
    
    return {"result": result}



@app.get("/items/{item_id}")
def read_item(item_id: int):
    return {"item_id": item_id}
