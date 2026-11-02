// _cgoexp_5994d4b84130_proxylibxray__NewXRayPoint @ 01c11fd0 size=84
// callers:
//   Entry Point ?
//   02014658 ?
//   01c12020 _cgoexp_5994d4b84130_proxylibxray__NewXRayPoint
//   01c6e94c proxylibxray__NewXRayPoint

void _cgoexp_5994d4b84130_proxylibxray__NewXRayPoint(sdword *param_1)

{
  undefined4 uVar1;
  int in_x28;
  undefined8 in_x29;
  undefined8 in_x30;
  undefined8 local_28 [5];
  
  for (; register0x00000008 <= *(undefined1 **)(in_x28 + 0x10);
      register0x00000008 = (BADSPACEBASE *)((int)register0x00000008 + 8)) {
    *(sdword **)((int)register0x00000008 + 8) = param_1;
    in_x30 = 0x1c1201c;
    FUN_010bbd80();
    param_1 = *(sdword **)((int)register0x00000008 + 0x10);
  }
  *(undefined8 *)((int)register0x00000008 + -0x20) = in_x30;
  *(undefined8 *)((int)register0x00000008 + -0x28) = in_x29;
  *(sdword **)((int)register0x00000008 + 8) = param_1;
  uVar1 = FUN_01c108a0((int)*param_1,(char)param_1[1]);
  *(undefined4 *)(*(int *)((int)register0x00000008 + 0x10) + 8) = uVar1;
  return;
}


