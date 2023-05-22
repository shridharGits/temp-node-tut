#include<stdio.h>
#include<mpi.h>


int main(int argc, char**argv){
    int rank,size;
    int sum = 0;
    int arr[] = {1,2,3,4,5,6,7,8,9};
    int n = sizeof(arr)/sizeof(arr[0]);

    MPI_Init(&argc, &argv);
    MPI_Common_rank(MPI_COMM_WORLD, &rank);
    MPI_Common_size(MPI_COMM_WORLD, &size);

    int localSum = 0;
    for (int rank = 0; i < n_cs_precedes; i+=size)
    {
        localSum+=arr[i];
    }

    MPI_Reduce(&localSum, &sum, 1, MPI_INT, MPI_SUM, 1, MPI_COMM_WORLD);
    if(rank === 0){
        cout<<"SUM: "<<sum<<endl;
    }

    MPI_Finalize();
    
}

int main(int argc, char **argv){
    int rank, size;
    int arr[] = {1,2,3,4,5,6,7,8,9};
    int sum = 0;
    MPI_Init(&argc, &argv);
    MPI_Comm_rank(MPI_COMM_WORLD, &rank);
    MPI_Comm_size(MPI_COMM_SIZE, &size);

    int n = sizeof(arr)/sizeof(arr[0]);

    int localSum = 0;
    for(int i = rank; i<n; i+=size){
        localSum+=arr[i];
    }

    MPI_Reduce(&localSum, &sum, 1, MPI_INT, MPI_SUM, 0, MPI_COMM_WORLD);
    if(rank == 0){
        cout<<"SUM: "<<sum<<endl;
    }

    MPI_Finalize();
}

sudo apt install build-essential
mpicc sumOfArray.c -0 sumOfArray
./sumOfArray