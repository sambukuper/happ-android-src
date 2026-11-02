// _cgoexp_5994d4b84130_proxylibxray_ConsoleLogWriter_Write @ 01c111e0 size=96
// callers:
//   Entry Point ?
//   02014558 ?
//   01c1123c _cgoexp_5994d4b84130_proxylibxray_ConsoleLogWriter_Write
//   01c6dbd4 proxylibxray_ConsoleLogWriter_Write

void _cgoexp_5994d4b84130_proxylibxray_ConsoleLogWriter_Write(sdword *param_1)

{
  sdword sVar1;
  undefined4 uVar2;
  int in_x28;
  undefined8 in_x29;
  undefined8 in_x30;
  undefined8 uVar3;
  undefined8 local_48 [9];
  
  for (; register0x00000008 <= *(undefined1 **)(in_x28 + 0x10);
      register0x00000008 = (BADSPACEBASE *)((int)register0x00000008 + 8)) {
    *(sdword **)((int)register0x00000008 + 8) = param_1;
    in_x30 = 0x1c11238;
    FUN_010bbd80();
    param_1 = *(sdword **)((int)register0x00000008 + 0x10);
  }
  *(undefined8 *)((int)register0x00000008 + -0x40) = in_x30;
  *(undefined8 *)((int)register0x00000008 + -0x48) = in_x29;
  *(sdword **)((int)register0x00000008 + 8) = param_1;
  sVar1 = *param_1;
  uVar3 = *(undefined8 *)(param_1 + 4);
  *(undefined8 *)((int)register0x00000008 + -0x18) = *(undefined8 *)(param_1 + 2);
  *(undefined8 *)((int)register0x00000008 + -0x10) = uVar3;
  *(undefined8 *)((int)register0x00000008 + -0x38) =
       *(undefined8 *)((int)register0x00000008 + -0x18);
  *(undefined8 *)((int)register0x00000008 + -0x30) =
       *(undefined8 *)((int)register0x00000008 + -0x10);
  uVar2 = FUN_01c0ef80((int)sVar1);
  *(undefined4 *)(*(int *)((int)register0x00000008 + 0x10) + 0x18) = uVar2;
  return;
}


