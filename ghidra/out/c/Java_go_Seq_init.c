// Java_go_Seq_init @ 01c7067c size=676
// callers:
//   Entry Point ?

void Java_go_Seq_init(int *param_1,undefined8 param_2)

{
  sdword sVar1;
  int iVar2;
  
  sVar1 = (**(code **)(*param_1 + 0x6d8))(param_1,&DAT_021328f0);
  if (sVar1 != 0) {
    __android_log_print(7,"go/Seq","failed to get JVM");
                    /* WARNING: Subroutine does not return */
    abort();
  }
  sVar1 = pthread_key_create(&DAT_021328f8,FUN_01c70920);
  if (sVar1 != 0) {
    __android_log_print(7,"go/Seq","failed to initialize jnienvs thread local storage");
                    /* WARNING: Subroutine does not return */
    abort();
  }
  DAT_021328b8 = (**(code **)(*param_1 + 0xa8))(param_1,param_2);
  iVar2 = 0x2132000;
  DAT_021328d0 = (**(code **)(*param_1 + 0x388))(param_1,DAT_021328b8,"getRef","(I)Lgo/Seq$Ref;");
  if (DAT_021328d0 == 0) {
    __android_log_print(7,"go/Seq","failed to find method Seq.getRef");
                    /* WARNING: Subroutine does not return */
    abort();
  }
  DAT_021328d8 = (**(code **)(*param_1 + 0x388))
                           (param_1,*(undefined8 *)(iVar2 + 0x8b8),"decRef",&DAT_00535f7d);
  if (DAT_021328d8 == 0) {
    __android_log_print(7,"go/Seq","failed to find method Seq.decRef");
                    /* WARNING: Subroutine does not return */
    abort();
  }
  DAT_021328e8 = (**(code **)(*param_1 + 0x388))
                           (param_1,*(undefined8 *)(iVar2 + 0x8b8),"incRefnum",&DAT_00535f7d);
  if (DAT_021328e8 == 0) {
    __android_log_print(7,"go/Seq","failed to find method Seq.incRefnum");
                    /* WARNING: Subroutine does not return */
    abort();
  }
  DAT_021328c8 = (**(code **)(*param_1 + 0x388))
                           (param_1,*(undefined8 *)(iVar2 + 0x8b8),"incRef","(Ljava/lang/Object;)I")
  ;
  if (DAT_021328c8 == 0) {
    __android_log_print(7,"go/Seq","failed to find method Seq.incRef");
                    /* WARNING: Subroutine does not return */
    abort();
  }
  DAT_021328c0 = (**(code **)(*param_1 + 0x388))
                           (param_1,*(undefined8 *)(iVar2 + 0x8b8),"incGoObjectRef",
                            "(Lgo/Seq$GoObject;)I");
  if (DAT_021328c0 == 0) {
    __android_log_print(7,"go/Seq","failed to find method Seq.incGoObjectRef");
                    /* WARNING: Subroutine does not return */
    abort();
  }
  iVar2 = (**(code **)(*param_1 + 0x30))(param_1,"go/Seq$Ref");
  if (iVar2 != 0) {
    DAT_021328e0 = (**(code **)(*param_1 + 0x2f0))(param_1,iVar2,&DAT_00536103,"Ljava/lang/Object;")
    ;
    if (DAT_021328e0 != 0) {
      return;
    }
    __android_log_print(7,"go/Seq","failed to find the Seq.Ref.obj field");
                    /* WARNING: Subroutine does not return */
    abort();
  }
  __android_log_print(7,"go/Seq","failed to find the Seq.Ref class");
                    /* WARNING: Subroutine does not return */
  abort();
}


