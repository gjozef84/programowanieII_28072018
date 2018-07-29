1.	Napisz klasę Czlowiek, która będzie posiadała 3 pola – imie, nazwisko i wiek.
2.	Dodaj do niej metodę abstrakcyjną „ String przywitajSie() „ , która będzie zwracać sposób przywitania się danego człowieka. Zostanie ona zaimplementowana w klasach dziedziczących po klasie Czlowiek.
3.	Stwórz klasę Kulturalny, która będzie dziedziczyć po klasie Czlowiek. Zaimplementuj w niej metodę przywitajSie tak, aby zwracała „Uszanowanko” .
4.	Stwórz klasę Gbur, która będzie dziedziczyć po klasie Czlowiek. Zaimplementuj w niej metodę przywitajSie tak, aby zwracała „Nie przeszkadzaj mi” .
5.	Chcemy aby podczas tworzenia obiektów klasy Kulturalny i klasy Gbur podawanie wieku było opcjonalne, a imienia i nazwiska – wymagane. Zaimplementuj taką funkcjonalność używając wzorca Builder.
6.	W klasie Czlowiek zaimplementuj metodę „ String przedstawSie() „ , która zawoła metodę przywitajSie() i zwróci jej wynik skonkatenowany z „ , jestem „ i imieniem i nazwiskiem i wiekiem (jeśli został on ustawiony).
7.	Chcemy mieć możliwość stworzenia człowieka, który będzie mógł przywitać się w dowolny sposób. Skorzystamy w tym celu z wzorca Strategia. Dodaj interfejs StrategiaPrzywitania, która będzie zawierała metodę przywitanie() .
8.	Stwórz klasę CzlowiekMarionetka , która będzie przyjmowała w konstruktorze klasę implementującą interfejs typu StrategiaPrzywitania i wykorzystywała jego metodę w metodzie przywitajSie .
9.	Stwórz 3 dowolne imlementacje interfejsu StrategiaPrzywitania.
10.	Napisz testy dla klas – Kulturalny, Gbur i CzlowiekMarionetka
11.	Stwórz klasę SpisLudnosci , która będzie posiadała pole typu List<Czlowiek> przechowujące listę ludzi.
12.	Dodaj w klasie SpisLudnosci konstruktor, który będzie przyjmował listę ludności w postaci stringa w następującym formacie – „  Adam, Kowalski, 21 ; Karol, Janiak, 31 ; Anna, Marzanna, 18 ; Kasia, Kowalska, 30 ” – i dodawał wszystkich ludzi do listy. Podpowiedź: najpierw wywołaj metodę split(„ ; ”) na przyjmowanym Stringu. Otrzymasz wtedy tablicę elementów gdzie pierwszy element to „Adam, Kowalski, 21”, drugi to „Karol, Janiak, 31”, i tak dalej. Następnie przeiteruj się po tej tablicy. Podczas iteracji zawołaj metodę split(„ , „). Ona zwróci tablicę z 3 elementami, których możesz teraz użyć do stworzenia obiektu klasy Kulturalny i dodania go do listy.
*Zaimplementuj konstruktor tak, aby obsługiwał też przypadki, gdzie czasem wiek nie jest podany, czyli np. „ Adam, Kowalski ; Anna, Kowalska, 31 ; Janusz, Adamowski, 20 ; Stefan, Kubek „
*Zaimplementuj konstruktor tak, aby obsługiwał przypadki gdzie pierwszym elementem będzie typ człowieka jakiego ma stworzyć . Dla g ma stworzyć obiekt typu Gbur, a dla k typu Kulturalny, czyli  np. „ k, Jan, Kowalski, 32 ; g, Anna, Marzanna ; g, Adam, Tadam, 32” .







*Zaimplementuj konstruktor tak, aby przyjmował String typu:
<Ludzie>
	<Czlowiek>
		<Typ>g</Typ>
		<Imie>Adam</Imie>
<Nazwisko>Kowalski</Nazwisko>
		<Wiek>21</Wiek>
	</Czlowiek>
<Czlowiek>
		<Typ>k</Typ>
		<Imie>Anna</Imie>
<Nazwisko>Marzanna</Nazwisko>
		<Wiek>18</Wiek>
	</Czlowiek>
</Ludzie>
Wyszukaj w internecie bibliotekę do parsowania xml, która umożliwi łatwe przetworzenie tego typu wartości.

13.	Zaimplementuj metodę, która zwróci listę osób o danym imieniu wykorzystując wyrażenie lambda.
14.	Zrób to samo dla Nazwiska i wieku.
15.	Zaimplementuj metodę, która zwróci listę osób młodszych niż podany wiek wykorzystując wyrażenie lambda.

