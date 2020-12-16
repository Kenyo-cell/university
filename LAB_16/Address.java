public final class Address {
    private String cityName;
    private int zipCode;
    private String streetName;
    private int buildingNumber;
    private char buildingLetter;
    private int apartamentNumber;
    public static Address EMPTY_ADDRESS = new Address();

    public Address() {}

    public Address(String cityName, int zipCode, String streetName,
        int buildingNumber, char buildingLetter, int apartamentNumber) {

		this.cityName = cityName;
		this.zipCode = zipCode;
		this.streetName = streetName;
		this.buildingNumber = buildingNumber;
		this.buildingLetter = buildingLetter;
		this.apartamentNumber = apartamentNumber;
    }

    public String getCityName() {
        return cityName;
    }

    public int getZipCode() {
        return zipCode;
    }

    public String getStreetName() {
        return streetName;
    }

    public int getBuildingNumber() {
        return buildingNumber;
    }

    public char getBuildingLetter() {
        return buildingLetter;
    }

    public int getApartamentNumber() {
        return apartamentNumber;
    }

}
