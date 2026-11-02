// proxylibxray__NewXRayPoint @ 01c6e90c size=104
// callers:
//   Entry Point ?
//   01c6f2e0 Java_libxray_Libxray_newXRayPoint
//   01c6f430 Java_libxray_XRayPoint__1_1NewXRayPoint

undefined4 proxylibxray__NewXRayPoint(undefined4 param_1,byte param_2)

{
  undefined8 uVar1;
  undefined8 in_x21;
  undefined4 local_34;
  uint local_30;
  undefined4 uStack_1c;
  
  uStack_1c = (undefined4)((uint)in_x21 >> 0x20);
  uVar1 = _cgo_wait_runtime_init_done();
  local_30 = (uint)param_2;
  local_34 = param_1;
  crosscall2(_cgoexp_5994d4b84130_proxylibxray__NewXRayPoint,&local_34,0xc,uVar1);
  _cgo_release_context(uVar1);
  return uStack_1c;
}


