// _cgoexp_5994d4b84130_new_libxray_ConsoleLogWriter @ 01c11240 size=104
// callers:
//   Entry Point ?
//   02014560 ?
//   01c112a4 _cgoexp_5994d4b84130_new_libxray_ConsoleLogWriter
//   01c6dc18 new_libxray_ConsoleLogWriter

void _cgoexp_5994d4b84130_new_libxray_ConsoleLogWriter(undefined8 param_1)

{
  undefined4 uVar1;
  undefined8 uVar2;
  int in_x28;
  undefined8 in_x29;
  undefined8 in_x30;
  undefined8 local_48 [9];
  
  for (; register0x00000008 <= *(undefined1 **)(in_x28 + 0x10);
      register0x00000008 = (BADSPACEBASE *)((int)register0x00000008 + 8)) {
    *(undefined8 *)((int)register0x00000008 + 8) = param_1;
    in_x30 = 0x1c112a0;
    FUN_010bbd80();
    param_1 = *(undefined8 *)((int)register0x00000008 + 0x10);
  }
  *(undefined8 *)((int)register0x00000008 + -0x40) = in_x30;
  *(undefined8 *)((int)register0x00000008 + -0x48) = in_x29;
  *(undefined8 *)((int)register0x00000008 + 8) = param_1;
  uVar2 = FUN_0104d440(0x10,&DAT_01ef3ab0,1);
  uVar1 = FUN_01c0d510(&DAT_01d06300,uVar2);
  **(undefined4 **)((int)register0x00000008 + 0x18) = uVar1;
  return;
}


