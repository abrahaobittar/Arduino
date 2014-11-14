//semaforo a esquerda
int dVermelho = 0;
int dAmarelo = 1;
int dVerde = 2;

//semaforo a esquerda
int eVermelho = 5;
int eAmarelo = 4;
int eVerde = 3;

void setup() {
   pinMode(dVermelho,OUTPUT);
   pinMode(dAmarelo,OUTPUT);
   pinMode(dVerde,OUTPUT);
   pinMode(eVermelho,OUTPUT);
   pinMode(eAmarelo,OUTPUT);
   pinMode(eVerde,OUTPUT);
}

void loop() {
  digitalWrite(dVerde,HIGH);
  digitalWrite(eVermelho,HIGH);
  delay(1000);
  digitalWrite(dVerde,LOW);
  digitalWrite(dAmarelo,HIGH);
  delay(500);
  digitalWrite(eVermelho,LOW);
  digitalWrite(dAmarelo,LOW);
  digitalWrite(eVerde,HIGH);
  digitalWrite(dVermelho,HIGH);
  delay(1000);
  digitalWrite(eVerde,LOW);
  digitalWrite(eAmarelo,HIGH);
  delay(500);
  digitalWrite(eAmarelo,LOW);
  digitalWrite(dVermelho,LOW);
}  
