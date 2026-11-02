// _cgoexp_5994d4b84130_proxylibxray_XRayPoint_QueryStatsCustom @ 01c11680 size=128
// callers:
//   Entry Point ?
//   020145c0 ?
//   01c116fc _cgoexp_5994d4b84130_proxylibxray_XRayPoint_QueryStatsCustom
//   01c6e128 proxylibxray_XRayPoint_QueryStatsCustom

void _cgoexp_5994d4b84130_proxylibxray_XRayPoint_QueryStatsCustom(sdword *param_1)

{
  sdword sVar1;
  undefined8 uVar2;
  int in_x28;
  undefined8 in_x29;
  undefined8 in_x30;
  undefined8 local_88 [17];
  
  for (; register0x00000008 <= *(undefined1 **)(in_x28 + 0x10);
      register0x00000008 = (BADSPACEBASE *)((int)register0x00000008 + 8)) {
    *(sdword **)((int)register0x00000008 + 8) = param_1;
    in_x30 = 0x1c116f8;
    FUN_010bbd80();
    param_1 = *(sdword **)((int)register0x00000008 + 0x10);
  }
  *(undefined8 *)((int)register0x00000008 + -0x80) = in_x30;
  *(undefined8 *)((int)register0x00000008 + -0x88) = in_x29;
  *(sdword **)((int)register0x00000008 + 8) = param_1;
  sVar1 = *param_1;
  uVar2 = *(undefined8 *)(param_1 + 4);
  *(undefined8 *)((int)register0x00000008 + -0x18) = *(undefined8 *)(param_1 + 2);
  *(undefined8 *)((int)register0x00000008 + -0x10) = uVar2;
  uVar2 = *(undefined8 *)(param_1 + 8);
  *(undefined8 *)((int)register0x00000008 + -0x28) = *(undefined8 *)(param_1 + 6);
  *(undefined8 *)((int)register0x00000008 + -0x20) = uVar2;
  uVar2 = *(undefined8 *)(param_1 + 0xc);
  *(undefined8 *)((int)register0x00000008 + -0x38) = *(undefined8 *)(param_1 + 10);
  *(undefined8 *)((int)register0x00000008 + -0x30) = uVar2;
  *(undefined8 *)((int)register0x00000008 + -0x78) =
       *(undefined8 *)((int)register0x00000008 + -0x18);
  *(undefined8 *)((int)register0x00000008 + -0x70) =
       *(undefined8 *)((int)register0x00000008 + -0x10);
  *(undefined8 *)((int)register0x00000008 + -0x68) =
       *(undefined8 *)((int)register0x00000008 + -0x28);
  *(undefined8 *)((int)register0x00000008 + -0x60) =
       *(undefined8 *)((int)register0x00000008 + -0x20);
  *(undefined8 *)((int)register0x00000008 + -0x58) =
       *(undefined8 *)((int)register0x00000008 + -0x38);
  *(undefined8 *)((int)register0x00000008 + -0x50) =
       *(undefined8 *)((int)register0x00000008 + -0x30);
  uVar2 = FUN_01c0f7d0((int)sVar1);
  *(undefined8 *)(*(int *)((int)register0x00000008 + 0x10) + 0x38) = uVar2;
  return;
}


