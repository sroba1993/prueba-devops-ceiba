Feature: confirm purchase

    Scenario: Confirm order
        Given that an user is on login page
        When he login with account
        And he select an article
        And he confirm order on shopping cart
        Then he should be to see confirm purchase message