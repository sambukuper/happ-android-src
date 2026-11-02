// _cgoexp_5994d4b84130_proxylibxray__CutGeoData @ 01c11b60 size=124
// callers:
//   Entry Point ?
//   02014610 ?
//   01c11bd8 _cgoexp_5994d4b84130_proxylibxray__CutGeoData
//   01c6e59c proxylibxray__CutGeoData

void _cgoexp_5994d4b84130_proxylibxray__CutGeoData(undefined8 *param_1)

{
  undefined4 uVar1;
  int in_x28;
  undefined8 in_x29;
  undefined8 in_x30;
  undefined8 uVar2;
  undefined8 local_78 [15];
  
  for (; register0x00000008 <= *(undefined1 **)(in_x28 + 0x10);
      register0x00000008 = (BADSPACEBASE *)((int)register0x00000008 + 8)) {
    *(undefined8 **)((int)register0x00000008 + 8) = param_1;
    in_x30 = 0x1c11bd4;
    FUN_010bbd80();
    param_1 = *(undefined8 **)((int)register0x00000008 + 0x10);
  }
  *(undefined8 *)((int)register0x00000008 + -0x70) = in_x30;
  *(undefined8 *)((int)register0x00000008 + -0x78) = in_x29;
  *(undefined8 **)((int)register0x00000008 + 8) = param_1;
  uVar2 = param_1[1];
  *(undefined8 *)((int)register0x00000008 + -0x18) = *param_1;
  *(undefined8 *)((int)register0x00000008 + -0x10) = uVar2;
  uVar2 = param_1[3];
  *(undefined8 *)((int)register0x00000008 + -0x28) = param_1[2];
  *(undefined8 *)((int)register0x00000008 + -0x20) = uVar2;
  uVar2 = param_1[5];
  *(undefined8 *)((int)register0x00000008 + -0x38) = param_1[4];
  *(undefined8 *)((int)register0x00000008 + -0x30) = uVar2;
  *(undefined8 *)((int)register0x00000008 + -0x68) =
       *(undefined8 *)((int)register0x00000008 + -0x18);
  *(undefined8 *)((int)register0x00000008 + -0x60) =
       *(undefined8 *)((int)register0x00000008 + -0x10);
  *(undefined8 *)((int)register0x00000008 + -0x58) =
       *(undefined8 *)((int)register0x00000008 + -0x28);
  *(undefined8 *)((int)register0x00000008 + -0x50) =
       *(undefined8 *)((int)register0x00000008 + -0x20);
  *(undefined8 *)((int)register0x00000008 + -0x48) =
       *(undefined8 *)((int)register0x00000008 + -0x38);
  *(undefined8 *)((int)register0x00000008 + -0x40) =
       *(undefined8 *)((int)register0x00000008 + -0x30);
  uVar1 = FUN_01c104b0();
  *(undefined4 *)(*(int *)((int)register0x00000008 + 0x10) + 0x30) = uVar1;
  return;
}


