// Java_libxray_Libxray_newXRayPoint @ 01c6f2c0 size=80
// callers:
//   Entry Point ?

undefined8
Java_libxray_Libxray_newXRayPoint(int *param_1,undefined8 param_2,undefined8 param_3,uint param_4)

{
  undefined8 uVar1;
  uint uVar2;
  int iVar3;
  uint uVar4;
  int iVar5;
  
  param_4 = param_4 & 0xffffffff;
  uVar1 = go_seq_to_refnum(param_1,param_3);
  uVar2 = proxylibxray__NewXRayPoint(uVar1,param_4 & 0xffffffff);
  if ((sdword)uVar2 == 0x29) {
    return 0;
  }
  uVar4 = uVar2 & 0xffffffff;
  if (-1 < (sdword)uVar2) {
    iVar5 = 0x2132000;
    iVar3 = (**(code **)(*param_1 + 0x390))(param_1,DAT_021328b8,DAT_021328d0,uVar4);
    if (iVar3 != 0) {
      (**(code **)(*param_1 + 0x468))
                (param_1,*(undefined8 *)(iVar5 + 0x8b8),DAT_021328d8,uVar4 & 0xffffffff);
                    /* WARNING: Could not recover jumptable at 0x01c704bc. Too many branches */
                    /* WARNING: Treating indirect jump as call */
      uVar1 = (**(code **)(*param_1 + 0x2f8))(param_1,iVar3,DAT_021328e0);
      return uVar1;
    }
    __android_log_print(7,"go/Seq","Unknown reference: %d",uVar4 & 0xffffffff);
                    /* WARNING: Subroutine does not return */
    abort();
  }
                    /* WARNING: Could not recover jumptable at 0x01c704dc. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  uVar1 = (**(code **)(*param_1 + 0xe0))
                    (param_1,proxy_class_libxray_XRayPoint,proxy_class_libxray_XRayPoint_cons,uVar4)
  ;
  return uVar1;
}


