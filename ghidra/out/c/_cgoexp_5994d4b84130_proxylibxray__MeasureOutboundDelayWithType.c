// _cgoexp_5994d4b84130_proxylibxray__MeasureOutboundDelayWithType @ 01c11f30 size=152
// callers:
//   Entry Point ?
//   02014650 ?
//   01c11fc4 _cgoexp_5994d4b84130_proxylibxray__MeasureOutboundDelayWithType
//   01c6e8d4 proxylibxray__MeasureOutboundDelayWithType

void _cgoexp_5994d4b84130_proxylibxray__MeasureOutboundDelayWithType(undefined8 *param_1)

{
  undefined8 uVar1;
  int in_x28;
  undefined8 in_x29;
  undefined8 in_x30;
  undefined1 auVar2 [12];
  undefined8 local_a8 [21];
  
  for (; (undefined1 *)((int)register0x00000008 + -0x20) <= *(undefined1 **)(in_x28 + 0x10);
      register0x00000008 = (BADSPACEBASE *)((int)register0x00000008 + 8)) {
    *(undefined8 **)((int)register0x00000008 + 8) = param_1;
    in_x30 = 0x1c11fc0;
    FUN_010bbd80();
    param_1 = *(undefined8 **)((int)register0x00000008 + 0x10);
  }
  *(undefined8 *)((int)register0x00000008 + -0xa0) = in_x30;
  *(undefined8 *)((int)register0x00000008 + -0xa8) = in_x29;
  *(undefined8 **)((int)register0x00000008 + 8) = param_1;
  uVar1 = param_1[1];
  *(undefined8 *)((int)register0x00000008 + -0x18) = *param_1;
  *(undefined8 *)((int)register0x00000008 + -0x10) = uVar1;
  uVar1 = param_1[3];
  *(undefined8 *)((int)register0x00000008 + -0x28) = param_1[2];
  *(undefined8 *)((int)register0x00000008 + -0x20) = uVar1;
  uVar1 = param_1[5];
  *(undefined8 *)((int)register0x00000008 + -0x38) = param_1[4];
  *(undefined8 *)((int)register0x00000008 + -0x30) = uVar1;
  uVar1 = param_1[7];
  *(undefined8 *)((int)register0x00000008 + -0x48) = param_1[6];
  *(undefined8 *)((int)register0x00000008 + -0x40) = uVar1;
  uVar1 = param_1[8];
  *(undefined8 *)((int)register0x00000008 + -0x98) =
       *(undefined8 *)((int)register0x00000008 + -0x18);
  *(undefined8 *)((int)register0x00000008 + -0x90) =
       *(undefined8 *)((int)register0x00000008 + -0x10);
  *(undefined8 *)((int)register0x00000008 + -0x88) =
       *(undefined8 *)((int)register0x00000008 + -0x28);
  *(undefined8 *)((int)register0x00000008 + -0x80) =
       *(undefined8 *)((int)register0x00000008 + -0x20);
  *(undefined8 *)((int)register0x00000008 + -0x78) =
       *(undefined8 *)((int)register0x00000008 + -0x38);
  *(undefined8 *)((int)register0x00000008 + -0x70) =
       *(undefined8 *)((int)register0x00000008 + -0x30);
  *(undefined8 *)((int)register0x00000008 + -0x68) =
       *(undefined8 *)((int)register0x00000008 + -0x48);
  *(undefined8 *)((int)register0x00000008 + -0x60) =
       *(undefined8 *)((int)register0x00000008 + -0x40);
  auVar2 = FUN_01c107c0(uVar1);
  *(undefined1 (*) [12])(*(int *)((int)register0x00000008 + 0x10) + 0x48) = auVar2;
  return;
}


