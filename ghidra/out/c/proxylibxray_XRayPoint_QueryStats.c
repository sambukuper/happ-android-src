// proxylibxray_XRayPoint_QueryStats @ 01c6e034 size=136
// callers:
//   Entry Point ?
//   01c6f6a8 Java_libxray_XRayPoint_queryStats

undefined8
proxylibxray_XRayPoint_QueryStats
          (dword param_1,undefined8 param_2,undefined8 param_3,undefined8 param_4,undefined8 param_5
          )

{
  undefined8 uVar1;
  undefined8 in_x24;
  uint local_68;
  undefined8 uStack_60;
  undefined8 uStack_58;
  undefined8 local_50;
  undefined8 local_48;
  undefined8 uStack_40;
  undefined8 local_30;
  
  local_30 = in_x24;
  uVar1 = _cgo_wait_runtime_init_done();
  uStack_40 = 0;
  local_68 = (uint)param_1;
  uStack_60 = param_2;
  uStack_58 = param_3;
  local_50 = param_4;
  local_48 = param_5;
  crosscall2(_cgoexp_5994d4b84130_proxylibxray_XRayPoint_QueryStats,&local_68,0x30,uVar1);
  _cgo_release_context(uVar1);
  return local_30;
}


