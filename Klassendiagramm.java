@startuml
Web-Nutzer -- Kunde
Web-Kunde -- Warenkorb
Warenkorb --o Account
Warenkorb -- TicketItem
TicketItem -- Event
TicketItem -- Buchung
Account --o Kunde
Account -- Payment
Account o-- Buchung
Buchung -- Payment
@enduml