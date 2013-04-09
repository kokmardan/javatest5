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
    
    public void insertSort()
    {
        int in, out, k, min ;
        
        for (out = 0; out < nElems-1; out++)
        {
            in = out ;
            min = mas[in] ;
            k = in ;
            for(in = out+1; in < nElems ; in++)
                if (min < mas[in])
                {
                    min = mas[in] ;
                    k = in ;
                }
            swap(out, k) ;
        }
        
    }
    
    public void swap(int x, int y)
    {
        int temp = mas[x] ;
        mas[x] = mas[y] ;
        mas[y] = temp ;
    }
    
    
    
}
