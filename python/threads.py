import threading
import queue
import time

def produtor(fila):
    i = 1
    while True:
        time.sleep(1) 
        mensagem = f"Mensagem {i}"
        fila.put(mensagem)
        i+=1
        print(f"Produzido: {mensagem}")

def consumidor(fila, name):
    lista = list()
    while True:
        mensagem = fila.get()
        lista.append(mensagem)
        print(f"Consumido {name}: {mensagem} -> {name}'s bag {len(lista)}")
        print(lista)
        fila.task_done()
fila = queue.Queue()
produtor_thread = threading.Thread(target=produtor, args=(fila,))
consumidor_thread1 = threading.Thread(target=consumidor, args=(fila,'Bob',))
consumidor_thread2 = threading.Thread(target=consumidor, args=(fila,'Maria',))
produtor_thread.start()
consumidor_thread1.start()
consumidor_thread2.start()
produtor_thread.join()
consumidor_thread1.join()
consumidor_thread2.join()
print("Threads finalizadas")