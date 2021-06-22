Feature: Search


  Scenario Outline: User can search for a house
      Given I navigate to Zoopla homepage
      When I enter location as "<Location>"
      And I select minimum bed as "<MinBed>"
      And I select maximum bed "<MaxBed>"
      And I select minimum price as "<MinPrice>"
      And I select maximum price as "<MaxPrice>"
      And I click on "<Property>" as property type
      And I click on Search button
      Then search result is displayed


    Examples: Search Test Data
        | Location              | MinBed | MaxBed | MinPrice | MaxPrice | Property   |
        | London                | 3      | 3      | £300,000 | £500,000 | Houses     |
        | London                | 3      | 3      | £300,000 | £500,000 | Flats      |
        | London                | 3      | 3      | £300,000 | £500,000 | Farms/Land |
        | M45 6TF               | 3      | 3      | £300,000 | £500,000 | Houses     |
        | Manchester Piccadilly | 3      | 3      | £300,000 | £500,000 | Houses     |