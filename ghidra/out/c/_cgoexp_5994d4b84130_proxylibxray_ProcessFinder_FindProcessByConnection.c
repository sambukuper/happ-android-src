// _cgoexp_5994d4b84130_proxylibxray_ProcessFinder_FindProcessByConnection @ 01c11930 size=140
// callers:
//   Entry Point ?
//   020145e8 ?
//   01c119b8 _cgoexp_5994d4b84130_proxylibxray_ProcessFinder_FindProcessByConnection
//   01c6e38c proxylibxray_ProcessFinder_FindProcessByConnection

void _cgoexp_5994d4b84130_proxylibxray_ProcessFinder_FindProcessByConnection(sdword *param_1)

{
  sdword sVar1;
  undefined8 uVar2;
  undefined8 uVar3;
  int in_x28;
  undefined8 in_x29;
  undefined8 in_x30;
  undefined8 local_98 [12];
  undefined8 local_38 [7];
  
  for (; (undefined1 *)((int)register0x00000008 + -0x10) <= *(undefined1 **)(in_x28 + 0x10);
      register0x00000008 = (BADSPACEBASE *)((int)register0x00000008 + 8)) {
    *(sdword **)((int)register0x00000008 + 8) = param_1;
    in_x30 = 0x1c119b4;
    FUN_010bbd80();
    param_1 = *(sdword **)((int)register0x00000008 + 0x10);
  }
  *(undefined8 *)((int)register0x00000008 + -0x90) = in_x30;
  *(undefined8 *)((int)register0x00000008 + -0x98) = in_x29;
  *(sdword **)((int)register0x00000008 + 8) = param_1;
  sVar1 = *param_1;
  uVar2 = *(undefined8 *)(param_1 + 4);
  *(undefined8 *)((int)register0x00000008 + -0x18) = *(undefined8 *)(param_1 + 2);
  *(undefined8 *)((int)register0x00000008 + -0x10) = uVar2;
  uVar2 = *(undefined8 *)(param_1 + 8);
  *(undefined8 *)((int)register0x00000008 + -0x28) = *(undefined8 *)(param_1 + 6);
  *(undefined8 *)((int)register0x00000008 + -0x20) = uVar2;
  uVar2 = *(undefined8 *)(param_1 + 10);
  uVar3 = *(undefined8 *)(param_1 + 0xe);
  *(undefined8 *)((int)register0x00000008 + -0x38) = *(undefined8 *)(param_1 + 0xc);
  *(undefined8 *)((int)register0x00000008 + -0x30) = uVar3;
  uVar3 = *(undefined8 *)(param_1 + 0x10);
  *(undefined8 *)((int)register0x00000008 + -0x88) =
       *(undefined8 *)((int)register0x00000008 + -0x18);
  *(undefined8 *)((int)register0x00000008 + -0x80) =
       *(undefined8 *)((int)register0x00000008 + -0x10);
  *(undefined8 *)((int)register0x00000008 + -0x78) =
       *(undefined8 *)((int)register0x00000008 + -0x28);
  *(undefined8 *)((int)register0x00000008 + -0x70) =
       *(undefined8 *)((int)register0x00000008 + -0x20);
  *(undefined8 *)((int)register0x00000008 + -0x68) =
       *(undefined8 *)((int)register0x00000008 + -0x38);
  *(undefined8 *)((int)register0x00000008 + -0x60) =
       *(undefined8 *)((int)register0x00000008 + -0x30);
  uVar2 = FUN_01c0fcc0((int)sVar1,uVar2,uVar3);
  *(undefined8 *)(*(int *)((int)register0x00000008 + 0x10) + 0x48) = uVar2;
  return;
}


