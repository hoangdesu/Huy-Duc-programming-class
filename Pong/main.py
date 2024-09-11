from random import randint
from re import X
import sys
from tkinter.tix import WINDOW
from turtle import left
import pygame as pg
from pygame.locals import(

    K_UP,
    K_DOWN,
    K_w,
    K_s
)

pg.init()

WINDOW_W = 1000
WINDOW_H = 800

window = pg.display.set_mode((WINDOW_W, WINDOW_H))
pg.display.set_caption("Pong")

clock = pg.time.Clock()

font = pg.font.Font(pg.font.get_default_font(), 36)


PADDLE_WIDTH = 15
PADDLE_HEIGHT = 60

paddle_speed = 5

left_x = 10

left_y = WINDOW_H/2 - 10

right_x = 975

right_y = WINDOW_H/2 - 10

rect_y = 20

ballz_x = WINDOW_W/2
ballz_y = WINDOW_H/2

x_direction = randint(1, 1)
y_direction = randint(-1, 1)

left_score = 0
right_score = 0
left_score_text = font.render(str(left_score), True, (200, 200, 200))
right_score_text = font.render(str(right_score), True, (200, 200, 200))

pg.mixer.init()
pg.mixer.music.load('./audio/point.wav')
pg.mixer.music.load('./audio/edge.wav')
pg.mixer.music.load('./audio/win.mp3')
pg.mixer.music.load('./audio/paddle.mp3')

while (x_direction == 0) or (y_direction == 0):
    x_direction = randint(-1, 1)
    y_direction = randint(-1, 1)




while True:
    for event in pg.event.get():
        if event.type == pg.QUIT:
            sys.exit()
        if event.type == pg.KEYDOWN:
            if event.key == pg.K_ESCAPE:
                sys.exit()
            if event.key == pg.K_SPACE:
                ballz_x = WINDOW_W / 2
                ballz_y = WINDOW_H / 2
                x_direction = randint(1, 1)
                y_direction = randint(-1, 1)

                while (x_direction == 0) or (y_direction == 0):
                    x_direction = randint(-1, 1)
                    y_direction = randint(-1, 1)

    keys_pressed = pg.key.get_pressed()

    if keys_pressed[K_DOWN]:
        if right_y < WINDOW_H - PADDLE_HEIGHT:
            right_y += paddle_speed
        elif right_y >= WINDOW_H - PADDLE_HEIGHT:
            right_y = WINDOW_H - PADDLE_HEIGHT
    if keys_pressed[K_UP]:
        if right_y > 0:
            right_y -= paddle_speed
        elif right_y < 0:
            right_y = 0
    if keys_pressed[K_w]:
        if left_y > 0:
            left_y -= paddle_speed
        elif left_y < 0:
            left_y = 0
    if keys_pressed[K_s]:
        if left_y <= WINDOW_H - PADDLE_HEIGHT:
            left_y += paddle_speed
        elif left_y > WINDOW_H - PADDLE_HEIGHT:
            left_y = WINDOW_H - PADDLE_HEIGHT

    window.fill((0,0,0))

    pg.draw.rect(
        window,
        (0,0,255),
        pg.Rect(left_x, left_y, PADDLE_WIDTH, PADDLE_HEIGHT)
    )

    pg.draw.rect(
        window,
        (255,0,0),
        pg.Rect(right_x, right_y, PADDLE_WIDTH,PADDLE_HEIGHT)
    )

    for i in range(20):
        pg.draw.rect(
            window,
            (255,255,255),
            pg.Rect(500-2.5, rect_y*i*2+10, 5, 30)
        )
   
    window.blit(left_score_text, dest=(50, 40))
    window.blit(right_score_text, dest=(WINDOW_W - 80, 40))


    # Ball 
    pg.draw.circle(
        window,
        (100,30,255),
        (ballz_x,ballz_y),
        10
    )

    # collision check with the left and right paddles
    if (ballz_x > left_x) and (ballz_x < left_x + PADDLE_WIDTH) and (ballz_y > left_y) and (ballz_y < left_y + PADDLE_HEIGHT):
        x_direction = -x_direction
        pg.mixer.music.play('./audio/paddle.mp3')

    if (ballz_x > right_x) and (ballz_x < right_x + PADDLE_WIDTH) and (ballz_y > right_y) and (ballz_y < right_y + PADDLE_HEIGHT):
        x_direction = -x_direction
        pg.mixer.music.play('./audio/paddle.mp3')

    if ballz_y < 0 or ballz_y > WINDOW_H:
        y_direction = -y_direction
        # pg.mixer.music.play('./audio/edge.wav')
        
    
    ballz_x += (x_direction * 2)
    ballz_y += (y_direction * 2)

    if ballz_x >  WINDOW_W:
        left_score += 1
        # print(left_score)
        ballz_x = WINDOW_W/2
        ballz_y = WINDOW_H/2
        x_direction = -x_direction
        left_score_text = font.render(str(left_score), True, (200, 200, 200))
        # pg.mixer.music.play('./audio/point.wav')

    elif ballz_x < 0:
        right_score += 1
        # print(right_score)
        ballz_x = WINDOW_W/2
        ballz_y = WINDOW_H/2
        x_direction = -x_direction
        right_score_text = font.render(str(right_score), True, (200, 200, 200))
        # pg.mixer.music.play('./audio/point.wav')
    

    if left_score == 10 or right_score == 10:
        ballz_x = WINDOW_W / 2
        ballz_y = WINDOW_H/2
        ballz_x += 0
        ballz_y += 0
        pg.mixer.music.play('./audio/win.mp3')

    clock.tick(144)
    # print(clock.get_fps())
    
    pg.display.flip()