# DiceClass
Problemi që duhet zgjidhur është:
- Write a model class that represents a die ( that is, a cube whose sides are numbered 1 to 6).
The class will likely have just one method, throw(), and no atributes.
( Hint: use Math.random() to write throw. ) Then , write an output-view class that displays after it has been thrown.
Finally, write a controller that lets a user throw two dice repeatedly. -

Zgjidhja:

Zgjidhja e këtij problemi është bërë në mënyrë deduktive, pasi është menduar gjenerimi i një numri të rastësishëm mund të bëhet me anë të metodës Math.Random() që është pjesë e klasës Math (Pjesë e java.lang , nuk ka nevoj të importohet) dhe mbasi kërkesa e detyrës është që progarami të afishohet përmes dritareve grafike është nënkuptuar nevoja e importimit të paketës javax.swing  e cila përmban në vete klasën JoptionPane. Struktura e programit është bërë në bazë të arkitekturës MVC (Model-View-Controller) ku e kemi bërë ndarjen në katër klasë të ndryshme të cilat jan lidhur me njëra tjetrën me anë të klasës që përmban metodën Main.
Për të shkruar secilën klasë janë përdorur dy rrethina integruese (Jgrasp dhe IntelliJ).

Klasët janë shkruar në këtë mënyrë:
Klasa DiceController, së pari jan krijuar dy variabla të fushës të cilat më pastaj te konstruktori i klasës bëjnë deklarimin e klasave DiceView dhe DiceModel, dhe është shkruar një metodë e cila për detyrë ka kontrollimin e hedhjes së zareve por së pari duhet të shikoj nëse shfrytëzuesi dëshiron të procedoj me programin.
Klasa DiceModel, përfshinë modelin se si duhet të hidhet zari për këtë arsye ka vetëm një metodë të emërtuar throwDice e cila ka për detyrë të hedh zarin në mënyrë të rëndomtë (duke përdorur Math.random()).
Klasa DiceView, detyrë kryesore ka marrjen e të dhënave nga klasa DiceModel dhe në bazë të rezultatit të afishoj atë rezultat. Klasa DiceView  është e ndarë në Input-View dhe Output-View, të cilët kanë për detyrë marrjen e urdhërit nga shfrytëzuesi nëse dëshiron të procedoj me programin dhe afishimin e rezultatit të fituar me anë të dritares grafike.
Klasa DiceMain, është pjesa e programit që e përmban metodën main e cila ka për detyrë egzekutimin e programit, kjo klasë bënë instancimin e klasëve të tjera në mënyrë që të egzekutoj programin që është i shkruar në të gjitha klasët tjera.


