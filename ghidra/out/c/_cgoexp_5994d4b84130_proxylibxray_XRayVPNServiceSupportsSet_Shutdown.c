// _cgoexp_5994d4b84130_proxylibxray_XRayVPNServiceSupportsSet_Shutdown @ 01c11a30 size=76
// callers:
//   Entry Point ?
//   020145f8 ?
//   01c11a78 _cgoexp_5994d4b84130_proxylibxray_XRayVPNServiceSupportsSet_Shutdown
//   01c6e470 proxylibxray_XRayVPNServiceSupportsSet_Shutdown

void _cgoexp_5994d4b84130_proxylibxray_XRayVPNServiceSupportsSet_Shutdown(sdword *param_1)

{
  undefined8 uVar1;
  int in_x28;
  undefined8 in_x29;
  undefined8 in_x30;
  undefined8 local_28 [5];
  
  for (; register0x00000008 <= *(undefined1 **)(in_x28 + 0x10);
      register0x00000008 = (BADSPACEBASE *)((int)register0x00000008 + 8)) {
    *(sdword **)((int)register0x00000008 + 8) = param_1;
    in_x30 = 0x1c11a74;
    FUN_010bbd80();
    param_1 = *(sdword **)((int)register0x00000008 + 0x10);
  }
  *(undefined8 *)((int)register0x00000008 + -0x20) = in_x30;
  *(undefined8 *)((int)register0x00000008 + -0x28) = in_x29;
  *(sdword **)((int)register0x00000008 + 8) = param_1;
  uVar1 = FUN_01c100d0((int)*param_1);
  *(undefined8 *)(*(int *)((int)register0x00000008 + 0x10) + 8) = uVar1;
  return;
}


