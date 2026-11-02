// proxylibxray_XRayPoint_MeasureDelay @ 01c6df98 size=156
// callers:
//   Entry Point ?
//   01c6f5f0 Java_libxray_XRayPoint_measureDelay

undefined1  [16]
proxylibxray_XRayPoint_MeasureDelay
          (dword param_1,undefined8 param_2,undefined8 param_3,undefined8 param_4,undefined8 param_5
          ,undefined8 param_6)

{
  undefined8 uVar1;
  undefined8 in_x25;
  undefined8 in_x30;
  undefined1 auVar2 [16];
  uint local_88;
  undefined8 uStack_80;
  undefined8 uStack_78;
  undefined8 local_70;
  undefined8 local_68;
  undefined8 uStack_60;
  undefined8 uStack_58;
  undefined8 local_50;
  undefined8 local_48;
  undefined4 local_40;
  undefined4 uStack_3c;
  
  local_40 = (undefined4)in_x25;
  uStack_3c = (undefined4)((uint)in_x25 >> 0x20);
  local_48 = in_x30;
  uVar1 = _cgo_wait_runtime_init_done();
  uStack_58 = 0;
  local_50 = 0;
  local_88 = (uint)param_1;
  uStack_80 = param_2;
  uStack_78 = param_3;
  local_70 = param_4;
  local_68 = param_5;
  uStack_60 = param_6;
  crosscall2(_cgoexp_5994d4b84130_proxylibxray_XRayPoint_MeasureDelay,&local_88,0x3c,uVar1);
  _cgo_release_context(uVar1);
  auVar2._8_4_ = local_40;
  auVar2._0_8_ = local_48;
  auVar2._12_4_ = 0;
  return auVar2;
}


