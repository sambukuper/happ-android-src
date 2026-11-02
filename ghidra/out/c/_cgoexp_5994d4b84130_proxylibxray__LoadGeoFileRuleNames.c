// _cgoexp_5994d4b84130_proxylibxray__LoadGeoFileRuleNames @ 01c11df0 size=180
// callers:
//   Entry Point ?
//   02014640 ?
//   01c11ea0 _cgoexp_5994d4b84130_proxylibxray__LoadGeoFileRuleNames
//   01c6e7a8 proxylibxray__LoadGeoFileRuleNames

void _cgoexp_5994d4b84130_proxylibxray__LoadGeoFileRuleNames(undefined8 *param_1)

{
  undefined1 *puVar1;
  undefined4 uVar2;
  int iVar3;
  int in_x28;
  undefined8 in_x29;
  undefined8 in_x30;
  undefined8 uVar4;
  undefined8 local_78 [8];
  undefined4 local_34 [3];
  undefined8 local_28 [5];
  
  for (; register0x00000008 <= *(undefined1 **)(in_x28 + 0x10);
      register0x00000008 = (BADSPACEBASE *)((int)register0x00000008 + 8)) {
    *(undefined8 **)((int)register0x00000008 + 8) = param_1;
    in_x30 = 0x1c11e9c;
    FUN_010bbd80();
    param_1 = *(undefined8 **)((int)register0x00000008 + 0x10);
  }
  *(undefined8 *)((int)register0x00000008 + -0x70) = in_x30;
  *(undefined8 *)((int)register0x00000008 + -0x78) = in_x29;
  *(undefined8 **)((int)register0x00000008 + 8) = param_1;
  *(undefined8 *)((int)register0x00000008 + -0x18) = 0;
  *(undefined8 *)((int)register0x00000008 + -0x10) = 0;
  uVar4 = param_1[1];
  *(undefined8 *)((int)register0x00000008 + -0x28) = *param_1;
  *(undefined8 *)((int)register0x00000008 + -0x20) = uVar4;
  *(undefined8 *)((int)register0x00000008 + -0x68) =
       *(undefined8 *)((int)register0x00000008 + -0x28);
  *(undefined8 *)((int)register0x00000008 + -0x60) =
       *(undefined8 *)((int)register0x00000008 + -0x20);
  uVar2 = FUN_01c10680();
  puVar1 = (undefined1 *)((int)register0x00000008 + -0x68);
  *(undefined8 *)((int)register0x00000008 + -0x10) =
       *(undefined8 *)((int)register0x00000008 + -0x50);
  *(undefined8 *)((int)register0x00000008 + -8) = *(undefined8 *)((int)register0x00000008 + -0x48);
  if (DAT_021339b0 != 0) {
    *(undefined4 *)((int)register0x00000008 + -0x34) = uVar2;
    FUN_01050970(&DAT_01f259f0,*(int *)((int)register0x00000008 + 0x10) + 0x10,
                 (undefined1 *)((int)register0x00000008 + -0x10));
    puVar1 = (undefined1 *)((int)register0x00000008 + -0x60);
    uVar2 = *(undefined4 *)((int)register0x00000008 + -0x2c);
  }
  uVar4 = *(undefined8 *)(puVar1 + 0x60);
  iVar3 = *(int *)(puVar1 + 0x78);
  *(undefined8 *)(iVar3 + 0x10) = *(undefined8 *)(puVar1 + 0x58);
  *(undefined8 *)(iVar3 + 0x18) = uVar4;
  *(undefined4 *)(iVar3 + 0x20) = uVar2;
  uVar4 = *(undefined8 *)(iVar3 + 0x18);
  *(undefined8 *)(puVar1 + 0x38) = *(undefined8 *)(iVar3 + 0x10);
  *(undefined8 *)(puVar1 + 0x40) = uVar4;
  FUN_010b30d0(&DAT_01f259f0,puVar1 + 0x38);
  return;
}


