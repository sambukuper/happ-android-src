// proxylibxray_XRayVPNServiceSupportsSet_OnEmitStatus @ 01c6e3c0 size=128
// callers:
//   Entry Point ?
//   01c6fc30 Java_libxray_Libxray_00024proxyXRayVPNServiceSupportsSet_onEmitStatus

undefined8
proxylibxray_XRayVPNServiceSupportsSet_OnEmitStatus
          (dword param_1,undefined8 param_2,undefined8 param_3,undefined8 param_4)

{
  undefined8 uVar1;
  undefined8 in_x30;
  uint local_68;
  undefined8 uStack_60;
  undefined8 uStack_58;
  undefined8 local_50;
  undefined8 uStack_48;
  undefined8 local_38;
  
  local_38 = in_x30;
  uVar1 = _cgo_wait_runtime_init_done();
  local_68 = (uint)param_1;
  uStack_48 = 0;
  uStack_60 = param_2;
  uStack_58 = param_3;
  local_50 = param_4;
  crosscall2(_cgoexp_5994d4b84130_proxylibxray_XRayVPNServiceSupportsSet_OnEmitStatus,&local_68,0x28
             ,uVar1);
  _cgo_release_context(uVar1);
  return local_38;
}


