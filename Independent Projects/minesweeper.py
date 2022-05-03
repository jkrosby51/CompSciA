from operator import truediv
import pygame
pygame.init()

white = (255, 255, 255)
black = (0, 0, 0)
orange = (255, 165, 0)

screen = pygame.display.set_mode([500, 500])

menu = True
while menu:
    for event in pygame.event.get():
        if event.type == pygame.QUIT:
            menu = False

    screen.fill(white)

    screen.fill(orange, (25, 50, 125, 75))
    
    screen.fill(orange, (185, 50, 125, 75))
    screen.fill(orange, (345, 50, 125, 75))

    pygame.display.update()

running = True
while running:

    for event in pygame.event.get():
        if event.type == pygame.QUIT:
            running = False

    screen.fill(white)

    pygame.display.update()
