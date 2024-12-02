def dfs_rec(adj,visited,s):
    visited[s]=True
    print(s,end=" ")
    
    for i in adj[s]:
        if not visited[i]:
            dfs_rec(adj, visited, i)
           
def dfs(adj,s):
    visited= [False]*len(adj)
    
    dfs_rec(adj, visited, s)

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
    source=0
    print("DFS from source:", source)
    dfs(adj, source)
