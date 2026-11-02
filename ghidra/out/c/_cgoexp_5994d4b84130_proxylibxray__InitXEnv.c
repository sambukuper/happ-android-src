// _cgoexp_5994d4b84130_proxylibxray__InitXEnv @ 01c11d90 size=96
// callers:
//   Entry Point ?
//   02014638 ?
//   01c11dec _cgoexp_5994d4b84130_proxylibxray__InitXEnv
//   01c6e738 proxylibxray__InitXEnv

void _cgoexp_5994d4b84130_proxylibxray__InitXEnv(undefined8 *param_1)

{
  int in_x28;
  undefined8 in_x29;
  undefined8 in_x30;
  undefined8 uVar1;
  undefined8 local_58 [11];
  
  for (; register0x00000008 <= *(undefined1 **)(in_x28 + 0x10);
      register0x00000008 = (BADSPACEBASE *)((int)register0x00000008 + 8)) {
    *(undefined8 **)((int)register0x00000008 + 8) = param_1;
    in_x30 = 0x1c11de8;
    FUN_010bbd80();
    param_1 = *(undefined8 **)((int)register0x00000008 + 0x10);
  }
  *(undefined8 *)((int)register0x00000008 + -0x50) = in_x30;
  *(undefined8 *)((int)register0x00000008 + -0x58) = in_x29;
  uVar1 = param_1[1];
  *(undefined8 *)((int)register0x00000008 + -0x18) = *param_1;
  *(undefined8 *)((int)register0x00000008 + -0x10) = uVar1;
  uVar1 = param_1[3];
  *(undefined8 *)((int)register0x00000008 + -0x28) = param_1[2];
  *(undefined8 *)((int)register0x00000008 + -0x20) = uVar1;
  *(undefined8 *)((int)register0x00000008 + -0x48) =
       *(undefined8 *)((int)register0x00000008 + -0x18);
  *(undefined8 *)((int)register0x00000008 + -0x40) =
       *(undefined8 *)((int)register0x00000008 + -0x10);
  *(undefined8 *)((int)register0x00000008 + -0x38) =
       *(undefined8 *)((int)register0x00000008 + -0x28);
  *(undefined8 *)((int)register0x00000008 + -0x30) =
       *(undefined8 *)((int)register0x00000008 + -0x20);
  FUN_01c10610();
  return;
}


