package vorfuehrAufgabe5;


public class LookForDuplicates {
	
	public static void main(String[] args) {
		
		//Declaration
		String[] duplicates;	//Array within duplicates will be saved so that they do not get named twice
		int[] indices;	//Array within indices of duplicate appearances will be saved
		
		//Initialisation
		String[] placesOfInterest = {
				"Audi Forum",
				"Kreuztor",
				"Asamkirche Maria De Victoria",
				"Alte Anatomie",
				"Audi Forum",
				"Altes Rathaus",
				"THI",
				"Liebfrauenmünster",
				"Franziskanerbasilika",
				"St. Matthäuskirche",
				"Herzogskasten",
				"Ickstatthaus",
				"Audi Forum",
				"Alte Anatomie",
				"Franziskanerbasilika",
				"Audi Forum",
				"THI",
				"THI"
				};
		int duplicate = 0;
		int duplicatesCount = 0;
		
		
		duplicates = new String[placesOfInterest.length];
		indices = new int[placesOfInterest.length];
		
		//Output
		for( int i = 0; i < placesOfInterest.length; ++i ) {
			//Formatted output of index and item
			System.out.printf("%2d) " + placesOfInterest[i] + "\n", (i + 1) );
		}
		
		System.out.println();	//Spacer
		
		/*
		 * Well, this is going to suck. There is a method called "binarySearch"
		 * that can be used with arrays, however, I do not know how to properly
		 * implement this method. This means that I will have to do all that manually
		 * using for-loops. This would not be that complex if it wasn't for the
		 * possibility of items appearing more than two times. In this case I
		 * will also have to alter the wording on output ... gnahhh ... 
		 */
		
		//Output Warnings
		for( int i = 0; i < placesOfInterest.length; ++i ) {
			boolean notYetMentioned = true;	//boolean to check whether the duplicate was already mentioned
			
			/*
			 * The following for-loop checks, whether a duplicate item has already
			 * been mentioned. Therefore it searches through the specifically for this
			 * reason created array where duplicate entries are stored. If it can find
			 * the entry within it set the "notYetMentioned" boolean to false and everything
			 * following will be skipped. This happens because when the item can be found within
			 * the array an warning message has already been displayed for that item and it
			 * therefore shall not be displayed another time.
			 */
			for( int x = 0; x < placesOfInterest.length; ++x ) {
				if( placesOfInterest[i].equals(duplicates[x]) ) {
					notYetMentioned = false;
					break;
					//every duplicate entry only gets stored once within the array.
					//Further search is not needed.
				}
			}
			
			duplicate = 0;	//number of duplicates must be reset for every item
			if (notYetMentioned) {
				//following for-loop checks how many duplicates there are if any
				for (int x = 0; x < placesOfInterest.length; ++x) {
					//if something is listed multiple, duplicate will increase accordingly
					if (placesOfInterest[i].equals(placesOfInterest[x])) {
						++duplicate;
						//saves index of duplicate to array "indices"
						//only as many indices will get saved as there are duplicates
						indices[duplicate - 1] = x + 1;
					}
				}
				//Output of Warnings
				if (duplicate > 1) {	//item is a duplicate
					System.out.print("\"" + placesOfInterest[i] + "\" appears ");
					if (duplicate > 2) {	//item appears multiple times
						System.out.print(duplicate + " times at indices");
						//saved indices get listed
						for (int z = 0; z < duplicate; ++z) {
							System.out.print(" " + indices[z]);
						}
						System.out.println();
					} else {	//item only appears twice
						System.out.println("twice at indices " + indices[0] + " and " + indices[1]);
					}
				}
				//duplicates get saved in the duplicate array
				duplicates[duplicatesCount] = placesOfInterest[i];
				++duplicatesCount;	//duplicateCount needs to be increased or else last duplicate will get overwritten
			}
		}
		
	}

}
