## Despelgamos las instancia  ec2, en este caso, desplegué tres isntancia una para service1, otra para sercvice2 y finalmente una para el proxy

Podemos ver que estan corriendo las instancia mencionadas:

<img width="1077" height="36" alt="image" src="https://github.com/user-attachments/assets/5fff1c6c-9a23-4116-be0a-fcf3823bef75" />

<img width="1364" height="595" alt="image" src="https://github.com/user-attachments/assets/2ece0819-d292-4f93-b97d-0c9799aafbc8" />

## Nos conectamos a cada una de las intancia por la consola cmd

Al proxy

ssh -i "proxy.pem" ec2-user@ec2-18-232-176-11.compute-1.amazonaws.com

Al service1

ssh -i "service1.pem" ec2-user@ec2-98-88-20-154.compute-1.amazonaws.com
Al service2

ssh -i "service2.pem" ec2-user@ec2-100-24-38-215.compute-1.amazonaws.com


Ahora, debemos pasar ej archivo ejecutable correspondiente para cada instancia, en este caso, subirmos el arhchivo .jar del proxy a la maquian dle proxy, el serchivo ejecutable del service 1 
a la maquina del service y final,mente el archivo ejecutable del service 2 a  la maquina del servic2 con el siguiente comando en cada caso

cp -i "llave.pem" "direccion del ejectuble.jar" ec2-user@<ip de la maquina>:/home/ec2-user/

Ahora instalamos java en cada maquina virtual con el comando:

sudo jum install java-17-amazon-corretto -y



Ejecutamos los archivos ejecutbles con los siguientes comandos



java -jar mathService2-0.0.1-SNAPSHOT
<img width="1108" height="525" alt="image" src="https://github.com/user-attachments/assets/c6334726-07b5-4a20-9537-5f1855d51668" />

java -jar MathService1-0.0.1-SNAPSHOT
<img width="1108" height="525" alt="image" src="https://github.com/user-attachments/assets/4c8a7e43-252e-44aa-9226-8f566190232f" />

java -jar proxy-0.0.1-SNAPSHOT
<img width="1102" height="377" alt="image" src="https://github.com/user-attachments/assets/7e8a2a5e-192d-4655-bde4-8a30ef84d208" />


Ingresamos con la ip del proxy y el pruerto por donde está corriendo, en este caso la direccion es la siguiente:

http://18.232.176.11:8083/

podemos ver que nos redirige a nuestra pagina:

<img width="454" height="417" alt="image" src="https://github.com/user-attachments/assets/38f55adf-5973-472a-9bd6-5f687f309adb" />

Probamoos las funciones matematicas de primes y factor:


<img width="1060" height="233" alt="image" src="https://github.com/user-attachments/assets/402eca8b-3cb2-4e56-b55b-dadf0b173d4d" />

Vemos que funciona correctamente y recibe la solicitud:

<img width="551" height="411" alt="image" src="https://github.com/user-attachments/assets/dc6c7fe5-fbff-46b8-8efe-f6184017e09b" />


Ahora para la funciones de factores:

<img width="805" height="435" alt="image" src="https://github.com/user-attachments/assets/8eb9d7f0-e2c6-43b5-b6b1-f5e04a780b20" />

Funciona correctamente y recibe la solicitud de forma correcta como se ve a continuacion:

<img width="556" height="417" alt="image" src="https://github.com/user-attachments/assets/4a5f3525-63b0-4a2c-a262-070e491f5639" />

