// proxylibxray__MeasureOutboundDelayWithType @ 01c6e860 size=172
// callers:
//   Entry Point ?
//   01c6f268 Java_libxray_Libxray_measureOutboundDelayWithType

undefined1  [16]
proxylibxray__MeasureOutboundDelayWithType
          (undefined8 param_1,undefined8 param_2,undefined8 param_3,undefined8 param_4,
          undefined8 param_5,undefined8 param_6,undefined8 param_7,undefined8 param_8)

{
  undefined8 uVar1;
  undefined8 in_x28;
  undefined8 in_x30;
  undefined1 auVar2 [16];
  undefined8 local_b0;
  undefined8 uStack_a8;
  undefined8 local_a0;
  undefined8 uStack_98;
  undefined8 local_90;
  undefined8 uStack_88;
  undefined8 local_80;
  undefined8 uStack_78;
  undefined8 local_68;
  undefined8 local_60;
  undefined8 local_58;
  undefined4 local_50;
  undefined4 uStack_4c;
  
  local_50 = (undefined4)in_x28;
  uStack_4c = (undefined4)((uint)in_x28 >> 0x20);
  local_58 = in_x30;
  uVar1 = _cgo_wait_runtime_init_done();
  local_68 = 0;
  local_60 = 0;
  local_b0 = param_1;
  uStack_a8 = param_2;
  local_a0 = param_3;
  uStack_98 = param_4;
  local_90 = param_5;
  uStack_88 = param_6;
  local_80 = param_7;
  uStack_78 = param_8;
  crosscall2(_cgoexp_5994d4b84130_proxylibxray__MeasureOutboundDelayWithType,&local_b0,0x54,uVar1);
  _cgo_release_context(uVar1);
  auVar2._8_4_ = local_50;
  auVar2._0_8_ = local_58;
  auVar2._12_4_ = 0;
  return auVar2;
}


