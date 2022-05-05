#
#   TO DO:
#       Show boxes
#       Make boxes buttons
#       Hide on default
#       On Click things
#       check adjacent
#       everything
#       endless work
#       help
#

from operator import truediv
import pygame
import numpy as np
pygame.init()

white = (255, 255, 255)
black = (0, 0, 0)
orange = (255, 165, 0)

screen = pygame.display.set_mode([500, 500])

difficulty = 0 # 1-easy 2-medium 3-hard



menu = True
while menu:
    for event in pygame.event.get():
        if event.type == pygame.QUIT:
            menu = False

        if event.type == pygame.MOUSEBUTTONDOWN:
            if 25 <= pygame.mouse.get_pos()[0] <= (25 + 125) and 50 <= pygame.mouse.get_pos()[1] <= (50 + 75):
                difficulty = 1
                menu = False 
            elif 185 <= pygame.mouse.get_pos()[0] <= (185 + 125) and 50 <= pygame.mouse.get_pos()[1] <= (50 + 75):
                difficulty = 2
                menu = False
            elif 345 <= pygame.mouse.get_pos()[0] <= (345 + 125) and 50 <= pygame.mouse.get_pos()[1] <= (50 + 75):
                difficulty = 3
                menu = False

    screen.fill(white)

    screen.fill(orange, (25, 50, 125, 75))
    
    screen.fill(orange, (185, 50, 125, 75))
    screen.fill(orange, (345, 50, 125, 75))

    font = pygame.font.Font('freesansbold.ttf', 28)

    btn1Text = font.render('Easy', True, (black), (orange))
    btn1TextRect = btn1Text.get_rect()
    btn1TextRect.center = (25 + 125 / 2, 50 + 75 / 2)
    screen.blit(btn1Text, btn1TextRect)

    btn2Text = font.render('Medium', True, (black), (orange))
    btn2TextRect = btn2Text.get_rect()
    btn2TextRect.center = (185 + 125 / 2, 50 + 75 / 2)
    screen.blit(btn2Text, btn2TextRect)

    btn3Text = font.render('Hard', True, (black), (orange))
    btn3TextRect = btn3Text.get_rect()
    btn3TextRect.center = (345 + 125 / 2, 50 + 75 / 2)
    screen.blit(btn3Text, btn3TextRect)

    pygame.display.update()

if difficulty == 1:
    bombs = 8
elif difficulty == 2:
    bombs = 40
elif difficulty == 3:
    bombs = 99

row = (8 * difficulty)
col = row
arr = np.zeros(((8 * difficulty) * (8 * difficulty), 1))
for i in range(0, bombs):
    arr[i] = 1
np.random.shuffle(arr)
arr = arr.reshape(8 * difficulty, 8 * difficulty)

np.random.shuffle(arr)

print(arr)

running = True
while running:
    for event in pygame.event.get():
        if event.type == pygame.QUIT:
            running = False

    screen.fill(white)



    pygame.display.update()
