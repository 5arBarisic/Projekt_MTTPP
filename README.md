# <h1 align="center">Radni okvir za automatsko testiranje mrežne stranice</h1>
Ovaj radni okvir je napravljen za automatsko testiranje jednostavne mrežne stranice za [putovanje](https://www.phptravels.net/). Napisan je u Intellij radnom okruženju koristeći java programski jezik. Korišten je Maven alat zajedno sa Selenium podrškom za automatizaciju mrežnog preglednika. 

## Način korištenja 

1. Skinuti i instalirati [Intellij](https://www.jetbrains.com/idea/download/#section=windows) radno okruženje.

2. Skinuti *project* direktorij i učitati ga pomoću Intellij-a.

3. Otići na *pom.xml* datoteku i pritisnuti Ctrl+Shift+O kako bi Maven skinuo i učitao sve verzije alata koje su korištene.

4. Otići na *TestForm* datoteku i pritisnuti Ctrl+Shift+F10 kako bi se pokrenu cijeli test ili odabrati neki od 5 testnih metoda i pritisnuti Ctrl+Shift+F10 za pokretanje pojedinačnog testnog slučaja.

## Testovi
Testiranje se sastoji od 5 testnih slučajeva. Radi lakšeg korištenja i preglednosti programskog koda, svaki slučaj ima svoju klasu sa svim potrebnim atributima i metodama za  njegovo izvršavanje. 

### 1. Test
Testira se prijava na mrežnu stranicu. Ovaj test se koristi zajedno s ostala 4 testna slučaja jer je neophodan za njihovo izvođenje.
- Testna metoda: t1_loginTest()
- Pripadajuća klasa: LoginForm

### 2. Test
Testira se pretraga hotela za određeni grad (Pariz) na najbliži slobodni datum.
- Testna metoda: t2_searchHotelTest()
- Pripadajuća klasa: HotelForm

### 3. Test 
Testira se pretraga leta između dva odabrana grada (Dublin – San Diego), u oba smjera za određeni datum polaska (20.10.2022) i dolaska (10.11.2022).
- Testna metoda: t3_searchFlightTest()
- Pripadajuća klasa: FlightForm

### 4. Test 
Testira se kreiranje vize iz određene države (Afganistan) za određenu državu (Brazil), upisuju se osobni podaci (ime, prezime, email, telefon) i datum (20.10.2022) .
- Testna metoda: t4_submitVisaTest()
- Pripadajuća klasa: VisaForm

### 5. Test
Testira se promjena valute u odabranu valutu (Euro), prijava za obilazak određenog grada (Dubai), odabiranje datuma obilaska (20.10.2022) i unos broja odraslih (2), maloljetnika (14-18 g.) (2) i djece (1).
- Testna metoda: t5_bookTourTest()
- Pripadajuća klasa: TourForm


## Dodatno
- Sleep metoda korištena isključivo vizualno za lakšeg praćenja izvođenja testa te se inače ne preporučuje jer namjerno usporava njegovo izvršavanje.
- Wait metoda za čekanje prikaza određenog dijela stranica kako bi osigurali valjanost testa.
- Testiranje je moguće izvršiti na 3 različita preglednika (*Google Chrome, Microsoft Edge* i *Mozilla Firefox*). Treba zakomentirati označene dijelove za preglednike koji se ne koriste i odkomentirati za onaj koji se koristi .
