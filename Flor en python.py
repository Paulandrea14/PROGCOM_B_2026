import turtle

tortuga = turtle.Turtle()
tortuga.speed(0)
tortuga.width(1)

colores = ["red", "orange", "yellow", "green", "purple", "pink"]

for i in range(36):
    tortuga.color(colores[i % len(colores)])
    
    tortuga.circle(100, 60)
    tortuga.left(120)
    tortuga.circle(100, 60)
    tortuga.left(10)

turtle.done()