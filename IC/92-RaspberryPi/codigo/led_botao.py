import RPi.GPIO as GPIO
import time
GPIO.setmode(GPIO.BCM)
GPIO.setup(21,GPIO.IN, pull_up_down=GPIO.PUD_UP)
While True:
    GPIO.wait_for_edge(21,GPIO.FALLING)
    print("Botao Pressionado")
    GPIO.wait_for_edge(21,GPIO.RAISING)
    print("Botao Largado")
GPIO.cleanup()