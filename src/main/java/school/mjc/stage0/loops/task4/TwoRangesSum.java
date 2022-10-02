package school.mjc.stage0.loops.task4;

public class TwoRangesSum {
    public void printSumOfTwoRanges(int numberToSkip, int lastInRow) {
        if(numberToSkip>lastInRow)
            System.out.println("number to skip is bugger then the last");
        else if(lastInRow<0)
            System.out.println("last number in row is negative");
        else
        {
            int skippedSum = 0, countedSum = 0;
            for(int i = 0; i<=lastInRow; i++)
            {
                if(i%numberToSkip==0)
                    skippedSum+=i;
                else
                    countedSum+=i;
            }
            System.out.print("skipped sum is "); System.out.print(skippedSum);System.out.print('\n');
            System.out.print("counted sum is "); System.out.print(countedSum);
        }
    }
}
