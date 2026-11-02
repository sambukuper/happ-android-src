// proxylibxray_XRayPoint_QueryStatsCustom @ 01c6e0bc size=156
// callers:
//   Entry Point ?
//   01c6f740 Java_libxray_XRayPoint_queryStatsCustom

undefined8
proxylibxray_XRayPoint_QueryStatsCustom
          (dword param_1,undefined8 param_2,undefined8 param_3,undefined8 param_4,undefined8 param_5
          ,undefined8 param_6,undefined8 param_7)

{
  undefined8 uVar1;
  undefined8 in_x26;
  uint local_88;
  undefined8 uStack_80;
  undefined8 uStack_78;
  undefined8 local_70;
  undefined8 local_68;
  undefined8 uStack_60;
  undefined8 uStack_58;
  undefined8 local_50;
  undefined8 local_40;
  
  local_40 = in_x26;
  uVar1 = _cgo_wait_runtime_init_done();
  local_50 = 0;
  local_88 = (uint)param_1;
  uStack_80 = param_2;
  uStack_78 = param_3;
  local_70 = param_4;
  local_68 = param_5;
  uStack_60 = param_6;
  uStack_58 = param_7;
  crosscall2(_cgoexp_5994d4b84130_proxylibxray_XRayPoint_QueryStatsCustom,&local_88,0x40,uVar1);
  _cgo_release_context(uVar1);
  return local_40;
}


