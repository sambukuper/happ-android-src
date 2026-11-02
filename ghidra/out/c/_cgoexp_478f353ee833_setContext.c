// _cgoexp_478f353ee833_setContext @ 01c0e990 size=108
// callers:
//   Entry Point ?
//   02014538 ?
//   01c0e9f8 _cgoexp_478f353ee833_setContext
//   01c71b40 setContext

void _cgoexp_478f353ee833_setContext(undefined8 *param_1)

{
  undefined8 extraout_x0;
  undefined8 uVar1;
  undefined8 extraout_x1;
  undefined8 uVar2;
  undefined8 extraout_x2;
  undefined8 *in_x25;
  int in_x28;
  undefined8 in_x29;
  undefined8 in_x30;
  undefined8 local_18 [3];
  
  for (; register0x00000008 <= *(undefined1 **)(in_x28 + 0x10);
      register0x00000008 = (BADSPACEBASE *)((int)register0x00000008 + 8)) {
    *(undefined8 **)((int)register0x00000008 + 8) = param_1;
    in_x30 = 0x1c0e9f4;
    FUN_010bbd80();
    param_1 = *(undefined8 **)((int)register0x00000008 + 0x10);
  }
  *(undefined8 *)((int)register0x00000008 + -0x10) = in_x30;
  *(undefined8 *)((int)register0x00000008 + -0x18) = in_x29;
  uVar1 = *param_1;
  uVar2 = param_1[1];
  if (DAT_021339b0 != 0) {
    FUN_010bdd10(uVar1,uVar2,DAT_021011f8);
    *in_x25 = extraout_x0;
    in_x25[1] = extraout_x2;
    uVar1 = extraout_x0;
    uVar2 = extraout_x1;
  }
  DAT_021011f8 = uVar1;
  DAT_02132e60 = uVar2;
  return;
}


