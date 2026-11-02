// proxylibxray_XRayPoint_CoreStopLoop @ 01c6df40 size=88
// callers:
//   Entry Point ?
//   01c6f550 Java_libxray_XRayPoint_coreStopLoop

undefined4 proxylibxray_XRayPoint_CoreStopLoop(dword param_1)

{
  undefined8 uVar1;
  undefined8 in_x20;
  uint local_20 [2];
  undefined4 uStack_c;
  
  uStack_c = (undefined4)((uint)in_x20 >> 0x20);
  uVar1 = _cgo_wait_runtime_init_done();
  local_20[0] = (uint)param_1;
  crosscall2(_cgoexp_5994d4b84130_proxylibxray_XRayPoint_CoreStopLoop,local_20,8,uVar1);
  _cgo_release_context(uVar1);
  return uStack_c;
}


