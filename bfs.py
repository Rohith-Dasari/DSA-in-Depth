from collections import deque

def bfs(adj,s):
    #initialise a double ended queue to store nodes that needs to be visited
    q=deque()
    #initialise a boolean visited array to keep track of vertices visited 
    visited=[False]*len(adj)
    #append s to the deque as it is the starting node
    q.append(s)
    #mark s visited      
    visited[s]=True
    
    while q:
        #pop the node to be visited
        curr=q.popleft()
        #print it as it is being visited
        print(curr, end=" ")
        #extract the neighbors and of current node and add it to the deque if it is not already visited        
        for x in adj[curr]:
            if not visited[x]:
                #mark it as visited as it is going to be appended to the deque
                q.append(x)
                visited[x]=True
                
#function to add edges to the graph                
def add_edge(adj, u, v):
    #add v as neighbor to u
    adj[u].append(v)
    #add u as neighbor to v
    adj[v].append(u)

if __name__=="__main__":
    #declare number of vertices
    V=5
    #make an empty list of size v to store the graph in the form of an adjaceny list
    adj=[[] for _ in range(V)]
    
    #add edges to the graph
    add_edge(adj,0,1)
    add_edge(adj,0,2)
    add_edge(adj,1,3)
    add_edge(adj,1,4)
    add_edge(adj,2,4)
    
    print("BFS starting from 0: ")
    bfs(adj,0)
          
    