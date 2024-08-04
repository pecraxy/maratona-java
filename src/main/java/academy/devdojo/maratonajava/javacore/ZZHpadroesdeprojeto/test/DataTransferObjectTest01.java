package academy.devdojo.maratonajava.javacore.ZZHpadroesdeprojeto.test;

import academy.devdojo.maratonajava.javacore.ZZHpadroesdeprojeto.dominio.*;

public class DataTransferObjectTest01 {
    public static void main(String[] args) {
        Aircraft aircraft = new Aircraft("3787-10");
        Country country = Country.BRAZIL;
        Currency currency = CurrencyFactory.newCurrency(Country.BRAZIL);
        Person personName = Person.PersonBuilder
                .builder()
                .firstName("Marcelo")
                .lastName("Sem dente")
                .build();
        ReportDto reportDto = ReportDto.ReportDtoBuilder.builder()
                .aircraftName(aircraft.getName())
                .country(country)
                .currency(currency)
                .personName(personName.getFirstName())
                .build();
        System.out.println(reportDto);
    }
}
