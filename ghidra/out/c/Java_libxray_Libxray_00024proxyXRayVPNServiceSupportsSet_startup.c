// Java_libxray_Libxray_00024proxyXRayVPNServiceSupportsSet_startup @ 01c6fd68 size=20
// callers:
//   Entry Point ?

undefined8 Java_libxray_Libxray_00024proxyXRayVPNServiceSupportsSet_startup(void)

{
  dword dVar1;
  undefined8 uVar2;
  undefined8 in_x20;
  undefined8 in_x30;
  uint uStack_20;
  undefined8 uStack_18;
  undefined8 uStack_8;
  
  uStack_8 = in_x30;
  dVar1 = go_seq_to_refnum_go();
  uStack_18 = uStack_8;
  uStack_8 = in_x20;
  uVar2 = _cgo_wait_runtime_init_done();
  uStack_18 = 0;
  uStack_20 = (uint)dVar1;
  crosscall2(_cgoexp_5994d4b84130_proxylibxray_XRayVPNServiceSupportsSet_Startup,&uStack_20,0x10,
             uVar2);
  _cgo_release_context(uVar2);
  return uStack_8;
}


