#Auto generated NGA revision tag
@TID1120REV0.4.0

Feature:multiple feature

	Scenario: Injected results arrive
		Given User A runs his tests from an external source
		When User A gets the external results
		Then User B doesn't see the results in the pipeline
		And User B doesn't see any changes in his own tests
		And User B isn't affected by any way from User A runs
        
        