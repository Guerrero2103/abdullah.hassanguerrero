# Anderlecht NGO - Webapplicatie

## Over het project
Deze Spring Boot-webapplicatie is een prototype voor een ngo in Anderlecht die zich inzet voor gemeenschapsopbouw en steun aan mensen in moeilijkheden. De applicatie laat toe om evenementen te beheren: je kan evenementen toevoegen, de details bekijken en verwijderen.

De belangrijkste onderdelen van de applicatie:
- Indexpagina met de 10 recentste evenementen
- Evenement aanmaken via formulier met validatie
- Detailpagina voor elk evenement
- About-pagina met informatie over de ngo
- Gemeenschappelijk menu en footer op elke pagina
- CSS-styling met eigen bestand of framework
- Verwijderfunctionaliteit voor evenementen

## Uitgevoerde technische stappen
- Relatie opgezet tussen `Event` en `Location` met `@ManyToOne`
- Validatie toegevoegd voor alle invoervelden
- Foutmeldingen opgelost zoals:
    - Locatie-selectie werkte niet correct (object werd niet als ID meegegeven)
    - CSRF-token probleem bij verwijderen is opgelost door Spring Security correct te configureren
    - Template errors door ontbrekende bestanden opgelost

## Benodigde technologieën
- Java 21
- Spring Boot 3.x
- Thymeleaf
- Spring Data JPA
- MySQL
- TailwindCSS (of eigen CSS in `static/css/style.css`)

## Projectstructuur
- `model/`: bevat de `Event` en `Location` entiteiten
- `repository/`: bevat de interfaces voor databanktoegang
- `controller/`: behandelt de routes en logica
- `templates/`: bevat de Thymeleaf-htmlbestanden
- `static/`: bevat CSS-bestanden

## Gebruikte bronnen en documentatie
- https://www.baeldung.com/spring-boot-thymeleaf
- https://spring.io/guides/gs/handling-form-submission/
- https://www.thymeleaf.org/doc/tutorials/3.0/usingthymeleaf.html
- https://www.w3schools.com/html/
- https://tailwindcss.com/docs
- https://stackoverflow.com/questions/tagged/spring-boot
- https://docs.oracle.com/en/java/

## Deploy & Run
1. Clone dit project
2. Zorg dat MySQL draait en je database `eindproject` bestaat
3. Pas `application.properties` aan met je databasegegevens
4. Run de app via je IDE of met `mvn spring-boot:run`

## Extra probleemoplossing met AI
Tijdens het project ondervond ik problemen met het pushen naar GitHub vanuit mijn IDE (de push-knop bleef eindeloos laden).
Ik heb hierbij gebruikgemaakt van ChatGPT om dit op te lossen door manueel te pushen via de terminal met volgende commando’s:

bash
Copy
Edit
