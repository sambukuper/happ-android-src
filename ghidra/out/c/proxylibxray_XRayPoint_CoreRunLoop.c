// proxylibxray_XRayPoint_CoreRunLoop @ 01c6de50 size=112
// callers:
//   Entry Point ?
//   01c6f474 Java_libxray_XRayPoint_coreRunLoop

uint proxylibxray_XRayPoint_CoreRunLoop(dword param_1,undefined8 param_2,undefined8 param_3)

{
  undefined8 uVar1;
  uint in_x22;
  uint local_48;
  undefined8 uStack_40;
  undefined8 uStack_38;
  undefined8 local_30;
  uint local_20;
  
  local_20 = in_x22;
  uVar1 = _cgo_wait_runtime_init_done();
  local_30 = 0;
  local_48 = (uint)param_1;
  uStack_40 = param_2;
  uStack_38 = param_3;
  crosscall2(_cgoexp_5994d4b84130_proxylibxray_XRayPoint_CoreRunLoop,&local_48,0x1c,uVar1);
  _cgo_release_context(uVar1);
  return local_20 & 0xffffffff;
}


