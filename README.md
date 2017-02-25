Programmet kan køres fra kommando prompten således:

1. Først cd'es der til java-filernes lokation
2. Derefter udføres 'javac Heapsort.java'
3. Derefter kan programmet nu køres således: 'java Heapsort'
    1. Programmet vil herefter tage (tal-)input fra tastaturet
    2. Indtastningen kan afsluttes med at skrive noget som ikke er et tal. Programmet kan afbrydes helt med ctrl + C
      1. Man kan ændre inputtet ved først at oprette en ny .txt fil, fx med navnet 'input', og fylde denne med tal, sepereret med newline
      2. Herefter kan man skrive 'java Heapsort < input.txt'
      3. Programmet vil nu læse input fra input.txt og printe ud i konsollen.
      4. Man kan også angive output: 'java Heapsort > output.txt'. Hvis filen allerede findes, vil den blive overskrevet
      5. På nogle systemer skal man skrive: 'java Heapsort !> output.txt' for at filen bliver overskrevet
      6. Man kan selvfølgelig også kombinere de to: 'java Heapsort < input.txt > output.txt'
