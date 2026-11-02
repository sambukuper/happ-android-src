// _cgoexp_5994d4b84130_proxylibxray_XRayPoint_IsRunning_Set @ 01c11340 size=72
// callers:
//   Entry Point ?
//   02014578 ?
//   01c11384 _cgoexp_5994d4b84130_proxylibxray_XRayPoint_IsRunning_Set
//   01c6dd2c proxylibxray_XRayPoint_IsRunning_Set

void _cgoexp_5994d4b84130_proxylibxray_XRayPoint_IsRunning_Set(sdword *param_1)

{
  int in_x28;
  undefined8 in_x29;
  undefined8 in_x30;
  undefined8 local_28 [5];
  
  for (; register0x00000008 <= *(undefined1 **)(in_x28 + 0x10);
      register0x00000008 = (BADSPACEBASE *)((int)register0x00000008 + 8)) {
    *(sdword **)((int)register0x00000008 + 8) = param_1;
    in_x30 = 0x1c11380;
    FUN_010bbd80();
    param_1 = *(sdword **)((int)register0x00000008 + 0x10);
  }
  *(undefined8 *)((int)register0x00000008 + -0x20) = in_x30;
  *(undefined8 *)((int)register0x00000008 + -0x28) = in_x29;
  FUN_01c0f1f0((int)*param_1,(char)param_1[1]);
  return;
}


