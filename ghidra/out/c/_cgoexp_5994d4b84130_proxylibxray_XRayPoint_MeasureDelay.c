// _cgoexp_5994d4b84130_proxylibxray_XRayPoint_MeasureDelay @ 01c11590 size=120
// callers:
//   Entry Point ?
//   020145b0 ?
//   01c11604 _cgoexp_5994d4b84130_proxylibxray_XRayPoint_MeasureDelay
//   01c6e000 proxylibxray_XRayPoint_MeasureDelay

void _cgoexp_5994d4b84130_proxylibxray_XRayPoint_MeasureDelay(sdword *param_1)

{
  sdword sVar1;
  undefined8 uVar2;
  int in_x28;
  undefined8 in_x29;
  undefined8 in_x30;
  undefined1 auVar3 [12];
  undefined8 local_68 [13];
  
  for (; register0x00000008 <= *(undefined1 **)(in_x28 + 0x10);
      register0x00000008 = (BADSPACEBASE *)((int)register0x00000008 + 8)) {
    *(sdword **)((int)register0x00000008 + 8) = param_1;
    in_x30 = 0x1c11600;
    FUN_010bbd80();
    param_1 = *(sdword **)((int)register0x00000008 + 0x10);
  }
  *(undefined8 *)((int)register0x00000008 + -0x60) = in_x30;
  *(undefined8 *)((int)register0x00000008 + -0x68) = in_x29;
  *(sdword **)((int)register0x00000008 + 8) = param_1;
  sVar1 = *param_1;
  uVar2 = *(undefined8 *)(param_1 + 4);
  *(undefined8 *)((int)register0x00000008 + -0x18) = *(undefined8 *)(param_1 + 2);
  *(undefined8 *)((int)register0x00000008 + -0x10) = uVar2;
  uVar2 = *(undefined8 *)(param_1 + 8);
  *(undefined8 *)((int)register0x00000008 + -0x28) = *(undefined8 *)(param_1 + 6);
  *(undefined8 *)((int)register0x00000008 + -0x20) = uVar2;
  uVar2 = *(undefined8 *)(param_1 + 10);
  *(undefined8 *)((int)register0x00000008 + -0x58) =
       *(undefined8 *)((int)register0x00000008 + -0x18);
  *(undefined8 *)((int)register0x00000008 + -0x50) =
       *(undefined8 *)((int)register0x00000008 + -0x10);
  *(undefined8 *)((int)register0x00000008 + -0x48) =
       *(undefined8 *)((int)register0x00000008 + -0x28);
  *(undefined8 *)((int)register0x00000008 + -0x40) =
       *(undefined8 *)((int)register0x00000008 + -0x20);
  auVar3 = FUN_01c0f600((int)sVar1,uVar2);
  *(undefined1 (*) [12])(*(int *)((int)register0x00000008 + 0x10) + 0x30) = auVar3;
  return;
}


