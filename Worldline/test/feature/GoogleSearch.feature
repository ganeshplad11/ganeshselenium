Feature: Google serach test
@googleserch
Scenario:
Given Navigate on the www.google.com page
When User search for the udemey
And clicks on thesearch button
Then all links should be searched in results
And closed he browser after