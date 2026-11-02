// _cgoexp_5994d4b84130_new_libxray_XRayPoint @ 01c118c0 size=104
// callers:
//   Entry Point ?
//   020145e0 ?
//   01c11924 _cgoexp_5994d4b84130_new_libxray_XRayPoint
//   01c6e2e0 new_libxray_XRayPoint

void _cgoexp_5994d4b84130_new_libxray_XRayPoint(undefined8 param_1)

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
    in_x30 = 0x1c11920;
    FUN_010bbd80();
    param_1 = *(undefined8 *)((int)register0x00000008 + 0x10);
  }
  *(undefined8 *)((int)register0x00000008 + -0x40) = in_x30;
  *(undefined8 *)((int)register0x00000008 + -0x48) = in_x29;
  *(undefined8 *)((int)register0x00000008 + 8) = param_1;
  uVar2 = FUN_0104e2a0(0x40,&DAT_01faa460,1);
  uVar1 = FUN_01c0d510(&DAT_01d063c0,uVar2);
  **(undefined4 **)((int)register0x00000008 + 0x18) = uVar1;
  return;
}


