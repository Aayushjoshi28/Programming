
import math
from processing import *

X = 30
Y = 30
gravity=9.81
angle=70
velocity=80
vx=velocity * math.cos(math.radians(angle))
vy=velocity * math.sin(math.radians(angle))
t=0

def setup():
    strokeWeight(10)
    frameRate(100)
    size(400,400)

def throwBall():
    global X, Y, radius, gravity, t,vx,vy
    background(100)
    fill(0,121,184)
    stroke(255)
    fc = environment.frameCount
    t +=0.02
    X = vx*t
    Y = 400 -(vy*t - (gravity/2)*t*t)

    ellipse(X,Y,30,30)


draw = throwBall 
run()