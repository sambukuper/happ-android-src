// Java_libxray_XRayPoint_coreStopLoop @ 01c6f53c size=80
// callers:
//   Entry Point ?

void Java_libxray_XRayPoint_coreStopLoop(int *param_1)

{
  undefined4 uVar1;
  int iVar2;
  
  go_seq_to_refnum_go();
  uVar1 = proxylibxray_XRayPoint_CoreStopLoop();
  iVar2 = go_seq_from_refnum(param_1,uVar1,proxy_class__error,proxy_class__error_cons);
  if (iVar2 != 0) {
                    /* WARNING: Could not recover jumptable at 0x01c6fe00. Too many branches */
                    /* WARNING: Treating indirect jump as call */
    (**(code **)(*param_1 + 0x68))();
    return;
  }
  return;
}


