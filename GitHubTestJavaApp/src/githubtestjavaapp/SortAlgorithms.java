package githubtestjavaapp;

public class SortAlgorithms 
{
    private int nElems ;
    private int [] mas ;
    
    public SortAlgorithms(int size)
    {
        nElems = 0 ;
        mas = new int[size] ;
    }
    
    public void insert(int value)
    {
        mas[nElems] = value ;
        nElems++ ;
    }
    
    public void display()
    {
        for (int i = 0; i < nElems; i++)
            System.out.print(mas[i] + " ");
        
        System.out.println("");
    }
    
    
    
}
