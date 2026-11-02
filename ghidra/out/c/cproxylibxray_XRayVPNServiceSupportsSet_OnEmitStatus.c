// cproxylibxray_XRayVPNServiceSupportsSet_OnEmitStatus @ 01c6fc34 size=172
// callers:
//   Entry Point ?
//   01c6eb48 _cgo_5994d4b84130_Cfunc_cproxylibxray_XRayVPNServiceSupportsSet_OnEmitStatus

undefined8
cproxylibxray_XRayVPNServiceSupportsSet_OnEmitStatus
          (uint param_1,undefined8 param_2,undefined8 param_3,undefined8 param_4)

{
  int *piVar1;
  undefined8 uVar2;
  undefined8 uVar3;
  
  param_1 = param_1 & 0xffffffff;
  piVar1 = (int *)go_seq_push_local_frame(2);
  uVar2 = go_seq_from_refnum(piVar1,param_1 & 0xffffffff,
                             proxy_class_libxray_XRayVPNServiceSupportsSet,
                             proxy_class_libxray_XRayVPNServiceSupportsSet_cons);
  uVar3 = go_seq_to_java_string(piVar1,param_3,param_4);
  uVar2 = (**(code **)(*piVar1 + 0x1a0))(piVar1,uVar2,DAT_021328a0,param_2,uVar3);
  go_seq_pop_local_frame(piVar1);
  return uVar2;
}


