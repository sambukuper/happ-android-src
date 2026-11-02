// cproxylibxray_XRayVPNServiceSupportsSet_Startup @ 01c6fd7c size=116
// callers:
//   Entry Point ?
//   01c6ebe0 _cgo_5994d4b84130_Cfunc_cproxylibxray_XRayVPNServiceSupportsSet_Startup

undefined8 cproxylibxray_XRayVPNServiceSupportsSet_Startup(uint param_1)

{
  int *piVar1;
  undefined8 uVar2;
  
  param_1 = param_1 & 0xffffffff;
  piVar1 = (int *)go_seq_push_local_frame(0);
  uVar2 = go_seq_from_refnum(piVar1,param_1 & 0xffffffff,
                             proxy_class_libxray_XRayVPNServiceSupportsSet,
                             proxy_class_libxray_XRayVPNServiceSupportsSet_cons);
  uVar2 = (**(code **)(*piVar1 + 0x1a0))(piVar1,uVar2,DAT_021328b0);
  go_seq_pop_local_frame(piVar1);
  return uVar2;
}


