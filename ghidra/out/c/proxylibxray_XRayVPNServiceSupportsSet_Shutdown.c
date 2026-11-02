// proxylibxray_XRayVPNServiceSupportsSet_Shutdown @ 01c6e440 size=88
// callers:
//   Entry Point ?
//   01c6fcf0 Java_libxray_Libxray_00024proxyXRayVPNServiceSupportsSet_shutdown

undefined8 proxylibxray_XRayVPNServiceSupportsSet_Shutdown(dword param_1)

{
  undefined8 uVar1;
  undefined8 in_x20;
  uint local_28 [3];
  undefined8 local_10;
  
  local_10 = in_x20;
  uVar1 = _cgo_wait_runtime_init_done();
  local_28[1] = 0;
  local_28[0] = (uint)param_1;
  crosscall2(_cgoexp_5994d4b84130_proxylibxray_XRayVPNServiceSupportsSet_Shutdown,local_28,0x10,
             uVar1);
  _cgo_release_context(uVar1);
  return local_10;
}


