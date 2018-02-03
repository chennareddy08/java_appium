package Test_Package3;


/**
 * 
 */


import java.util.ArrayList;

/**
 * @author sebisheldin
 *
 */
public class StickTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arrayOfStickHeight[] = {3,6,5,4,5,7,6,3,10,5,6,2,7,9,8,10};
        int userSelection1[] = {3,4,5,6,6,7,9,10};
        int userSelection2[] = {3,6,6,7,9,10};
        int userSelection3[] = {3,10};
        int userSelection4[] = {3,7,7,8,10};
        int userSelection5[] = {3,6,4,5,7,9,10};
       checkStickSelection(arrayOfStickHeight, userSelection1);
       checkStickSelection(arrayOfStickHeight, userSelection2);
       checkStickSelection(arrayOfStickHeight, userSelection3);
       checkStickSelection(arrayOfStickHeight, userSelection4);
       checkStickSelection(arrayOfStickHeight, userSelection5);
	}
	
	/**
	 * 
	 * @param arrayOfStickHeight, the array of the sticks height
	 * @param userSelection, the array of the selected sticks height
	 */
	static void checkStickSelection(int arrayOfStickHeight[], int userSelection[]){
		if(arrayOfStickHeight.length < userSelection.length){
			System.out.println("User Selection is not valid");
			return;
		}
		int interationPositionOfStick = 0;
        for (int i = 0; i < userSelection.length; i++){
            ArrayList<Integer> expectedItemAtCurrentPosition = new ArrayList<Integer>();
            ArrayList<Integer> positionOfStickInArray = new ArrayList<Integer>();
            for(int j = interationPositionOfStick; j<arrayOfStickHeight.length; j++){
            	int currentIterationElement = i-1;
            	if(currentIterationElement == -1)
            		currentIterationElement = 0;
            	if(arrayOfStickHeight[j] > userSelection[currentIterationElement] || arrayOfStickHeight[j] == userSelection[currentIterationElement]){
                    expectedItemAtCurrentPosition.add( arrayOfStickHeight[j]);
                    positionOfStickInArray.add(j);
                }
            }
            if(expectedItemAtCurrentPosition.contains(userSelection[i])){
                interationPositionOfStick = positionOfStickInArray.get(expectedItemAtCurrentPosition.indexOf(userSelection[i]));
                ++interationPositionOfStick;
            }
            if(!expectedItemAtCurrentPosition.contains(userSelection[i])){
                System.out.println("User Selection is not valid");
                break;
            }else if(i == (userSelection.length - 1)){
                System.out.println("User Selection is Valid");
            }
        }
	}

}