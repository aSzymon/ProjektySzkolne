var pionek = document.getElementById("pionek");
var przyciskKostka = document.getElementById("przyciskKostka");
var kostka = document.getElementById("kostka");

var polePionka = 0;
var iloscGrzybow = 0;

alert("Hejka !!! Miło cię widzieć (✿◠‿◠)");
var twojeImie = prompt("Jak się nazywasz ? (/≧▽≦)/");
alert("Witaj "+twojeImie+" ! Mam do ciebie prośbę... czy możesz mi pomóc zebrać pare grzybów?");
alert("Aby poruszać się po polach, musisz rzucić kostką i przejść pare pól odpowiadając na pytania na temat 'Ewolucja na poziomie populacji. Specjacja'. Będe bardzo wdzięczna za twoją pomoc ^o^");
alert("Uwaga! na kostce można maksymalnie wylosować 3 oczka!");
alert("Odpowiedzi podawaj dużymi literami : A B lub C");
alert("No to komu w drogę, temu czas! Zaczynamy (. ❛ ᴗ ❛.)");

losowanieKostka = () => {

    var wylosowanaLiczba = 1 + Math.floor(Math.random() * 3);

    polePionka = polePionka + wylosowanaLiczba;

    console.log(polePionka);

    if(polePionka == 1) {

        var pytanie1 = prompt("Co to jest pula genetyczna?                                                                      A)Pula genetyczna jest to specjalny kod charakterystyczny dla danej puli. genetynego.                                                                                                    B)Pula genowa to suma puli genetycznych wszystkich tworzących go populacji.                                                                                                    C)Pula genetyczna jest to kategoria kodu. genetycznego.                                                        Wpisz poprawną literke :");

        if(pytanie1 == "B") {
            pionek.style.left = '230px';
            pionek.style.top = '-100px';

            iloscGrzybow++;
        } else {
            alert("Zła odpowiedź! Tracisz Grzyba!! Nie możesz ruszyć dalej. Rzuć kostką ponownie! :C");

            iloscGrzybow--;
            polePionka = 0;
        }

    }

    if(polePionka == 2) {

        var pytanie2 = prompt("Co to jest gatunek?                                                                     A)Gatunek to grupa osobników zdolnych do krzyżowania się i wydawania płodnego potomstwa                                                                                                    B)Pula genowa to suma puli genetycznych wszystkich tworzących go populacji.                                                                                                    C)Pula genetyczna jest to kategoria kodu. genetycznego.                                                        Wpisz poprawną literke :");

        if(pytanie2 == "A") {

            pionek.style.left = '365px';
            pionek.style.top = '-160px';

            iloscGrzybow++;

        } else {
            alert("Zła odpowiedź! Tracisz Grzyba!! Nie możesz ruszyć dalej. Rzuć kostką ponownie! :C");

            iloscGrzybow--;
            polePionka = 0;
        }
    }

    if(polePionka == 3) {

        var pytanie3 = prompt("Co to dryf genetyczny?                                                                      A)Pula genetyczna jest to specjalny kod charakterystyczny dla danej puli. genetynego.                                                                                                    B)Dryfem genetycznym nazywamy przypadkowe zmiany częstości występywania alleli w puli genetycznej populacji.                                                                                                    C)Pula genetyczna jest to kategoria kodu. genetycznego.                                                        Wpisz poprawną literke :");

        if(pytanie3 == "B") {

            pionek.style.left = '496px';
            pionek.style.top = '-100px';

            iloscGrzybow++;

        } else {
            alert("Zła odpowiedź! Tracisz Grzyba!! Nie możesz ruszyć dalej. Rzuć kostką ponownie! :C");

            iloscGrzybow--;
            polePionka = 0;
        }
    }

    if(polePionka == 4) {

        var pytanie4 = prompt("Kiedy może wystąpić 'Efektu założyciela'?                                                                      A)Efekt założyciela może wystąpić wtedy, gdy mała grupa osobników zasiedli nowy teren i zostanie odizolowana od wyjściowej populacji.                                                                                                    B)Pula genowa to suma puli genetycznych wszystkich tworzących go populacji.                                                                                                    C)Pula genetyczna jest to kategoria kodu. genetycznego.                                                        Wpisz poprawną literke :");

        if(pytanie4 == "A") {

            pionek.style.left = '629px';
            pionek.style.top = '-175px';

            iloscGrzybow++;

        } else {
            alert("Zła odpowiedź! Tracisz Grzyba!! Nie możesz ruszyć dalej. Rzuć kostką ponownie! :C");

            iloscGrzybow--;
            polePionka = 0;
        }
    }

    if(polePionka == 5) {

        var pytanie5 = prompt("Kiedy występuje 'Efektu wąskiego gardła'?                                                                      A)Pula genetyczna jest to specjalny kod charakterystyczny dla danej puli. genetynego.                                                                                                    B)Efekt wąskiego gardła występuje najczęściej populacji dotkniętej katastrofą                                                                                                    C)Pula genetyczna jest to kategoria kodu. genetycznego.                                                        Wpisz poprawną literke :");

        if(pytanie5 == "B") {

            pionek.style.left = '552px';
            pionek.style.top = '-300px';

            iloscGrzybow++;

        } else {
            alert("Zła odpowiedź! Tracisz Grzyba!! Nie możesz ruszyć dalej. Rzuć kostką ponownie! :C");

            iloscGrzybow--;
            polePionka = 0;
        }
    }

    if(polePionka == 6) {

        var pytanie6 = prompt("Dlaczego utrzymują się allele warunkujące choroby genetyczne mimo doboru naturalnego?                                                                      A)Pula genetyczna jest to specjalny kod charakterystyczny dla danej puli. genetynego.                                                                                                    B)Allele mutacyjne warunkujące choroby genetyczne mogą przetrwać w populacji pomimo doboru naturalnego, jeśli ich częstość występowania jest niska lub jeśli choroba ma efekt późny, co oznacza, że jednostki zdążyły już przekazać allel mutacyjny swoim potomkom                                                                                                   C)Pula genetyczna jest to kategoria kodu. genetycznego.                                                        Wpisz poprawną literke :");

        if(pytanie6 == "B") {

            pionek.style.left = '400px';
            pionek.style.top = '-325px';

            iloscGrzybow++;

        } else {
            alert("Zła odpowiedź! Tracisz Grzyba!! Nie możesz ruszyć dalej. Rzuć kostką ponownie! :C");

            iloscGrzybow--;
            polePionka = 0;
        } 
    }

    if(polePionka == 7) {

        var pytanie7 = prompt("Co to specjacja?                                                                      A)Specjacja to proces powstawania nowych gatunków                                                                                                    B)Pula genowa to suma puli genetycznych wszystkich tworzących go populacji.                                                                                                    C)Pula genetyczna jest to kategoria kodu. genetycznego.                                                        Wpisz poprawną literke :");

        if(pytanie7 == "A") {

            pionek.style.left = '250px';
            pionek.style.top = '-300px';

            iloscGrzybow++;

        } else {
            alert("Zła odpowiedź! Tracisz Grzyba!! Nie możesz ruszyć dalej. Rzuć kostką ponownie! :C");

            iloscGrzybow--;
            polePionka = 0;
        }
    }

    if(polePionka == 8) {

        var pytanie8 = prompt("Na czym polega specjacja dzięki barierom geograficznym?                                                                     A)Pula genetyczna jest to specjalny kod charakterystyczny dla danej puli. genetynego.                                                                                                    B)Ten rodzaj specjacji polega na rozdzieleniu populacji na grupy przez barierę geometryczną.                                                                                                    C)Pula genetyczna jest to kategoria kodu. genetycznego.                                                        Wpisz poprawną literke :");

        if(pytanie8 == "B") {

            pionek.style.left = '120px';
            pionek.style.top = '-352px';

            iloscGrzybow++;

        } else {
            alert("Zła odpowiedź! Tracisz Grzyba!! Nie możesz ruszyć dalej. Rzuć kostką ponownie! :C");

            iloscGrzybow--;
            polePionka = 0;
        }
    }

    if(polePionka == 9) {

        var pytanie9 = prompt("Na czym polega specjacja bez barier geograficznych?                                                                      A)Pula genetyczna jest to specjalny kod charakterystyczny dla danej puli. genetynego.                                                                                                    B)Pula genowa to suma puli genetycznych wszystkich tworzących go populacji.                                                                                                    C)Ten rodzaj specjacji polega na podziale populacji na kilka grup bez obecności bariery geograficznej                                                        Wpisz poprawną literke :");

        if(pytanie9 == "C") {

            pionek.style.left = '60px';
            pionek.style.top = '-490px';

            iloscGrzybow++;

        } else {
            alert("Zła odpowiedź! Tracisz Grzyba!! Nie możesz ruszyć dalej. Rzuć kostką ponownie! :C");

            iloscGrzybow--;
            polePionka = 0;
        }
    }

    if(polePionka == 10) {

        var pytanie10 = prompt("Czym różni się pula genowa populacji od puli genowej gatunku?                                                                     A)Pula genetyczna jest to specjalny kod charakterystyczny dla danej puli. genetynego.                                                                                                    B)Pula genowa populacji obejmuje alleliczną różnorodność genów u wszystkich osobników w danej populacji, podczas gdy pula genowa gatunku obejmuje alleliczną różnorodność genów we wszystkich populacjach danego gatunku.                                                                                                   C)Pula genetyczna jest to kategoria kodu. genetycznego.                                                        Wpisz poprawną literke :");

        if(pytanie10 == "B") {

            pionek.style.left = '185px';
            pionek.style.top = '-570px';

            iloscGrzybow++;

        } else {
            alert("Zła odpowiedź! Tracisz Grzyba!! Nie możesz ruszyć dalej. Rzuć kostką ponownie! :C");

            iloscGrzybow--;
            polePionka = 0;
        }
    }

    if(polePionka == 11) {

        var pytanie11 = prompt("Co nie jest przyczyną zmian częstości występowania alleli w populacji?                                                                      A)Mutacje                                                                                                    B)Migracje                                                                                                   C)Emigracje                                                        Wpisz poprawną literke :");

        if(pytanie11 == "A") {

            pionek.style.left = '315px';
            pionek.style.top = '-510px';

            iloscGrzybow++;

        } else {
            alert("Zła odpowiedź! Tracisz Grzyba!! Nie możesz ruszyć dalej. Rzuć kostką ponownie! :C");

            iloscGrzybow--;
            polePionka = 0;
        }
    }

    if(polePionka == 12) {

        var pytanie1 = prompt("Od czego zależy występowanie alleli genów w pokoleniach potomnych?                                                                     A)Pula genetyczna jest to specjalny kod charakterystyczny dla danej puli. genetynego.                                                                                                    B)zależy od tego, które osobniki przystąpiły do rozrodu                                                                                                    C)Pula genetyczna jest to kategoria kodu. genetycznego.                                                        Wpisz poprawną literke :");

        if(pytanie12 == "B") {

            pionek.style.left = '455px';
            pionek.style.top = '-475px';

            iloscGrzybow++;

        } else {
            alert("Zła odpowiedź! Tracisz Grzyba!! Nie możesz ruszyć dalej. Rzuć kostką ponownie! :C");

            iloscGrzybow--;
            polePionka = 0;
        }
    }

    if(polePionka == 13) {

        var pytanie13 = prompt("Podaj odpowiednią kolejność działania specjacji zachodzącej bez bariery geograficznej                                                                      A)populacja wyjściowa > osobniki populacji dzielą się na dwie grupy różniące się np. preferencjami pokarmowymi > osobniki należące do różnych grup nie krzyżują się                                                                                                    B)Pula genowa to suma puli genetycznych wszystkich tworzących go populacji.                                                                                                    C)Pula genetyczna jest to kategoria kodu. genetycznego.                                                        Wpisz poprawną literke :");

        if(pytanie13 == "A") {

            pionek.style.left = '573px';
            pionek.style.top = '-550px';

            iloscGrzybow++;

        } else {
            alert("Zła odpowiedź! Tracisz Grzyba!! Nie możesz ruszyć dalej. Rzuć kostką ponownie! :C");

            iloscGrzybow--;
            polePionka = 0;
        }
    }

    if(polePionka == 14) {

        var pytanie14 = prompt("Podaj odpowiednią kolejność działania specjacji spowodowanej barierą geograficzną                                                                     A)Pula genetyczna jest to specjalny kod charakterystyczny dla danej puli. genetynego.                                                                                                    B)Pula genowa to suma puli genetycznych wszystkich tworzących go populacji.                                                                                                    C)populacja wyjściowa > populacja zostaje rozdzielona barierą, która uniemożliwia przepływ genów > U osobników po obu stronach bariery utrwalają się warianty cechy bardziej korzystne w danym środowisku > pomimo braku bariery osobniki nie krzyżują się ze sobą                                                        Wpisz poprawną literke :");

        if(pytanie14 == "C") {

            pionek.style.left = '685px';
            pionek.style.top = '-480px';

            iloscGrzybow++;

        } else {
            alert("Zła odpowiedź! Tracisz Grzyba!! Nie możesz ruszyć dalej. Rzuć kostką ponownie! :C");

            iloscGrzybow--;
            polePionka = 0;
        }
    }

    if(polePionka >= 15) {
        pionek.style.left = '840px';
        pionek.style.top = '-520px';

        if(iloscGrzybow < 0){
            iloscGrzybow = 0;
        }

    if(iloscGrzybow == 0){
        alert("Gratuluje "+twojeImie+" ! Przeszedłeś/aś całą mape! (～￣▽￣)～");
        alert("niestety.. nie udało ci się zebrać ani jednego grzyba :C aleee podjąłeś się odpwowiedzi na pytania! I to się liczy ^o^");
        alert("Dziękujemy za gre ! (❁´◡`❁)");
    }

    if(iloscGrzybow > 0) {
        alert("Gratuluje "+twojeImie+" ! Przeszedłeś/aś całą mape! (～￣▽￣)～");
        alert("zebrałeś/aś aż "+iloscGrzybow+" grzybów ! Przy okazji odpowiadając na pytania <3");
        alert("Dziękujemy za gre ! (❁´◡`❁)");
    }
        

    }

}