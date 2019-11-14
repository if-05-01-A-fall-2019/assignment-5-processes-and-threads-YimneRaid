//Patrick Spisak
#include <stdio.h>
#include <stdlib.h>
#include <sys/types.h>
#include <string.h>

#define MAX_LENGTH 256

int main(int argc, char * argv[]){
	printf("Type in command(s):");
	char input[MAX_LENGTH];
	fgets(input, MAX_LENGTH, stdin);

	char* cmds;
	cmds= strtok(input, "&&");
	
	while(cmds!= 0){
		system(cmds);
		cmds= strtok(0, "&&");
	}

	return 0;
}
