from PIL import Image, ImageDraw, ImageFilter
import math
import random

def dibujar_ramo_pro():
    tamano_grande = 1000
    img = Image.new("RGB", (tamano_grande, tamano_grande), "#BBECFF") 
    draw = ImageDraw.Draw(img)

    cono_pts = [(350, 450), (650, 450), (500, 950)]
    draw.polygon(cono_pts, fill="#FCE0D4", outline="black", width=4)
    draw.line([(500, 450), (500, 950)], fill="#E5C5B5", width=3)

    flores = [
        (420, 360, "#FFADAD"), 
        (580, 360, "#42ADE0"), 
        (500, 300, "#FF9B3B"), 
        (380, 440, "#FFCBAD"), 
        (620, 440, "#B797EE"), 
        (500, 420, "#FFFFFF"), 
    ]

    for x, y, col in flores:
        radio_petalo = 45
        for i in range(6):
            angulo = math.radians(i * 60)
            px = x + math.cos(angulo) * (radio_petalo * 0.7)
            py = y + math.sin(angulo) * (radio_petalo * 0.7)
            
            caja = [px - radio_petalo, py - radio_petalo, px + radio_petalo, py + radio_petalo]
            draw.ellipse(caja, fill=col, outline="black", width=3)
            
        centro_caja = [x-20, y-20, x+20, y+20]
        draw.ellipse(centro_caja, fill="#FFD700", outline="black", width=3)
        
        for _ in range(8):
            px, py = x + random.randint(-10, 10), y + random.randint(-10, 10)
            draw.point((px, py), fill="#B8860B")

    draw.polygon([(380, 780), (500, 850), (380, 920)], fill="#FF7EBA", outline="black", width=4)
    draw.polygon([(620, 780), (500, 850), (620, 920)], fill="#FF7EBA", outline="black", width=4)
    draw.ellipse([460, 810, 540, 890], fill="#FF7EBA", outline="black", width=4)

    img_final = img.resize((500, 500), resample=Image.LANCZOS)
    
    img_final.show()
    img_final.save("mi_ramo_mejorado.png")
    print("¡Listo! Tu imagen se ha guardado como 'mi_ramo_mejorado.png'")

dibujar_ramo_pro()