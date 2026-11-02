// _cgoexp_5994d4b84130_proxylibxray_XRayPoint_CoreStopLoop @ 01c11540 size=76
// callers:
//   Entry Point ?
//   020145a8 ?
//   01c11588 _cgoexp_5994d4b84130_proxylibxray_XRayPoint_CoreStopLoop
//   01c6df70 proxylibxray_XRayPoint_CoreStopLoop

void _cgoexp_5994d4b84130_proxylibxray_XRayPoint_CoreStopLoop(sdword *param_1)

{
  undefined4 uVar1;
  int in_x28;
  undefined8 in_x29;
  undefined8 in_x30;
  undefined8 local_28 [5];
  
  for (; register0x00000008 <= *(undefined1 **)(in_x28 + 0x10);
      register0x00000008 = (BADSPACEBASE *)((int)register0x00000008 + 8)) {
    *(sdword **)((int)register0x00000008 + 8) = param_1;
    in_x30 = 0x1c11584;
    FUN_010bbd80();
    param_1 = *(sdword **)((int)register0x00000008 + 0x10);
  }
  *(undefined8 *)((int)register0x00000008 + -0x20) = in_x30;
  *(undefined8 *)((int)register0x00000008 + -0x28) = in_x29;
  *(sdword **)((int)register0x00000008 + 8) = param_1;
  uVar1 = FUN_01c0f580((int)*param_1);
  *(undefined4 *)(*(int *)((int)register0x00000008 + 0x10) + 4) = uVar1;
  return;
}


