## Travel agency
- Technology stack
  - Angular - UI
  - Spring Boot - backend

- Project business features - initial list
  - registration of users/admin etc.
    - two roles: users and administrators
    - normal user
      - sign up
    - admin
      - defined in application - starting approach

  - provide all available trips
    - travel datetime - start and end
    - destination
      - country
      - city
    - cost (per person)
    - transport type:
      - bus, train, plane, ferry
    - security rules
      - travel restrictions
      - Insurance
    - payment type
    - meal types
      - Breakfasts
      - Lunches
      - Dinners
      - Snacks
      - Drinks
      - HB
      - All inclusive
    - hotel facilities
      - attractions
      - apartment facilities

  - searching
    - country selection
    - city
    - number of people
    - dates boundaries (starting/ending/no dates)
    - type of transport

  - map of destinations
    - possibility to select from map destination and later see available trips there

  - booking trips
    - contact to person who's gonna to pay
      - email, phone
    - data of all passengers
      - name
      - surname
      - birth
      - nationality
      - passport number
      - gender

### TODO
- last/first minute offers
- reviews section
- online chat
- customer travel history + possibility to add places which you already visited
- vip/premium  customers

### Additional features
- type of the trip (business/family)
- think about more searching options (future)
  - budget
  - from where and to where in city

### Technical stories
- provide all available trips (user)
  - backend
    - create trip entity
      - tripStartDate
      - tripEndDate
      - destination (class)
        - country
        - city
      - price
        - cost (BigDecimal)
        - currency
      - transport type (ENUM)
        - bus, train, plane, ferry
      - security rules:
        - travel restrictions
        - insurance
      - payment method (ENUM):
        - MONEY, CARD, TRANSFER, APPLE PAY, GOOGLE PAY, PAYPAL
      - meal types (ENUM):
        - Breakfasts, Lunches, Dinners, Snacks, Drinks, HB, All inclusive
      - hotel facilities
        - attractions (list)
        - apartment facilities (list)
      - list of photos URLs
      - trip dto
      - create TripController (REST)
        - read all trips - paging by default (default: 10)
        - read one trip - by id
      - create TripService
      - create TripRepository
      - handle photos urls (TODO)
    

  - fronted
    - card 
    - some photos