// _cgoexp_5994d4b84130_proxylibxray__GetCoreVersion @ 01c11c60 size=144
// callers:
//   Entry Point ?
//   02014628 ?
//   01c11cec _cgoexp_5994d4b84130_proxylibxray__GetCoreVersion
//   01c6e674 proxylibxray__GetCoreVersion

void _cgoexp_5994d4b84130_proxylibxray__GetCoreVersion(undefined8 param_1)

{
  undefined1 *puVar1;
  undefined8 *puVar2;
  int in_x28;
  undefined8 in_x29;
  undefined8 in_x30;
  undefined8 uVar3;
  undefined8 local_58 [9];
  undefined8 local_10 [2];
  
  for (; register0x00000008 <= *(undefined1 **)(in_x28 + 0x10);
      register0x00000008 = (BADSPACEBASE *)((int)register0x00000008 + 8)) {
    *(undefined8 *)((int)register0x00000008 + 8) = param_1;
    in_x30 = 0x1c11ce8;
    FUN_010bbd80();
    param_1 = *(undefined8 *)((int)register0x00000008 + 0x10);
  }
  *(undefined8 *)((int)register0x00000008 + -0x50) = in_x30;
  *(undefined8 *)((int)register0x00000008 + -0x58) = in_x29;
  *(undefined8 *)((int)register0x00000008 + 8) = param_1;
  FUN_01c10550();
  puVar1 = (undefined1 *)((int)register0x00000008 + -0x48);
  *(undefined8 *)((int)register0x00000008 + -0x10) =
       *(undefined8 *)((int)register0x00000008 + -0x40);
  *(undefined8 *)((int)register0x00000008 + -8) = *(undefined8 *)((int)register0x00000008 + -0x38);
  puVar2 = *(undefined8 **)((int)register0x00000008 + 0x10);
  if (DAT_021339b0 != 0) {
    FUN_01050970(&DAT_01f259f0,puVar2,(undefined1 *)((int)register0x00000008 + -0x10));
    puVar1 = (undefined1 *)((int)register0x00000008 + -0x40);
    puVar2 = *(undefined8 **)((int)register0x00000008 + 0x18);
  }
  uVar3 = *(undefined8 *)(puVar1 + 0x40);
  *puVar2 = *(undefined8 *)(puVar1 + 0x38);
  puVar2[1] = uVar3;
  *(undefined8 *)(puVar1 + 0x28) = *(undefined8 *)(puVar1 + 0x38);
  *(undefined8 *)(puVar1 + 0x30) = *(undefined8 *)(puVar1 + 0x40);
  FUN_010b30d0(&DAT_01f259f0,puVar1 + 0x28);
  return;
}


