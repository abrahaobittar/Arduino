int led = 13;
char dado;

void setup()
{
  Serial.begin(9600);
  pinMode(led,OUTPUT);  
}

void loop()
{
  if(Serial.available() > 0) {
    dado = Serial.read();
    
    switch(dado) {
      case 'A':
        digitalWrite(led,HIGH);
        delay(30);
        break;
      case 'B': 
        digitalWrite(led,LOW);
         delay(30);
         break;
    }
  }  
}
