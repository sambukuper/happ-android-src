// _cgoexp_5994d4b84130_proxylibxray_XRayPoint_CoreRunLoopWithTun @ 01c114d0 size=100
// callers:
//   Entry Point ?
//   020145a0 ?
//   01c11530 _cgoexp_5994d4b84130_proxylibxray_XRayPoint_CoreRunLoopWithTun
//   01c6df14 proxylibxray_XRayPoint_CoreRunLoopWithTun

void _cgoexp_5994d4b84130_proxylibxray_XRayPoint_CoreRunLoopWithTun(sdword *param_1)

{
  sdword sVar1;
  sdword sVar2;
  undefined4 uVar3;
  int in_x28;
  undefined8 in_x29;
  undefined8 in_x30;
  undefined8 uVar4;
  undefined8 local_48 [9];
  
  for (; register0x00000008 <= *(undefined1 **)(in_x28 + 0x10);
      register0x00000008 = (BADSPACEBASE *)((int)register0x00000008 + 8)) {
    *(sdword **)((int)register0x00000008 + 8) = param_1;
    in_x30 = 0x1c1152c;
    FUN_010bbd80();
    param_1 = *(sdword **)((int)register0x00000008 + 0x10);
  }
  *(undefined8 *)((int)register0x00000008 + -0x40) = in_x30;
  *(undefined8 *)((int)register0x00000008 + -0x48) = in_x29;
  *(sdword **)((int)register0x00000008 + 8) = param_1;
  sVar1 = *param_1;
  uVar4 = *(undefined8 *)(param_1 + 4);
  *(undefined8 *)((int)register0x00000008 + -0x18) = *(undefined8 *)(param_1 + 2);
  *(undefined8 *)((int)register0x00000008 + -0x10) = uVar4;
  sVar2 = param_1[6];
  *(undefined8 *)((int)register0x00000008 + -0x38) =
       *(undefined8 *)((int)register0x00000008 + -0x18);
  *(undefined8 *)((int)register0x00000008 + -0x30) =
       *(undefined8 *)((int)register0x00000008 + -0x10);
  uVar3 = FUN_01c0f4e0((int)sVar1,(int)sVar2);
  *(undefined4 *)(*(int *)((int)register0x00000008 + 0x10) + 0x1c) = uVar3;
  return;
}


