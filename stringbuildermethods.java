public class stringbuildermethods {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Hello");
        
        // Append method
        sb.append(" World");
        System.out.println(sb); // Output: Hello World
        
        // Insert method
        sb.insert(5, ",");
        System.out.println(sb); // Output: Hello, World
        
        // Replace method
        sb.replace(5, 6, "!");
        System.out.println(sb); // Output: Hello! World
        
        // Delete method
        sb.delete(5, 6);
        System.out.println(sb); // Output: Hello World
        
        // Reverse method
        sb.reverse();
        System.out.println(sb); // Output: dlroW olleH
        
        // Length method
        System.out.println("Length: " + sb.length()); // Output: Length: 11
        
        // Capacity method
        System.out.println("Capacity: " + sb.capacity()); // Output: Capacity: 16

        // CharAt method
        System.out.println("Character at index 0: " + sb.charAt(0)); // Output: Character at index 0: d
        
        // SetCharAt method
        sb.setCharAt(0, 'D');
        System.out.println(sb); // Output: DlroW olleH
        
        // Substring method
        String substring = sb.substring(0, 5);
        System.out.println("Substring: " + substring); // Output: Substring: DlroW

        // ToString method
        String str = sb.toString();
        System.out.println("String: " + str); // Output: String: DlroW olleH

        // Ensure capacity method
        sb.ensureCapacity(50);  
        System.out.println("Updated Capacity: " + sb.capacity()); // Output: Updated Capacity: 50

        // Trim to size method
        sb.trimToSize();
        System.out.println("Trimmed Capacity: " + sb.capacity()); // Output: Trimmed Capacity: 11

        // SetLength method
        sb.setLength(5);
        System.out.println("Updated Length: " + sb.length()); // Output: Updated Length: 5

        // Clear method
        sb.setLength(0);
        System.out.println("Cleared StringBuilder: " + sb); // Output: Cleared StringBuilder: 

        // Reverse method after clearing
        sb.reverse();
        System.out.println("Reversed after clearing: " + sb); // Output: Reversed after clearing: :
        
    }
}
