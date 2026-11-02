// _cgoexp_5994d4b84130_proxylibxray_XRayPoint_RegisterProcessFinder @ 01c11880 size=64
// callers:
//   Entry Point ?
//   020145d8 ?
//   01c118bc _cgoexp_5994d4b84130_proxylibxray_XRayPoint_RegisterProcessFinder
//   01c6e298 proxylibxray_XRayPoint_RegisterProcessFinder

void _cgoexp_5994d4b84130_proxylibxray_XRayPoint_RegisterProcessFinder(sdword *param_1)

{
  int in_x28;
  undefined8 in_x29;
  undefined8 in_x30;
  undefined8 local_28 [5];
  
  for (; register0x00000008 <= *(undefined1 **)(in_x28 + 0x10);
      register0x00000008 = (BADSPACEBASE *)((int)register0x00000008 + 8)) {
    *(sdword **)((int)register0x00000008 + 8) = param_1;
    in_x30 = 0x1c118b8;
    FUN_010bbd80();
    param_1 = *(sdword **)((int)register0x00000008 + 0x10);
  }
  *(undefined8 *)((int)register0x00000008 + -0x20) = in_x30;
  *(undefined8 *)((int)register0x00000008 + -0x28) = in_x29;
  FUN_01c0fb00((int)*param_1,(int)param_1[1]);
  return;
}


