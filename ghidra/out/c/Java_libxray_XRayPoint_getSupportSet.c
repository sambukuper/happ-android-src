// Java_libxray_XRayPoint_getSupportSet @ 01c6f914 size=68
// callers:
//   Entry Point ?

undefined8 Java_libxray_XRayPoint_getSupportSet(int *param_1)

{
  uint uVar1;
  int iVar2;
  undefined8 uVar3;
  uint uVar4;
  int iVar5;
  
  go_seq_to_refnum_go();
  uVar1 = proxylibxray_XRayPoint_SupportSet_Get();
  if ((sdword)uVar1 == 0x29) {
    return 0;
  }
  uVar4 = uVar1 & 0xffffffff;
  if (-1 < (sdword)uVar1) {
    iVar5 = 0x2132000;
    iVar2 = (**(code **)(*param_1 + 0x390))(param_1,DAT_021328b8,DAT_021328d0,uVar4);
    if (iVar2 != 0) {
      (**(code **)(*param_1 + 0x468))
                (param_1,*(undefined8 *)(iVar5 + 0x8b8),DAT_021328d8,uVar4 & 0xffffffff);
                    /* WARNING: Could not recover jumptable at 0x01c704bc. Too many branches */
                    /* WARNING: Treating indirect jump as call */
      uVar3 = (**(code **)(*param_1 + 0x2f8))(param_1,iVar2,DAT_021328e0);
      return uVar3;
    }
    __android_log_print(7,"go/Seq","Unknown reference: %d",uVar4 & 0xffffffff);
                    /* WARNING: Subroutine does not return */
    abort();
  }
                    /* WARNING: Could not recover jumptable at 0x01c704dc. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  uVar3 = (**(code **)(*param_1 + 0xe0))
                    (param_1,proxy_class_libxray_XRayVPNServiceSupportsSet,
                     proxy_class_libxray_XRayVPNServiceSupportsSet_cons,uVar4);
  return uVar3;
}


