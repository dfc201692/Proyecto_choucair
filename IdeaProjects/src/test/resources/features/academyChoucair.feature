# Autor:David Ferney Cruz Cruz FECHA: 19/FEBRERO/2021
@stories
Feature: Academy Choucair
  As a user, II want to learn how to automate in screamplay at the Choucair Academy with the automation course
  @scenario1
  Scenario: Search for a automation Choucair
    Given that Rose wants to learn automation at the academy Choucair
      |strUser       |strPassword      |
      |1053338841    |Choucair2021*    |
    When she search for the course on the Choucair Academy platform
      |strCourse                             |
      |Prueba Técnica - Analista Bancolombia |
    Then she find the course called
      |strCourse                             |
      |Prueba Técnica - Analista Bancolombia |
