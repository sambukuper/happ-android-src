// _cgoexp_5994d4b84130_proxylibxray_XRayPoint_QueryStatsServer @ 01c11700 size=184
// callers:
//   Entry Point ?
//   020145c8 ?
//   01c117b4 _cgoexp_5994d4b84130_proxylibxray_XRayPoint_QueryStatsServer
//   01c6e1ac proxylibxray_XRayPoint_QueryStatsServer

void _cgoexp_5994d4b84130_proxylibxray_XRayPoint_QueryStatsServer(sdword *param_1)

{
  sdword sVar1;
  undefined1 *puVar2;
  undefined4 uVar3;
  int iVar4;
  int in_x28;
  undefined8 in_x29;
  undefined8 in_x30;
  undefined8 uVar5;
  undefined8 local_78 [8];
  undefined4 local_34 [3];
  undefined8 local_28 [5];
  
  for (; register0x00000008 <= *(undefined1 **)(in_x28 + 0x10);
      register0x00000008 = (BADSPACEBASE *)((int)register0x00000008 + 8)) {
    *(sdword **)((int)register0x00000008 + 8) = param_1;
    in_x30 = 0x1c117b0;
    FUN_010bbd80();
    param_1 = *(sdword **)((int)register0x00000008 + 0x10);
  }
  *(undefined8 *)((int)register0x00000008 + -0x70) = in_x30;
  *(undefined8 *)((int)register0x00000008 + -0x78) = in_x29;
  *(sdword **)((int)register0x00000008 + 8) = param_1;
  *(undefined8 *)((int)register0x00000008 + -0x18) = 0;
  *(undefined8 *)((int)register0x00000008 + -0x10) = 0;
  sVar1 = *param_1;
  uVar5 = *(undefined8 *)(param_1 + 4);
  *(undefined8 *)((int)register0x00000008 + -0x28) = *(undefined8 *)(param_1 + 2);
  *(undefined8 *)((int)register0x00000008 + -0x20) = uVar5;
  *(undefined8 *)((int)register0x00000008 + -0x68) =
       *(undefined8 *)((int)register0x00000008 + -0x28);
  *(undefined8 *)((int)register0x00000008 + -0x60) =
       *(undefined8 *)((int)register0x00000008 + -0x20);
  uVar3 = FUN_01c0f8e0((int)sVar1);
  puVar2 = (undefined1 *)((int)register0x00000008 + -0x68);
  *(undefined8 *)((int)register0x00000008 + -0x10) =
       *(undefined8 *)((int)register0x00000008 + -0x50);
  *(undefined8 *)((int)register0x00000008 + -8) = *(undefined8 *)((int)register0x00000008 + -0x48);
  if (DAT_021339b0 != 0) {
    *(undefined4 *)((int)register0x00000008 + -0x34) = uVar3;
    FUN_01050970(&DAT_01f259f0,*(int *)((int)register0x00000008 + 0x10) + 0x18,
                 (undefined1 *)((int)register0x00000008 + -0x10));
    puVar2 = (undefined1 *)((int)register0x00000008 + -0x60);
    uVar3 = *(undefined4 *)((int)register0x00000008 + -0x2c);
  }
  uVar5 = *(undefined8 *)(puVar2 + 0x60);
  iVar4 = *(int *)(puVar2 + 0x78);
  *(undefined8 *)(iVar4 + 0x18) = *(undefined8 *)(puVar2 + 0x58);
  *(undefined8 *)(iVar4 + 0x20) = uVar5;
  *(undefined4 *)(iVar4 + 0x28) = uVar3;
  uVar5 = *(undefined8 *)(iVar4 + 0x20);
  *(undefined8 *)(puVar2 + 0x38) = *(undefined8 *)(iVar4 + 0x18);
  *(undefined8 *)(puVar2 + 0x40) = uVar5;
  FUN_010b30d0(&DAT_01f259f0,puVar2 + 0x38);
  return;
}


