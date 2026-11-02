// _cgoexp_5994d4b84130_proxy_error_Error @ 01c12030 size=148
// callers:
//   Entry Point ?
//   02014660 ?
//   01c120c0 _cgoexp_5994d4b84130_proxy_error_Error
//   01c6e9ac proxy_error_Error

void _cgoexp_5994d4b84130_proxy_error_Error(sdword *param_1)

{
  undefined1 *puVar1;
  int iVar2;
  int in_x28;
  undefined8 in_x29;
  undefined8 in_x30;
  undefined8 uVar3;
  undefined8 local_58 [9];
  undefined8 local_10 [2];
  
  for (; register0x00000008 <= *(undefined1 **)(in_x28 + 0x10);
      register0x00000008 = (BADSPACEBASE *)((int)register0x00000008 + 8)) {
    *(sdword **)((int)register0x00000008 + 8) = param_1;
    in_x30 = 0x1c120bc;
    FUN_010bbd80();
    param_1 = *(sdword **)((int)register0x00000008 + 0x10);
  }
  *(undefined8 *)((int)register0x00000008 + -0x50) = in_x30;
  *(undefined8 *)((int)register0x00000008 + -0x58) = in_x29;
  *(sdword **)((int)register0x00000008 + 8) = param_1;
  FUN_01c109d0((int)*param_1);
  puVar1 = (undefined1 *)((int)register0x00000008 + -0x48);
  *(undefined8 *)((int)register0x00000008 + -0x10) =
       *(undefined8 *)((int)register0x00000008 + -0x40);
  *(undefined8 *)((int)register0x00000008 + -8) = *(undefined8 *)((int)register0x00000008 + -0x38);
  if (DAT_021339b0 != 0) {
    FUN_01050970(&DAT_01f259f0,*(int *)((int)register0x00000008 + 0x10) + 8,
                 (undefined1 *)((int)register0x00000008 + -0x10));
    puVar1 = (undefined1 *)((int)register0x00000008 + -0x40);
  }
  uVar3 = *(undefined8 *)(puVar1 + 0x40);
  iVar2 = *(int *)(puVar1 + 0x58);
  *(undefined8 *)(iVar2 + 8) = *(undefined8 *)(puVar1 + 0x38);
  *(undefined8 *)(iVar2 + 0x10) = uVar3;
  *(undefined8 *)(puVar1 + 0x28) = *(undefined8 *)(puVar1 + 0x38);
  *(undefined8 *)(puVar1 + 0x30) = *(undefined8 *)(puVar1 + 0x40);
  FUN_010b30d0(&DAT_01f259f0,puVar1 + 0x28);
  return;
}


