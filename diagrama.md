
classDiagram
    class Location {
        +Enemy createEnemy()
        +void spawnAndAttack()
    }
    class AmazonLocation {
        +Enemy createEnemy()
    }
    class SertaoLocation {
        +Enemy createEnemy()
    }
    class RioLocation {
        +Enemy createEnemy()
    }
    class Enemy {
        +void attack()
    }
    class MutantAnimal {
        +void attack()
    }
    class Cangaceiro {
        +void attack()
    }
    class Criminal {
        +void attack()
    }
    Location <|-- AmazonLocation
    Location <|-- SertaoLocation
    Location <|-- RioLocation
    Enemy <|-- MutantAnimal
    Enemy <|-- Cangaceiro
    Enemy <|-- Criminal
    Location --> Enemy : createEnemy()
