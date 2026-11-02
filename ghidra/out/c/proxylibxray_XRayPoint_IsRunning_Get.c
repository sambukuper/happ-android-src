// proxylibxray_XRayPoint_IsRunning_Get @ 01c6dd4c size=88
// callers:
//   Entry Point ?
//   01c6f988 Java_libxray_XRayPoint_getIsRunning

undefined1 proxylibxray_XRayPoint_IsRunning_Get(dword param_1)

{
  undefined8 uVar1;
  undefined8 in_x20;
  uint local_20 [2];
  undefined1 uStack_c;
  
  uStack_c = (undefined1)((uint)in_x20 >> 0x20);
  uVar1 = _cgo_wait_runtime_init_done();
  local_20[0] = (uint)param_1;
  crosscall2(_cgoexp_5994d4b84130_proxylibxray_XRayPoint_IsRunning_Get,local_20,5,uVar1);
  _cgo_release_context(uVar1);
  return uStack_c;
}


