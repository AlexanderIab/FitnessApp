package fitnessApp.body;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.util.Arrays;

public class Fitness {
    private Membership[] gym = new Membership[20];
    private Membership[] pool = new Membership[20];
    private Membership[] group = new Membership[20];

    public void regIn(Zone zone, Membership membership) {
        if (!timeCheck(membership)) return;
        if (!ageCheck(membership)) return;
        if (!checkMembershipExpiry(membership)) return;
        if (!checkMembershipInZone(membership)) return;
        for (Zone zoneType : membership.getType().getZones()) {
            if (zone.equals(zoneType)) {
                switch (zone) {
                    case GYM:
                        if (addMembership(zone, membership, gym)) return;
                        System.out.println("Нет свободных мест в зоне тренажерного зала");
                        return;
                    case POOL:
                        if (addMembership(zone, membership, pool)) return;
                        System.out.println("Нет свободных мест в зоне бассейна");
                        return;
                    case GROUP:
                        if (addMembership(zone, membership, group)) return;
                        System.out.println("Нет свободных мест в зоне групповых занятий");
                        return;
                }
            }
        }
        System.out.println("Данная зона не разрешена по вашему абоненту");
    }

    private boolean addMembership(Zone zone, Membership membership, Membership[] zoneAdd) {
        for (int i = 0; i < zoneAdd.length; i++) {
            if (zoneAdd[i] == null) {
                zoneAdd[i] = membership;
                System.out.println(membership.getOwnerDetails().getSurname() + " " + membership.getOwnerDetails().getName() + " " + zone + "\n" + LocalDateTime.now());
                return true;
            }
        }
        return false;
    }

    // Checking registration in other zones
    private boolean checkMembershipInZone(Membership membership) {
        for (Membership member : gym) {
            if (membership.equals(member)) {
                System.out.println("Вы ужи зарегистрированы в тренажерном зале");
                return false;
            }
        }
        for (Membership member : pool) {
            if (membership.equals(member)) {
                System.out.println("Вы ужи зарегистрированы в бассейне");
                return false;
            }
        }
        for (Membership member : group) {
            if (membership.equals(member)) {
                System.out.println("Вы ужи зарегестрированы на групповых занятиях");
                return false;
            }
        }
        return true;
    }

    // Checking the expiration date of the membership
    private boolean checkMembershipExpiry(Membership membership) {
        if (membership.getDateOfExpiry().isBefore(membership.getDateOfReg())) {
            System.out.println("Абонемент просрочен");
            return false;
        }
        return true;
    }


    public void fitnessClose() {
        Arrays.fill(group, null);
        Arrays.fill(gym, null);
        Arrays.fill(pool, null);
        System.out.println("Фитнес закрыт");
    }

    // Information about fitness visitors: gym[], pool[], group[]
    public void infoFitness() {
        System.out.println("Тренажерный зал:");
        for (Membership membership : gym) {
            System.out.println(membership);
        }
        System.out.println("Бассейн:");
        for (Membership membership : pool) {
            System.out.println(membership);
        }
        System.out.println("Групповые занятия:");
        for (Membership membership : group) {
            System.out.println(membership);
        }
    }

    // Time check
    private boolean timeCheck(Membership membership) {
        if (LocalTime.now().isBefore(membership.getType().getStart()) || LocalTime.now().isAfter(membership.getType().getEnd())) {
            System.out.println("Приходите в рабочие часы");
            return false;
        }
        return true;
    }

    // Age check
    private boolean ageCheck(Membership membership) {
        if (Period.between(membership.getOwnerDetails().getYearOfBirth(), LocalDate.now()).getYears() < 10) {
            System.out.println("Вход в фитнес разрешён с 10 лет");
            return false;
        }
        return true;
    }

    // Mass Registration in Pool
    public void regIn(Membership... pool) {
        for (Membership membership : pool) {
            regIn(Zone.POOL, membership);
        }
    }
}

