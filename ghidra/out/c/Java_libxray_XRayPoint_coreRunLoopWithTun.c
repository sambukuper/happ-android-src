// Java_libxray_XRayPoint_coreRunLoopWithTun @ 01c6f4b4 size=136
// callers:
//   Entry Point ?

void Java_libxray_XRayPoint_coreRunLoopWithTun
               (int *param_1,undefined8 param_2,undefined8 param_3,uint param_4)

{
  undefined4 uVar1;
  uint uVar2;
  int iVar3;
  undefined1 auVar4 [16];
  
  param_4 = param_4 & 0xffffffff;
  uVar2 = go_seq_to_refnum_go();
  uVar2 = uVar2 & 0xffffffff;
  auVar4 = go_seq_from_java_string(param_1,param_3);
  uVar1 = proxylibxray_XRayPoint_CoreRunLoopWithTun
                    (uVar2 & 0xffffffff,auVar4._0_8_,auVar4._8_8_,param_4 & 0xffffffff);
  iVar3 = go_seq_from_refnum(param_1,uVar1,proxy_class__error,proxy_class__error_cons);
  if (iVar3 != 0) {
                    /* WARNING: Could not recover jumptable at 0x01c6fe00. Too many branches */
                    /* WARNING: Treating indirect jump as call */
    (**(code **)(*param_1 + 0x68))();
    return;
  }
  return;
}


