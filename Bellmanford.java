import java.util.Scanner;
public class Bellmanford
{
public static void BellmanFordEvaluation(int Source,int matrix[][],int
d[],int numvertices)
{
 int MAX_VALUE=999;
 int node,u,v,vertices;
 for(node=1;node<=numvertices;node++)
 {
 d[node]=MAX_VALUE;
 }
 d[Source]=0;
 for(node=1;node<=numvertices-1;node++) {
 for(u=1;u<=numvertices;u++) {
 for(v=1;v<=numvertices;v++) {
 if(matrix[u] [v]!=0) {
 if(d[v]>d[u]+matrix[u][v]) {
 d[v]=d[u]+matrix[u][v];
}
 }
 }
 }
 }
 for(u=1;u<=numvertices;u++) {
 for(v=1;v<=numvertices;v++) {
 if(matrix[u] [v]!=0) {
 if(d[v]>d[u]+matrix[u][v]) {
 System.out.print("It
contains negative edge");
 }
 }
 }
 }
 for(vertices=1;vertices<=numvertices;vertices++) {
 System.out.println("The distance from"+"
"+Source+" "+" to"+" "+vertices+" "+" is:"+d[vertices]);
 }
}
public static void main(String args[])
{
 Scanner scanner=new Scanner(System.in);
 int numvertices,Source,i,j;
 System.out.println("Enter number of vertices");
 numvertices=scanner.nextInt();
 System.out.println("Enter the Adjacency Matrix");
 int matrix[][]=new int[numvertices+1][numvertices+1];
 for(i=1;i<=numvertices;i++) {
 for(j=1;j<=numvertices;j++) {
 matrix[i][j]=scanner.nextInt();
if(i==j){
 matrix[i][j]=0;
continue;
 }
 }
 }
 System.out.println("enter the destination vertex");
 Source=scanner.nextInt();
 int d[]=new int[numvertices+1];
 BellmanFordEvaluation(Source,matrix,d,numvertices);
}
}
