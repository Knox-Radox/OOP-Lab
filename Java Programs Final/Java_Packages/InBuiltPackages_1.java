import java.util.*;
import java.time.*;

public class InBuiltPackages_1 {
    private static final List<String> MEDICINES = Arrays.asList("Paracetamol", "Ibuprofen", "Aspirin", "Cetirizine", "Amoxicillin", "Metformin", "Omeprazole", "Loratadine");

    public static void main(String[] args) {
        List<Medicine> medicineList = generateMedicineData(10);  
        checkExpiringMedicines(medicineList, 30); 
    }

    static class Medicine {
        String name;
        LocalDate expiryDate;

        Medicine(String name, LocalDate expiryDate) {
            this.name = name;
            this.expiryDate = expiryDate;
        }
    }

    private static List<Medicine> generateMedicineData(int numEntries) {
        List<Medicine> medicines = new ArrayList<>();
        Random random = new Random();

        for (int i = 0; i < numEntries; i++) {
            String medicine = MEDICINES.get(random.nextInt(MEDICINES.size()));
            LocalDate expiryDate = LocalDate.now().plusDays(random.nextInt(356) + 10);
            medicines.add(new Medicine(medicine, expiryDate));
        }

        System.out.println("Medicine data generated successfully!");
        return medicines;
    }

    private static void checkExpiringMedicines(List<Medicine> medicines, int alertDays) {
        LocalDate today = LocalDate.now();
        List<Medicine> expiringMedicines = new ArrayList<>();

        for (Medicine medicine : medicines) {
            if (!medicine.expiryDate.isBefore(today) && medicine.expiryDate.isBefore(today.plusDays(alertDays))) {
                expiringMedicines.add(medicine);
            }
        }

        if (!expiringMedicines.isEmpty()) {
            System.out.println("\nMedicines Expiring Soon");
            for (Medicine med : expiringMedicines) {
                System.out.println("- " + med.name + " (Expires on " + med.expiryDate + ")");
            }
        } else {
            System.out.println("\nNo medicines are expiring soon!");
        }
    }
}
