
1.	Pyłek:
Stwórz interfejs CarCustomization który będzie miał jedną metodę int getPrice() zwracającą cenę modyfikacji. Zaimplementuj ten interfejs tworząc klasy WindowTint, StereoSystem etc. , które będą miały różne ceny.
 
Stwórz klasę abstrakcyjną Car, która będzie miała 2 metody:
addCustomization(CarCustomization) – dodanie modyfikacji do listy modyfikacji w samochodzie
int calculatePrice() – wyliczenie ceny razem z dodanymi modyfikacjami
Rozszerz klasę Car tworząc różne samochody np. Mazda, Audi, etc. , które będą miały różne ceny.
Aby przetestować działanie stwórz wiele różnych samochodów z różnymi modyfikacjami i sprawdź, czy cena liczona jest poprawnie.

2.	Dekorator:
Stwórz interfejs Word, który będzie zawierał metodę display wypisującą słowo na ekran. Stwórz klasę implementującą ten interfejs – NormalWord, która będzie wypisywała na ekran zwykłe słowo. Stwórz klasę WordDecorator implementującą interfejs Word, która będzie w sobie przechowywała instancję klasy Word i będzie ją przyjmowała w konstruktorze. Stwórz kilka klas rozszerzających klasę WordDecorator np. Prefix, albo Siffix, które będą dodawać pare literek z przodu i z tyłu słowa. Stwórz testy do powyższych klas



3.	Metoda szablonowa:
Stwórz klasę AbstractMoneyTransfer, która będzie szablonem przelewu. Dodaj w niej metodę publiczną performTransfer(int amount), która wykona następujące metody w podanej kolejności:
prepareTransfer() – metoda abstrakcyjna w której klasy diedziczące rozpoczynają proces przelewu (może po prostu wypisywać na ekran „Starting transfer from bank - <bank name>…”)
addCommission() – metoda abstrakcyjna w której klasy dziedziczące będą dodawać swoją prowizję
sendMoney() – metoda finalna która przeleje pieniądze (może po prostu wypisywać na ekran „Transfering money…”)
Stwórz klasy – PkoMoneyTransfer, BzwbkMoneyTransfer etc., które będą overridować metody prepareTransfer i addCommision.
4.	Strategia:
Zmień metodę addCommision(ForeignTransferCommisionStrategy) tak aby przyjmowała interfejs ForeignTransferCommisionStrategy, który będzie się zajmował zwiększaniem prowizji przy przelewach zagranicznych. Dodaj klasy implementujące CommisionStrategy: PolishCommision (brak prowizji), UsaCommision – prowizja 50 zl, EuCommision – 10zl


5.	Obserwator:
Spraw aby klasa AbstractMoneyTransfer rozszerzała klasę Observable i wysyłała informacje o każdym przelewie do swoich obserwatorów. Zaimplementuj kilka klas implementujących interfejs Observer: KnfTransferObserver, HackerTransferObserver, FbiTransferObserver

Przetestuj powyższe funkcjonalności dodając testy jednostkowe i integracyjne

