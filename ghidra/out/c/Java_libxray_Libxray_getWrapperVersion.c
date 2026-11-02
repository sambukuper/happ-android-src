// Java_libxray_Libxray_getWrapperVersion @ 01c6f030 size=52
// callers:
//   Entry Point ?

undefined8 Java_libxray_Libxray_getWrapperVersion(int *param_1)

{
  undefined8 uVar1;
  sdword sVar2;
  int iVar3;
  undefined1 auVar4 [12];
  
  auVar4 = proxylibxray__GetWrapperVersion();
  sVar2 = auVar4._8_4_;
  iVar3 = auVar4._0_8_;
  if (sVar2 < 0) {
    sVar2 = sVar2 + 1;
  }
  uVar1 = (**(code **)(*param_1 + 0x518))(param_1,iVar3,sVar2 >> 1);
  if (iVar3 != 0) {
    free(iVar3);
  }
  return uVar1;
}


