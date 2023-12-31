package Assignment1.Q10;

public class Q10Soln {
    //architecture of jvm

//STEP1:WE HAVE A CODE IN .JAVA FORMAT WHICH A STATIC COMPILER COMPILES


    //STEP2:NOW WE GET A BYTE CODE OR INTERMEDIATE CODE WHICH IS S .CLASS FILE


    //STEP 3:NOW THIS .CLASS FILE GOES AS AN INPUT IN CLASS LOADER SYSTEM .THIS CLASS LOADER SUBSYSTEM LOADS THE .CLASS FILE


    //STEP4:INTERNAL WORKING OF CLASS LOADER:
    //CLASS LOADER HAS THREE PARTS I.E,LOADING THE VARIOUS CLASS FILES,LINKING AND INITIALIZATION
    //STEP4.1:LOADING PART HAS ALSO THREE PROCESS:
    //1.BOOTSTRAP CLASS LOADER(HIGHEST PRIORITY)-IT LOADS ALL THE CLASSES IN RT.JAR FILE (ALL CORE JAVA API CLASSES ARE GOING TO BE TAKEN CARE BY BOOTSTRAP CLASS LOADER )
    //2.EXTENSION CLASS LOADER-IT LOADS ALL THE CLASS PRESENT IN .EXT FOLDER (JDK,JRE,LIB,EXT FOLDER)
    //3.APPLICATION CLASS LOADER-IT LOADS ALL THE CLASSES PRESENT IN APPLICATION LEVEL CLASS PATH LIKE ENVIRONMENT LEVEL CLASS PATH
    //STEP 4.2:LINKING :IT ALSO HAS THREE PROCESS;VERIFY,PREPARE,RESOLVE
    //VERIFICATION:BYTE CODE VERIFIER STARTS TO VERIFY,WHETHER YOUR BYTE CODE HAS BEEN GENERATED PROPERLY OR NOT,IS THERE A VIRUS OR NOT .IF THE VERIFICATION FAILS IT GIVES VERIFY ERROR
    //PREPARE:FOR STATIC VARIABLE,MEMORY WILL BE ALLOCATED AND ASSIGNED WITH DEFAULT VALUES
    //RESOLVE:ALL SYMBOLIC REFERENCES ARE REPLACED WITH ORIGINAL REFERENCES FROM METHOD AREA
    //STEP 4.3:INITIALIZATION:STATIC VARIABLES VALUES(ORIGINAL) ARE ASSIGNED AND STATIC BLOCK IS EXECUTED




    //STEP5:NOW AFTER CLASS LOADING ,IT IS SENT DIRECTLY TO VARIOUS MEMORY AREAS OF JVM
    //THERE ARE FIVE MEMORY AREAS IN JVM :METHOD AREA,HEAP AREA,STACK AREA,PC REGISTER,NATIVE METHOD STACK
    //ALL CLASS RELATED DATA IS PRESENT IN METHOD AREA .LIKE STATIC VARIABLES
    //ALL OBJECT DATA AND ITS CORRESPONDING INSTANCE VARIABLES IS PRESENT IN HEAP AREA
    //FOR EVERY JVM ,ONLY ONE METHOD AREA AND ONE HEAP AREA BUT FOR EVERY THREAD ONE RUNTIME STACK WILL BE THERE  PRESENT INSIDE STACK AREA
    //ALL THREADS SHARE ONE METHOD AREA AND HEAP AREA ,SO THE DATA WHICH IS STORED IN HEAP AND METHOD AREA IS NOT THREAD SAFE.BUT DATA STORED IN STACK AREA, IS THREAD SAFE .
    //ALL LOCAL VARIABLES WILL BE CREATED INSIDE STACK MEMORY
    //FOR EVERY METHOD CALL ONE ENTRY WILL BE STORED IN STACK FRAME ,AND EACH STACK FRAME HAS THREE PARTS I.E,LOCAL VARIABLE ARRAY :RELATED TO THAT PARTICUALR METHOD,HOW MANY LOCAL VARIABLES ARE THERE AND ITS CORRESPONDING VALUES WILL BE SAVED IN LOCAL VARIABLE ARRAY
    //OPERAND STACK:IF AN INTERMEDIATE OPERATION IS REQUIRED ,  WHICH ONE HAS RUNTIME WORKSPACE
    //FRAME DATA:IN THAT METHOD,BY DEFAULT IT TAKES CARE OF ALL THE SYMBOLS USED IN THE DATA
    //IN CASE OF EXCEPTION OCCURS,THE EXCEPTION INFORMATION WILL BE SAVED IN FRAME DATA
//FOR EVERY THREAD ,IT'S NEXT EXECUTABLE INSTRUCTION IS STORED IN PC REGISTER .EVERY THREAD HAS ONE PC REGISTER AVAILABLE IN PC REGISTER AREA
    //TO HOLD NATIVE METHOD INFORMATION ,NATIVE METHOD AREA IS PRESENT BY DEFAULT WILL BE THERE




    //STEP 6:NOW ,AFTER CLASS LOADING ,THIS CODE IS SENT INTO EXECUTION ENGINE
    //EXECUTION ENGINE HAS MAINLY THREE PARTS :INTERPRETER,JIT COMPILER,PROFILER,GARBAGE COLLECTOR ETC
    //STEP 6.1:WHOLE JAVA CODE PASSES THROUGH THE INTERPRETER ONCE.INTERPRETER IS RESPONSIBLE TO READ ,INTERPRET AND EXECUTE JAVA CODE LINE BY LINE .
    //IF SOME CODE IS REPEATING MORE THAN ONCE ,THEN PROFILER DETECTS IT AND SENDS IT TO JIT COMPILER DURING RUNTIME
    //JIT OR JUST IN TIME COMPILER WHICH COMPILES THE REDUNDANT CODE AND CONVERTS IT INTO MACHINE LEVEL CODE .IT INCREASES THE EXECUTION SPEED
    //JIT WORKS IN THREE STAGES:
    //1.INTERMEDIATE CODE GENERATOR-IT GENERATES INTERMEDIATE CODE
    //2.CODE OPTIMIZER-NOW IT OPTIMIZES THE CODE
    //3.TARGET CODE GENERATOR-THEN ,IT CONVERTS THE INTERMEDIATE CODE INTO CODE GENERATOR
    //WHILE EXECUTING CODE,EXECUTION ENGINE SOMETIMES REQUIRED NATIVE METHODS INFORMATION.JAVA NATIVE INTERFACE IS RESPONSIBLE FOR PROVIDING THE NATIVE METHOD INFORMATION FROM NATIVE LIBRARY


}
