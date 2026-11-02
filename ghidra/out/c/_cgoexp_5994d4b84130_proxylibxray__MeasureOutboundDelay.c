// _cgoexp_5994d4b84130_proxylibxray__MeasureOutboundDelay @ 01c11eb0 size=116
// callers:
//   Entry Point ?
//   02014648 ?
//   01c11f20 _cgoexp_5994d4b84130_proxylibxray__MeasureOutboundDelay
//   01c6e830 proxylibxray__MeasureOutboundDelay

void _cgoexp_5994d4b84130_proxylibxray__MeasureOutboundDelay(undefined8 *param_1)

{
  undefined8 uVar1;
  int in_x28;
  undefined8 in_x29;
  undefined8 in_x30;
  undefined1 auVar2 [12];
  undefined8 local_68 [13];
  
  for (; register0x00000008 <= *(undefined1 **)(in_x28 + 0x10);
      register0x00000008 = (BADSPACEBASE *)((int)register0x00000008 + 8)) {
    *(undefined8 **)((int)register0x00000008 + 8) = param_1;
    in_x30 = 0x1c11f1c;
    FUN_010bbd80();
    param_1 = *(undefined8 **)((int)register0x00000008 + 0x10);
  }
  *(undefined8 *)((int)register0x00000008 + -0x60) = in_x30;
  *(undefined8 *)((int)register0x00000008 + -0x68) = in_x29;
  *(undefined8 **)((int)register0x00000008 + 8) = param_1;
  uVar1 = param_1[1];
  *(undefined8 *)((int)register0x00000008 + -0x18) = *param_1;
  *(undefined8 *)((int)register0x00000008 + -0x10) = uVar1;
  uVar1 = param_1[3];
  *(undefined8 *)((int)register0x00000008 + -0x28) = param_1[2];
  *(undefined8 *)((int)register0x00000008 + -0x20) = uVar1;
  uVar1 = param_1[4];
  *(undefined8 *)((int)register0x00000008 + -0x58) =
       *(undefined8 *)((int)register0x00000008 + -0x18);
  *(undefined8 *)((int)register0x00000008 + -0x50) =
       *(undefined8 *)((int)register0x00000008 + -0x10);
  *(undefined8 *)((int)register0x00000008 + -0x48) =
       *(undefined8 *)((int)register0x00000008 + -0x28);
  *(undefined8 *)((int)register0x00000008 + -0x40) =
       *(undefined8 *)((int)register0x00000008 + -0x20);
  auVar2 = FUN_01c10700(uVar1);
  *(undefined1 (*) [12])(*(int *)((int)register0x00000008 + 0x10) + 0x28) = auVar2;
  return;
}


