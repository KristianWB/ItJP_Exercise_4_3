public class Geography_EstimateAreas {

    /* I will solve this exercise in 4 steps. First i will write in the four coordinates as stated in the book, Then
     * i will choose 2 triangles and calculate the distances between the triangle coordinates from the formula given in
      * Exercise 4.2. Third i calculate the area from the formula given in exercise 2.19 and fourth i print out the
       * results */
    public static void main(String[] args)   {

        // This is the first part where i type in the coordinates
        double charlotteX = 35.2270869; // X coordinate from the city Charlotte
        double charlotteY = -80.8431267; // Y coordinate from the city Charlotte

        double savannahX = 32.0835407; // X coordinate from the city Savannah
        double savannahY = -81.0998342; // Y coordinate from the city Savannah

        double orlandoX = 28.5383355; // X coordinate from the city Orlando
        double orlandoY = -81.3792365; // Y coordinate from the city Orlando

        double atlantaX = 33.7489954; // X coordinate from the city Atlanta
        double atlantaY = -84.3879824; // Y coordinate from the city Atlanta

        /* Now the second part starts and i must choose two triangles before i continue.
         I choose Charlotte-Savannah-Atlanta and Atlanta-Savannah-Orlando. Then i must calculate the distances
          between the coordinates using the formula from exercise 4.2*/

            // First i convert all the data in degrees into radians

        double charlotteRadX = Math.toRadians(35.2270869);
        double charlotteRadY = Math.toRadians(-80.8431267);

        double savannahRadX = Math.toRadians(32.0835407);
        double savannahRadY = Math.toRadians(-81.0998342);

        double orlandoRadX = Math.toRadians(28.5383355);
        double orlandoRadY = Math.toRadians(-81.3792365);

        double atlantaRadX = Math.toRadians(33.7489954);
        double atlantaRadY = Math.toRadians(-84.3879824);

            // Now i implement the formula from exercise 4.2 and calculate the needed distances

        double radius = 6371.01;

                // Calculating the distances in the legs of the triangle Charlotte-Savannah-Atlanta

                    // Distance between Charlotte and Savannah
        double charlotteSavannah = radius * Math.acos((Math.sin(charlotteRadX) * Math.sin(savannahRadX)) +
                (Math.cos(charlotteRadX) * Math.cos(savannahRadX)) * Math.cos(charlotteRadY - savannahRadY));

                    // Distances between Savannah and Atlanta
        double savannahAtlanta = radius * Math.acos((Math.sin(savannahRadX) * Math.sin(atlantaRadX)) +
                (Math.cos(savannahRadX) * Math.cos(atlantaRadX)) * Math.cos(savannahRadY - atlantaRadY));

                    // Distances between Atlanta and Charlotte
        double atlantaCharlotte = radius * Math.acos((Math.sin(atlantaRadX) * Math.sin(charlotteRadX)) +
                (Math.cos(atlantaRadX) * Math.cos(charlotteRadX)) * Math.cos(atlantaRadY - charlotteRadY));

                // Calculating the distance in the legs of the triangle Savannah-Orlando-Atlanta

                    // Distances between Savannah and Orlando
        double savannahOrlando = radius * Math.acos((Math.sin(savannahRadX) * Math.sin(orlandoRadX)) +
                (Math.cos(savannahRadX) * Math.cos(orlandoRadX)) * Math.cos(savannahRadY - orlandoRadY));

                    // Distances between Orlando and Atlanta
        double orlandoAtlanta = radius * Math.acos((Math.sin(orlandoRadX) * Math.sin(atlantaRadX)) +
                (Math.cos(orlandoRadX) * Math.cos(atlantaRadX)) * Math.cos(orlandoRadY - atlantaRadY));

                    // Distances between Atlanta and Savannah
        double atlantaSavannah = radius * Math.acos((Math.sin(atlantaRadX) * Math.sin(savannahRadX)) +
                (Math.cos(atlantaRadX) * Math.cos(savannahRadX)) * Math.cos(atlantaRadY - savannahRadY));



                // Part 3, where the area of the two triangles are calculated
                    // Calculating the area of triangle Charlotte-Savannah-Atlanta
        double s1 = (charlotteSavannah + savannahAtlanta + atlantaCharlotte) / 2; // Calculating the intermediery "s1"

                    // Calculating area of triangle1 from the side length and s
        double area1 = Math.sqrt(s1 * (s1 - charlotteSavannah) * (s1 - savannahAtlanta) * (s1 - atlantaCharlotte));

                    // Calculating the area of triangle Savannah-Orlando-Atlanta
        double s2 = (savannahOrlando + orlandoAtlanta + atlantaSavannah) / 2; // Calculating the intermediery "s2"

                    // Calculating area of triangle1 from the side length and s
        double area2 = Math.sqrt(s2 * (s2 - savannahOrlando) * (s2 - orlandoAtlanta) * (s2 - atlantaSavannah));

                // Part 4, where we print out the area that the two triangles has together
        System.out.println("The area of the polygon that the four cities map out is: " + (area1 + area2));


    }
}
