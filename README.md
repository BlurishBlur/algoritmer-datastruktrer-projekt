Programmet kan køres fra kommando prompten således:

1) Først cd'es der til java-filernes lokation

2) Derefter udføres 'javac Heapsort.java'

3) Derefter kan programmet nu køres således: 'java Heapsort'

    a) Programmet vil herefter tage (tal-)input fra tastaturet
    b) Indtastningen kan afsluttes med ctrl + C
      I) Man kan ændre inputtet ved først at oprette en ny .txt fil, fx med navnet 'input', og fylde denne med tal, sepereret med newline
      II) Herefter kan man skrive 'java Heapsort < input.txt'
      III) Programmet vil nu læse input fra input.txt og printe ud i konsollen.
      IV) Man kan også angive output: 'java Heapsort > output.txt'. Hvis filen allerede findes, vil den blive overskrevet
      V) På nogle systemer skal man skrive: 'java Heapsort !> output.txt' for at filen bliver overskrevet
      VI) Man kan selvfølgelig også kombinere de to: 'java Heapsort < input.txt > output.txt'
