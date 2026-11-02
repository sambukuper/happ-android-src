// proxylibxray__MeasureOutboundDelay @ 01c6e7dc size=132
// callers:
//   Entry Point ?
//   01c6f180 Java_libxray_Libxray_measureOutboundDelay

undefined1  [16]
proxylibxray__MeasureOutboundDelay
          (undefined8 param_1,undefined8 param_2,undefined8 param_3,undefined8 param_4,
          undefined8 param_5)

{
  undefined8 uVar1;
  undefined8 in_x24;
  undefined8 in_x30;
  undefined1 auVar2 [16];
  undefined8 local_70;
  undefined8 uStack_68;
  undefined8 local_60;
  undefined8 uStack_58;
  undefined8 local_50;
  undefined8 local_48;
  undefined8 local_40;
  undefined8 local_38;
  undefined4 local_30;
  undefined4 uStack_2c;
  
  local_30 = (undefined4)in_x24;
  uStack_2c = (undefined4)((uint)in_x24 >> 0x20);
  local_38 = in_x30;
  uVar1 = _cgo_wait_runtime_init_done();
  local_48 = 0;
  local_40 = 0;
  local_70 = param_1;
  uStack_68 = param_2;
  local_60 = param_3;
  uStack_58 = param_4;
  local_50 = param_5;
  crosscall2(_cgoexp_5994d4b84130_proxylibxray__MeasureOutboundDelay,&local_70,0x34,uVar1);
  _cgo_release_context(uVar1);
  auVar2._8_4_ = local_30;
  auVar2._0_8_ = local_38;
  auVar2._12_4_ = 0;
  return auVar2;
}


