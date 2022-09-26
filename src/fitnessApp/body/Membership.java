package fitnessApp.body;

import java.time.LocalDate;

/**
 * @author Alexander Iablonski
 * */
public class Membership {
    private LocalDate dateOfReg;
    private LocalDate dateOfExpiry;
    private OwnerDetails ownerDetails;
    private Type type;


    public Membership(OwnerDetails ownerDetails, LocalDate dateOfReg, LocalDate dateOfExpiry, Type type) {
        this.dateOfReg = dateOfReg;
        this.dateOfExpiry = dateOfExpiry;
        this.ownerDetails = ownerDetails;
        this.type = type;
    }

    public Type getType() {
        return type;
    }

    public LocalDate getDateOfReg() {
        return dateOfReg;
    }

    public LocalDate getDateOfExpiry() {
        return dateOfExpiry;
    }

    public OwnerDetails getOwnerDetails() {
        return ownerDetails;
    }

    @Override
    public String toString() {
        return "Membership{" +
                "dateOfReg=" + dateOfReg +
                ", dateOfExpiry=" + dateOfExpiry +
                ", ownerDetails=" + ownerDetails +
                ", type=" + type +
                '}';
    }
}
