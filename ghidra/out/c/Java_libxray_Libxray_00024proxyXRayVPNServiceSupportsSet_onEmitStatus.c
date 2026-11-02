// Java_libxray_Libxray_00024proxyXRayVPNServiceSupportsSet_onEmitStatus @ 01c6fbe4 size=80
// callers:
//   Entry Point ?

undefined8
Java_libxray_Libxray_00024proxyXRayVPNServiceSupportsSet_onEmitStatus
          (undefined8 param_1,undefined8 param_2,undefined8 param_3,undefined8 param_4)

{
  dword dVar1;
  undefined8 uVar2;
  undefined8 in_x21;
  undefined8 in_x22;
  undefined1 auVar3 [16];
  uint uStack_58;
  undefined8 uStack_50;
  undefined1 auStack_48 [16];
  undefined8 uStack_38;
  undefined8 local_30;
  undefined8 uStack_28;
  undefined8 local_20;
  undefined8 uStack_18;
  
  local_20 = in_x22;
  uStack_18 = in_x21;
  dVar1 = go_seq_to_refnum_go();
  auVar3 = go_seq_from_java_string(param_1,param_4);
  local_30 = local_20;
  uStack_28 = uStack_18;
  uVar2 = _cgo_wait_runtime_init_done();
  uStack_58 = (uint)dVar1;
  uStack_38 = 0;
  uStack_50 = param_3;
  auStack_48 = auVar3;
  crosscall2(_cgoexp_5994d4b84130_proxylibxray_XRayVPNServiceSupportsSet_OnEmitStatus,&uStack_58,
             0x28,uVar2);
  _cgo_release_context(uVar2);
  return uStack_28;
}


