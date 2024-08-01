//Read equidistant values of x and corresponding y
//Calculate the common difference h=x[1]=x[0]
#include<stdio.h>
int main()
{
	int n,i,j=0;;
	printf("Enter the number of data points==>\n");
	scanf("%d",&n);
	double h,inter_point,final,term=1.0;
	double f[n][n];
	double x[n],y[n];
	printf("Enter the x values==>\n");
	for(i=0;i<n;i++)
	{
		scanf("%lf",&x[i]);
	}
	printf("Enter the corresponding y values==>\n");
	for(i=0;i<n;i++)
	{
		scanf("%lf",&y[i]);
	}
	h=x[1]-x[0];
	for(i=0;i<n;i++)
	{
		f[i][0]=y[i];
	}
	for(j=1;j<n;j++)
	{
		for(i=0;i<n-j;i++)
		{
			f[i][j]=(f[i+1][j-1]-f[i][j-1])/(x[i+j]-x[i]);
		}
	}
	printf("Enter the value of x for interpolation==>\n");
	scanf("%lf",&inter_point);
	final=f[0][0];
	for(i=0;i<n;i++)
	{
		term=term*(inter_point-x[i]);
		final=final+(term*f[0][i+1]);
	}
	printf("Interpolated value at x=%.2lf is %.6lf\n",inter_point,final);
	return 0;
}
