// Java_go_Seq_setContext @ 01c71b70 size=124
// callers:
//   Entry Point ?

void Java_go_Seq_setContext(int *param_1,undefined8 param_2,undefined8 param_3)

{
  sdword sVar1;
  undefined8 uVar2;
  undefined8 uVar3;
  undefined1 *puVar4;
  undefined1 local_30 [24];
  undefined1 local_18 [24];
  
  puVar4 = local_30;
  sVar1 = (**(code **)(*param_1 + 0x6d8))(param_1,local_18);
  if (sVar1 == 0) {
    uVar3 = *(undefined8 *)(puVar4 + 0x18);
    uVar2 = (**(code **)(*param_1 + 0xa8))(param_1,param_3);
    setContext(uVar3,uVar2);
    return;
  }
  __android_log_print(7,"go/Seq","failed to get JavaVM");
                    /* WARNING: Subroutine does not return */
  abort();
}


