def generate_magic_square(n):
    #generate n*n matrix filled with 0s
    magic_square=[[0]*n for _ in range(n)]
    #1 is filled at the following position
    row,column=n//2,n-1
    magic_square[row][column]=1
    #proceed with next numbers
    num=2
    while num<=n*n:
        #decrement row for every next number and make sure it falls in the bounds
        row-=1
        if(row<0):
            row=n-1
        #increment column for every next number and make sure it falls in the bounds
        column=(column+1)%n
        
        #if calculated place is occupied by another number new indices should be calculated by decrementing column by 2 and incrementing row
        if magic_square[row][column]!=0 :
            column-=2
            row=(row+1)%n
        #fill the new calculated place with the number    
        magic_square[row][column]=num
        
        #proceed with next number
        num+=1
    return magic_square

def print_magic_square(magic_square):
    n=len(magic_square)
    print("Magic square:")
    for row in magic_square:
        print("".join(str(cell).rjust(3) for cell in row))

n=5
magic_square=generate_magic_square(n)
print_magic_square(magic_square)