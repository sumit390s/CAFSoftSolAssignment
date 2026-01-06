public class CompanyNormalizer {

    public static String normalizeCompanyName(String companyName) {
        if (companyName == null || companyName.trim().isEmpty()) {
            return "";
        }

        String cleanedName = companyName.trim().replaceAll("\\s+", " ").toLowerCase();

        if (cleanedName.contains("caf")) {
            return "CAF SoftSol India Pvt Ltd.";
        }

        return cleanedName;
    }

    public static void main(String[] args) {
        System.out.println(normalizeCompanyName("CAF softsol")); 
        System.out.println(normalizeCompanyName("CAF solution")); 
        System.out.println(normalizeCompanyName("CAF           softSolution  India Pvt Limited")); 
        System.out.println(normalizeCompanyName("")); 
        System.out.println(normalizeCompanyName(null)); 
        System.out.println(normalizeCompanyName("Random Company")); 
    }
}
