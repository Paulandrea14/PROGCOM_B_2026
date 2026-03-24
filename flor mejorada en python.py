from PIL import Image, ImageDraw
import math
import random
import numpy as np

def bezier_point(t, p0, p1, p2, p3):
    t_inv = 1 - t
    point = (t_inv**3) * np.array(p0) + \
            3 * (t_inv**2) * t * np.array(p1) + \
            3 * t_inv * (t**2) * np.array(p2) + \
            (t**3) * np.array(p3)
    return tuple(point.astype(int))

def draw_bezier_curve(draw, points, color, width=3):
    p0, p1, p2, p3 = points
    steps = 40
    curve_points = [bezier_point(t/steps, p0, p1, p2, p3) for t in range(steps + 1)]
    draw.line(curve_points, fill=color, width=width, joint='round')

def generar_ramo_frondoso():
    # 1. Lienzo HD
    res = 1000
    img = Image.new("RGB", (res, res), "#BBECFF")
    draw = ImageDraw.Draw(img)

    # 2. Dibujar el Cono base
    draw.polygon([(350, 450), (650, 450), (500, 950)], fill="#FCE0D4", outline="black", width=4)
    draw.line([(500, 450), (500, 950)], fill="#E5C5B5", width=3)

    # --- NUEVA SECCIÓN: MUCHAS VARAS VERDES ---
    verde_oscuro = "#1B911B"
    verde_claro = "#22B622"
    
    # Generamos 8 varas con curvas aleatorias
    for i in range(8):
        # Punto de inicio (detrás de las flores)
        start_x = random.randint(420, 580)
        start_y = 400
        
        # Punto final (dispersos arriba)
        end_x = random.randint(150, 850)
        end_y = random.randint(80, 250)
        
        # Puntos de control para que la curva sea elegante
        cp1 = (start_x + random.randint(-100, 100), 300)
        cp2 = (end_x + random.randint(-50, 50), 250)
        
        color = random.choice([verde_oscuro, verde_claro])
        ancho = random.randint(3, 6)
        
        # Dibujar la vara
        puntos = [(start_x, start_y), cp1, cp2, (end_x, end_y)]
        draw_bezier_curve(draw, puntos, color, width=ancho)
        
        # Bolita decorativa en la punta
        r = random.randint(8, 12)
        draw.ellipse([end_x-r, end_y-r, end_x+r, end_y+r], fill=color, outline="black", width=2)

    # 3. Flores Principales
    flores = [
        (420, 360, "#FFADAD"), (580, 360, "#42ADE0"),
        (500, 300, "#FF9B3B"), (380, 440, "#FFCBAD"),
        (620, 440, "#B797EE"), (500, 420, "#FFFFFF")
    ]

    for x, y, col in flores:
        radio = 45
        for i in range(6):
            ang = math.radians(i * 60)
            px, py = x + math.cos(ang)*30, y + math.sin(ang)*30
            draw.ellipse([px-radio, py-radio, px+radio, py+radio], fill=col, outline="black", width=3)
        
        # Centro
        draw.ellipse([x-20, y-20, x+20, y+20], fill="#FFD700", outline="black", width=3)

    # 4. Moño
    draw.polygon([(380, 780), (500, 850), (380, 920)], fill="#FF7EBA", outline="black", width=4)
    draw.polygon([(620, 780), (500, 850), (620, 920)], fill="#FF7EBA", outline="black", width=4)
    draw.ellipse([460, 810, 540, 890], fill="#FF7EBA", outline="black", width=4)

    # 5. Suavizado final
    img_final = img.resize((500, 500), resample=Image.LANCZOS)
    img_final.show()
    img_final.save("ramo_frondoso.png")
    print("¡Listo! El ramo frondoso se ha guardado.")

generar_ramo_frondoso()