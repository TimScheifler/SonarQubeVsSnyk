|                                              | IDE      | Snyk | SonarQube | SonarLink | Codacy | Reshift |
| -------------------------------------------- | -------- | ---- | --------- | --------- | ------ | ------- |
| Ungenutzte Imports                           | X        |      | X         | X         | X      |         |
| Durch Null teilen                            | X        | X    | X         | X         |        |         |
| NullPointer-Dereferenzierung                 | X        |      | X         | X         |        |         |
| Unerreichbares Statement                     | X        | X    | X         | X         | X      |         |
| Memory Leak (statische Liste)                |          |      |           |           |        |         |
| Memory Leak (Ungeschlossener BufferedReader) |          | X    | X         |           |        |         |
| Integer Overflow in for-Schleife             |          |      |           |           |        |         |
| Integer Overflow in Multiplikation           | X        |      | X         |           |        |         |
| Index Out of Bounds                          |          |      |           |           |        |         |
| SQL Injection                                | X        |      | X         |           |        | X       |
| Namenskonventionen                           | X        |      | X         | X         |        |         |
| Generische Exceptions                        | X        |      | X         | X         | X      |         |
| Ungenutzte Variablen                         | X        |      | X         | X         | X      |         |
| Hardgecodete Passwörter                      |          | X    | X         |           |        |         |
| Zyklische Abhängigkeiten                     | X        |      | X         |           |        |         |
| Veraltete Methoden                           | X        |      | X         | X         |        |         |
| Schwachstellen von Abhängigkeiten            |          | X    |           |           |        |         |
| Toter Code                                   | X        |      |           |           |        |         |
| Doppelter Code                               | X        |      | X         | X         |        |         |
|                                              |          |      |           |           |        |         |
|                                              |          |      |           |           |        |         |
| Prozentuale Abdeckung                        | 68%      | 26%  | 74%       | 47%       | 21%    | 5%      |
